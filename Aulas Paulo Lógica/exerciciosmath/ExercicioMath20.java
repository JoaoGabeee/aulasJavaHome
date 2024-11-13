package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath20 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a medida do primeiro lado: ");
        double lado01 = entrada.nextDouble();

        System.out.println("Digite a medida do segundo lado: ");
        double lado02 = entrada.nextDouble();

        System.out.println("Digite a medida do terceiro lado: ");
        double lado03 = entrada.nextDouble();

        if (lado01 == lado02 && lado01 == lado03){
            System.out.println("É um triângulo Equilátero.");
        } else if (lado01 == lado02 || lado02 == lado03 || lado01 == lado03) {
            System.out.println("É um triângulo Isósceles");
        } else {
            System.out.println("É um triângulo Escaleno");
        }
    }

}
