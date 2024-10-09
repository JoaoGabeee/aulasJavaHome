package main;

import org.apache.log4j.BasicConfigurator;

import console.Console;

public class ProgramaPrincipal {

	private Console console;
	private final static int GERENCIAR_PRODUTO = 0;
	private final static int GERENCIAR_USUARIO = 1;
	private MenuProduto menuProduto;
	private MenuUsuario menuUsuario;
	
	public ProgramaPrincipal() {
		console = new Console();
		menuProduto = new MenuProduto();
		menuUsuario = new MenuUsuario();
	}
	
	public static void main(String[] args) {
		BasicConfigurator.configure();
		new ProgramaPrincipal().executar();
	}

	private void executar() {

		while (true) {

			menuPrincipal();
			int opcao = console.readInt();
			if (opcao == GERENCIAR_PRODUTO){
				menuProduto.executar();
			} else if (opcao == GERENCIAR_USUARIO){
				menuUsuario.executar();
			}

		}
	}

 	private void menuPrincipal() {
		System.out.printf("[%d]Gerenciar produtos %n", GERENCIAR_PRODUTO);
		System.out.printf("[%d]Gerenciar usuarios %n", GERENCIAR_USUARIO);
	}
}
