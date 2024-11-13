package exerciciosstring;


import java.util.Scanner;
import java.util.StringTokenizer;

public class ExercicioString08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String palavra = entrada.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(palavra, " ");
        int quantidadeDePalavras = tokenizer.countTokens();

        System.out.println("Quantidade de palavras: " + quantidadeDePalavras);
        while (tokenizer.hasMoreTokens()) {

            for (int i = 0; i < quantidadeDePalavras; i++) {
                System.out.println("Palavra " + (i + 1) + ": " + tokenizer.nextToken());
            }
        }
    }

}
