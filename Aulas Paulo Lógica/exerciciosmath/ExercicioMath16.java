package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a medida do lado da caixa d'água(em metros)? ");
        double lado = entrada.nextDouble();

        double volume = Math.round(lado * lado * lado);

        System.out.println("O volume da caixa d'água é de: " + volume + "m³");

    }

}
