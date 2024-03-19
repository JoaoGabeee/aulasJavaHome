package exerciciosstring;


import java.util.Scanner;

public class ExercicioString04 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String palavraOuFrase = entrada.nextLine();

        palavraOuFrase = palavraOuFrase.toLowerCase();

        System.out.println(palavraOuFrase);

    }
}
