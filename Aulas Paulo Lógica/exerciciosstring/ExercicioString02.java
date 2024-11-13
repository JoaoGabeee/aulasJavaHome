package exerciciosstring;


import java.util.Scanner;

public class ExercicioString02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavraOuFrase = entrada.nextLine();

        int quantasVezesAparaceu = palavraOuFrase.split("la", - 1).length - 1;

        System.out.println("A sílaba 'la' apareceu: " + quantasVezesAparaceu + " vezes na palavra/frase '" + palavraOuFrase + "'");
    }

}
