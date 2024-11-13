package exercicio02;

import console.Console;

public class Exercicio02 {

	public static void main(String[] args) {

		Console console = new Console();

		String palavra = console.readString("Digite uma palavra");
		int numero = console.readInt("Digite um numero");

		String palavraFinal = palavra;
		for (int i = 0; i < numero; i++) {
			System.out.println(palavraFinal);
			palavraFinal += " " + palavra;
		}
	}

}
