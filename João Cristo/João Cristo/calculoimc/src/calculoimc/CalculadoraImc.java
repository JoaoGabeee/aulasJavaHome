package calculoimc;

import java.util.Scanner;

public class CalculadoraImc {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Qual é o seu peso?");
		double peso = entrada.nextDouble();

		System.out.println("Qual é sua altura?");
		double altura = entrada.nextDouble();

		double resultadoImc = peso / (altura * altura);

		if (resultadoImc <= 18.5) {
			System.out.println("Abaixo do peso");
		} else if (resultadoImc >= 18.6 && resultadoImc <= 24.9) {
			System.out.println("Peso ideal(parabéns)");
		} else if (resultadoImc >= 25.0 && resultadoImc <= 29.9) {
			System.out.println("Levemente acima do peso");
		} else if (resultadoImc >= 30.0 && resultadoImc <= 34.9) {
			System.out.println("Obesidade grau I");
		} else if (resultadoImc >= 35.0 && resultadoImc <= 39.9) {
			System.out.println("Obesidade grau II(severa)");
		} else {

			System.out.println("Obesidade grau III(mórbida)");
		}
	}

}
