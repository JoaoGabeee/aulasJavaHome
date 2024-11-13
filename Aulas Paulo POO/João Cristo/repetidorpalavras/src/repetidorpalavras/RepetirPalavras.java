package repetidorpalavras;

import java.util.Scanner;

public class RepetirPalavras {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite uma palavra");
		String palavra = entrada.nextLine();

		System.out.println("Digite um numero inteiro");
		int quantidadeRepeticoes = entrada.nextInt();

		String palavrasRepetidas = palavra;

		for (int i = 0; i < quantidadeRepeticoes; i++) {

			System.out.println(palavrasRepetidas);
			palavrasRepetidas += " " + palavra;

		}
	}

}
