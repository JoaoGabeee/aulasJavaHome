package exercicio05;

import java.util.Random;

import console.Console;

public class Exercicio05 {

	public static void main(String[] args) {

		Console console = new Console();

		Random random = new Random();

		int[] vetorSorteio = new int[20];
		int[] vetorPalpite = new int[20];

		String resultadoVetorSorteio = "";
		for (int i = 0; i < vetorSorteio.length; i++) {
			vetorSorteio[i] = random.nextInt(1, 101);
			resultadoVetorSorteio += vetorSorteio[i] + " ";
		}

		String resultadoVetorPalpite = "";
		for (int i = 0; i < vetorPalpite.length; i++) {
			vetorPalpite[i] = console.readInt("Digite um valor para o indice " + i);
			resultadoVetorPalpite += vetorPalpite[i] + " ";
		}

		String numerosAcertados = "";
		for (int i = 0; i < vetorSorteio.length; i++) {

			for (int j = 0; j < vetorPalpite.length; j++) {

				if (vetorSorteio[i] == vetorPalpite[j]) {
					numerosAcertados += vetorPalpite[j] + " ";
				}

			}
		}
		System.out.println("Sorteio: " + resultadoVetorSorteio);
		System.out.println("Seu palpite: " + resultadoVetorPalpite);
		System.out.println("Voce acertou os numeros: " + numerosAcertados);
		
	}

}
