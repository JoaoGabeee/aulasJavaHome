package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a altura do quadrado? ");
        double alturaQuadrado = entrada.nextDouble();

        System.out.println("Qual a base do quadrado? ");
        double baseQuadrado = entrada.nextDouble();

        double areaQuadrado = alturaQuadrado*baseQuadrado;

        System.out.println("A area do seu quadrado é: " + areaQuadrado + "\nE o dobro da area dele é: " + areaQuadrado*2);

    }

}
