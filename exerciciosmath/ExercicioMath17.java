package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        while (true) {

            System.out.println("Digite um número par: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {

                System.out.println("A raiz quadrada de " + numero + " é " + Math.sqrt(numero));
                break;
            } else {
                System.out.println("O número não é par, tente de novo.");
            }
        }
    }

}
