package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero01 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numero02 = entrada.nextInt();

        System.out.println("Resultado da soma: " + (numero01 + numero02));
    }

}
