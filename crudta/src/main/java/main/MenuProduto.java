package main;

import console.Console;
import produto.GerenciarProduto;
import produto.Produto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class MenuProduto {

    private Console console;
    private final static int CADASTRAR = 1;
    private final static int EDITAR = 2;
    private final static int LISTAR = 3;
    private final static int REMOVER = 4;
    private final static int SAIR = 9;
    private GerenciarProduto gerenciarProduto;

    public MenuProduto() {
        console = new Console();
        gerenciarProduto = new GerenciarProduto();
    }

    public void executar() {
        int opcao = 0;

        do {
            mostrarMenu();

            opcao = console.readInt();

            if (opcao == CADASTRAR) {
                System.out.println("Cadastrar produto");
                cadastrar();
            } else if (opcao == EDITAR) {
                System.out.println("Editar produto");
                editar();
            } else if (opcao == LISTAR) {
                System.out.println("Listar produto");
                listar();
            } else if (opcao == REMOVER) {
                System.out.println("Remover produto");
                remover();
            }

        } while (opcao != SAIR);

        gerenciarProduto.fecharConexao();
    }

    private void editar() {
        System.out.println("Digite o ID para editar: ");

        int id = console.readInt();

        Produto produto = gerenciarProduto.findById(id);

        lerDadosProduto(produto);

        gerenciarProduto.update(produto);

        System.out.println("Produto atualizado com sucesso");
    }

    private void lerDadosProduto(Produto usuario) {
        String nome = console.readLine("Digite o nome: ");
        String marca = console.readLine("Digite a marca: ");
        LocalDate dataFabricacao = console.readLocalDate("Digite a data de fabricação: ");
        BigDecimal preco = console.readBigDecimal("Digite o preço: ");

        usuario.setNome(nome);
        usuario.setMarca(marca);
        usuario.setDataFabricacao(dataFabricacao);
        usuario.setPreco(preco);
    }

    private void remover() {
        System.out.println("Digite o id para remover: ");

        int idRemover = console.readInt();

        Produto usuario = gerenciarProduto.findById(idRemover);
        if ( usuario == null ) {
            System.out.println("ID informado não existe");
        }
        else {
            System.out.println("ID: " + usuario.getId());
            System.out.println("Nome: " + usuario.getNome());
            System.out.println("Preço: " + usuario.getPreco());

            System.out.println("Confirma a exclusão: 0 - sim, 1 - não");
            int opcao = console.readInt();

            if ( opcao == 0 ) {
                gerenciarProduto.remove(idRemover);
                System.out.println("OK, removido com sucesso");
            }
            else {
                System.out.println("Cancelar");
            }
        }
    }

    private void listar() {
        List<Produto> lista = gerenciarProduto.list();
        for (Produto usuario : lista) {
            System.out.println("\nID: " + usuario.getId());
            System.out.println("Nome: " + usuario.getNome());
        }

    }

    private void cadastrar() {
        Produto produto = new Produto();

        lerDadosProduto(produto);

        gerenciarProduto.create(produto);
        System.out.println("Usuário cadastro com sucesso");
    }

    private void mostrarMenu() {
        System.out.println("\n------ SUPER CRUD ------\n");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Editar produto");
        System.out.println("3 - Listar produto");
        System.out.println("4 - Remover produto");
        System.out.println("9 - Sair");
    }


}
