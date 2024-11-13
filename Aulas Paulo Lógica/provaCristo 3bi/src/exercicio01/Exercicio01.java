package exercicio01;

import java.util.StringTokenizer;

import console.Console;

public class Exercicio01 {

	public static void main(String[] args) {

		Console console = new Console();

		String frase = console.readLine("Digite uma frase");

		StringTokenizer tokenizer = new StringTokenizer(frase);

		int quantidadeCaracteres = 0;
		for (int i = 0; i < frase.length(); i++) {
			quantidadeCaracteres++;
		}
		System.out.println("Quantidade de caracteres: " + quantidadeCaracteres);
		
		
		int quantidadePalavras = 0;
		for (int i = 0; i < tokenizer.countTokens(); i++) {
			quantidadePalavras++;
		}
		System.out.println("Quantidade de palavras: " + quantidadePalavras);
	}

}
