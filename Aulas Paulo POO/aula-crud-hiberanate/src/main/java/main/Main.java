package main;

import livro.GerenciadorLivro;
import livro.Livro;

import java.io.OutputStream;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final int ADICIONAR_LIVRO = 1;
    public static final int DELETAR_LIVRO = 2;
    public static final int LISTAR_LIVRO = 3;
    public static final int PESQUISAR_ID = 4;
    public static final int ATUALIZAR_LIVRO = 5;
    public static final int SAIR = 6;

    private Scanner entrada;
    private GerenciadorLivro gerenciadorLivro;

    public Main() {
        entrada = new Scanner(System.in);
        gerenciadorLivro = new GerenciadorLivro();
    }

    public static void main(String[] args) {

        new Main().executar();
    }

    public void executar() {
        while (true) {

            menu();

            int resposta = entrada.nextInt();
            if (resposta == ADICIONAR_LIVRO) {
                criarLivro();
            } else if (resposta == DELETAR_LIVRO) {
                deletarLivro();
            } else if (resposta == LISTAR_LIVRO) {
                listarLivros();
            } else if (resposta == PESQUISAR_ID) {
                pesquisarLivro();
            } else if (resposta == ATUALIZAR_LIVRO) {
                atualizarLivro();
            } else if (resposta == SAIR) {
                break;
            } else {
                System.out.println("Opção invalida!\nTente novamente...");
            }

        }
        gerenciadorLivro.fechar();
    }

    public void atualizarLivro() {
        System.out.println("Digite o id para atualizar");
        long id = entrada.nextLong();
        entrada.nextLine();
        Livro livro = gerenciadorLivro.findById(id);

        if (livro == null) {
            System.out.println("Id não encontrado");
            return;
        }

        System.out.println("Qual o novo titulo?");
        livro.setTitulo(entrada.nextLine());
        System.out.println("Qual o novo ISBN?");
        livro.setIsbn(entrada.nextLine());
        System.out.println("Qual a nova edição?");
        livro.setEdicao(entrada.nextLong());
        entrada.nextLine();
        System.out.println("Qual o novo ano?");
        livro.setAno(entrada.nextLong());
        entrada.nextLine();

        gerenciadorLivro.update(livro);
        System.out.println("Dados atualizados com sucesso!");
    }

    public void pesquisarLivro() {

        System.out.println("Qual o id deseja buscar?");
        long id = entrada.nextLong();
        entrada.nextLine();
        Livro livro = gerenciadorLivro.findById(id);

        if (livro == null) {
            System.out.println("Id não encontrado");
            return;
        }

        System.out.println(livro.getTitulo());
        System.out.println(livro.getIsbn());
        System.out.println(livro.getId());
        System.out.println(livro.getAno());

    }

    public void listarLivros() {

        List<Livro> livros = gerenciadorLivro.list();

        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
            System.out.println(livro.getIsbn());
            System.out.println(livro.getId());
            System.out.println(livro.getAno());
        }
    }

    public void deletarLivro() {
        System.out.println("Qual o id voce deseja deletar?");
        long id = entrada.nextLong();
        entrada.nextLine();
        Livro livro = gerenciadorLivro.findById(id);

        if (livro == null) {
            System.out.println("Id não encontrado.");
            return;
        }
        gerenciadorLivro.delete(livro);
        System.out.println("Livro deletado com sucesso.");

    }

    public void criarLivro() {
        Livro livro = new Livro();
        System.out.println("Qual o titulo do livro?");
        livro.setTitulo(entrada.nextLine());
        entrada.nextLine();
        System.out.println("Qual o isbn do livro?");
        livro.setIsbn(entrada.nextLine());
        System.out.println("Qual a edição?");
        livro.setEdicao(entrada.nextLong());
        entrada.nextLine();
        System.out.println("Qual o ano do livro?");
        livro.setAno(entrada.nextInt());
        entrada.nextLine();
        gerenciadorLivro.create(livro);

    }

    public void menu() {

        System.out.printf("[%d] Cadastrar livro %n", ADICIONAR_LIVRO);
        System.out.printf("[%d] Deletar livro %n", DELETAR_LIVRO);
        System.out.printf("[%d] Listar livro %n", LISTAR_LIVRO);
        System.out.printf("[%d} Pesquisar id %n", PESQUISAR_ID);
        System.out.printf("[%d] Atualizar livro %n", ATUALIZAR_LIVRO);
        System.out.println("Oque você deseja?");
    }

}
