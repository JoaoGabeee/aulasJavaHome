package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos metros você deseja converter para cm?");
        int metros = entrada.nextInt();

        int centimetros = metros*100;

        System.out.println("Metros: " + metros + "\nCentimetros: " + centimetros);
    }

}
