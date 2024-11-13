package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath18 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a base do número? ");
        double base = entrada.nextDouble();

        System.out.println("Qual é o expoente");
        double expoente = entrada.nextDouble();

        System.out.println("O resultado da conta é: " + Math.pow(base, expoente));

    }

}
