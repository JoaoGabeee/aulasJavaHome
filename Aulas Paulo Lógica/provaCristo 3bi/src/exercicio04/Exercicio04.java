package exercicio04;

import console.Console;

public class Exercicio04 {

	public static void main(String[] args) {

		Console console = new Console();

		int[] vetor1 = new int[20];
		int[] vetor2 = new int[20];
		int[] vetor3 = new int[20];

		String resultadoVetor1 = "";
		for (int i = 0; i < vetor1.length; i++) {
			vetor1[i] = console.readInt("Digite um valor para o indicie " + i + " do vetor1");
			resultadoVetor1 += vetor1[i] + ", ";
		}

		String resultadoVetor2 = "";
		for (int i = 0; i < vetor2.length; i++) {
			vetor2[i] = console.readInt("Digite um valor para o indicie " + i + " do vetor2");
			resultadoVetor2 += vetor2[i] + ", ";
		}

		String resultadoVetor3 = "";
		for (int i = 0; i < vetor3.length; i++) {
			vetor3[i] = vetor1[i] * vetor2[i];
			resultadoVetor3 += vetor3[i] + ", ";
		}

		System.out.println("Vetor1: " + resultadoVetor1);
		System.out.println("Vetor2: " + resultadoVetor2);
		System.out.println("Vetor3: " + resultadoVetor3);
	}

}
