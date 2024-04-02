package exerciciosmath;


import java.util.Scanner;
public class ExercicioMath04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a a primeira nota?");
        double nota01 = entrada.nextDouble();

        System.out.println("Qual a segunda nota?");
        double nota02 = entrada.nextDouble();

        System.out.println("Qual a terceira nota?");
        double nota03 = entrada.nextDouble();

        System.out.println("A média é: " + (nota01 + nota02 + nota03) / 3);
    }

}
