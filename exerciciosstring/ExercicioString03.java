package exerciciosstring;


import java.util.Scanner;

public class ExercicioString03 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine() + " ";

        frase = frase.toLowerCase();
        System.out.println("Frase: '" + frase + "'\nQuantas vezes cada letra apareceu: ");

        int quantasVezesAparaceu;

        for (char alfabeto = 'a'; alfabeto <= 'z'; alfabeto++) {
            quantasVezesAparaceu = frase.split(String.valueOf(alfabeto)).length - 1;
            System.out.println(alfabeto + ": " + quantasVezesAparaceu);
        }
    }

}