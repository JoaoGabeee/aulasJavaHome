package principal;

import console.Console;

public class MenuPrincipal {

    private static final int GERENCIAR_PESSOA = 1;
    private static final int GERENCIAR_CARRO = 2;
    private static final int SAIR = 3;
    private Console console;
    private MenuPessoa menuPessoa;
    private MenuCarro menuCarro;

    public MenuPrincipal() {
        console = new Console();
        menuPessoa = new MenuPessoa();
        menuCarro = new MenuCarro();
    }

    public static void main(String[] args) {
        new MenuPrincipal().executar();
    }

    private void executar(){
        while (true) {

            menuPrincipal();
            int opcao = console.readInt();
            if (opcao == GERENCIAR_PESSOA) {
                menuPessoa.executar();
            } else if (opcao == GERENCIAR_CARRO) {
                menuCarro.executar();
            } else if (opcao == SAIR) {
                break;
            }
        }
    }

    private void menuPrincipal() {
        System.out.printf("[%d] Gerenciar Pessoa", GERENCIAR_PESSOA);
        System.out.printf("[%d] Gerenciar Carro", GERENCIAR_CARRO);
        System.out.printf("[%d] Sair");
    }

}
