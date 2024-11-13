package main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import usuario.GerenciarUsuario;
import usuario.Usuario;
import console.Console;
import usuario.endereco.Endereco;

import java.util.List;

public class Main {

    public static final int ADICIONAR_USUARIO = 1;
    public static final int LISTAR_USUARIOS = 2;
    public static final int PESQUISAR_ID = 3;
    public static final int ATUALIZAR_USUARIO = 4;
    public static final int EXCLUIR_USUARIO = 5;
    public static final int SAIR = 6;
    private final EntityManagerFactory entityManagerFactory;
    private final EntityManager entityManager;
    private final Console console;
    private final GerenciarUsuario gerenciarUsuario;

    public Main() {
        entityManagerFactory = Persistence.createEntityManagerFactory("crud");
        entityManager = entityManagerFactory.createEntityManager();
        console = new Console();
        gerenciarUsuario = new GerenciarUsuario(entityManager);
    }

    public static void main(String[] args) {
        new Main().executar();
    }

    public void executar() {
        while (true) {
            mostrarMenu();
            System.out.print("Escolha uma opção: ");
            int escolha = console.readInt();

            if (escolha == ADICIONAR_USUARIO) {
                adicionarUsuario();
            } else if (escolha == LISTAR_USUARIOS) {
                listarUsuarios();
            } else if (escolha == PESQUISAR_ID) {
                pesquisarId();
            } else if (escolha == ATUALIZAR_USUARIO) {
                atualizarUsuario();
            } else if (escolha == EXCLUIR_USUARIO) {
                excluirUsuario();
            } else if (escolha == SAIR) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Por favor tente novamente...");
            }
        }

        gerenciarUsuario.fecharConexao();
        entityManagerFactory.close();
    }

    public void adicionarUsuario() {
        Usuario usuario = criarUsuario(new Usuario());

        gerenciarUsuario.create(usuario);
        System.out.println("Usuário adicionado com sucesso");
    }

    private Usuario criarUsuario(Usuario usuario) {
        String nome = console.readLine("Digite o nome do usuário: ");
        String email = console.readLine("Digite o e-mail do usuário: ");
        long cpf = console.readLong("Digite o cpf do usuário(apenas o número): ");
        String senha = console.readLine("Digite a senha do usuário: ");

        usuario.setNome(nome);
        usuario.setEmail(email);
        usuario.setCpf(cpf);
        usuario.setSenha(senha);
        lerDadosEndereco(usuario);
        return usuario;
    }

    private void lerDadosEndereco(Usuario usuario) {
        Endereco endereco = usuario.getEndereco();

        if (endereco == null) {
            endereco = new Endereco();
        }

        String logradouro = console.readLine("Digite o logradouro");
        String cep = console.readLine("Digite o CEP");
        String numero = console.readLine("Digite o numero");

        endereco.setLogadouro(logradouro);
        endereco.setCep(cep);
        endereco.setNumero(numero);

        usuario.setEndereco(endereco);
    }

    private void mostrarInformacoes(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("Não há usuários cadastrados");
            return;
        }

        for (Usuario usuario : usuarios) {
            mostrarInformacao(usuario);
        }
    }

    private void mostrarInformacao(Usuario usuario) {
        System.out.printf("ID: %d%n", usuario.getId());
        System.out.printf("Nome: %s%n", usuario.getNome());
        System.out.printf("E-Mail: %s%n", usuario.getEmail());
        System.out.printf("CPF: %d%n", usuario.getCpf());
    }

    public void listarUsuarios() {
        mostrarInformacoes(gerenciarUsuario.list());
    }

    public void pesquisarId() {
        long id = console.readLong("Digite o ID a ser pesquisado: ");

        Usuario usuario = gerenciarUsuario.findById(id);
        if (usuario == null) {
            System.out.println("Usuário não encontrado");
            return;
        }

        mostrarInformacao(usuario);
    }

    public void atualizarUsuario() {
        long id = console.readLong("Digite o id do usuário a ser atualizado: ");

        Usuario usuario = criarUsuario(gerenciarUsuario.findById(id));

        gerenciarUsuario.update(usuario);
        System.out.println("Usuário atualizado com sucesso");
    }

    public void excluirUsuario() {
        long id = console.readLong("Digite o id do usuário a ser excluído: ");

        Usuario usuario = gerenciarUsuario.findById(id);

        if (usuario == null) {
            System.out.println("O usuário solicitado não foi encontrado");
            return;
        }

        gerenciarUsuario.delete(usuario);
        System.out.println("Usuário excluído com sucesso");
    }

    public void mostrarMenu() {
        System.out.printf("[%d] Adicionar usuário%n", ADICIONAR_USUARIO);
        System.out.printf("[%d] Listar usuários%n", LISTAR_USUARIOS);
        System.out.printf("[%d] Pesquisar por ID%n", PESQUISAR_ID);
        System.out.printf("[%d] Atualizar usuário%n", ATUALIZAR_USUARIO);
        System.out.printf("[%d] Excluir usuário%n", EXCLUIR_USUARIO);
        System.out.printf("[%d] Sair%n", SAIR);
    }

}
