package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath14 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero01 = entrada.nextInt();

        System.out.println("Digite mais um número inteiro: ");
        int numero02 = entrada.nextInt();

        if (numero01 > numero02) {
            System.out.println("O maior numero é o: " + numero01);
        } else if(numero01 < numero02){
            System.out.println("O maior numero é o: " + numero02);
        } else {
            System.out.println("Os números são iguais.");
        }

    }

}
