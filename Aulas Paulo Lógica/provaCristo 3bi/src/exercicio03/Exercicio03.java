package exercicio03;

import console.Console;

public class Exercicio03 {

	public static void main(String[] args) {
		Console console = new Console();

		int valorA = console.readInt("Digite o valor A");
		int valorB = console.readInt("Digite o valor B");
		int valorC = console.readInt("Digite o valor C");
		int valorD = console.readInt("Digite o valor D");

		long valorR = Math.round(Math.pow(valorA, valorC) + Math.pow(valorD, valorA) + Math.sqrt(valorD * valorB));

		System.out.println("Resultado: " + valorR);
	}

}
