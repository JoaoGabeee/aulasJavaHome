package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é sua altura? ");
        double altura = entrada.nextDouble();

        System.out.println("Seu peso ideal é: " + ((72.7*altura) - 58));
    }

}
