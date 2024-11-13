package exerciciosstring;


import java.util.Scanner;

public class ExercicioString10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        String[] palavras = frase.split(" ");
        StringBuilder fraseFinal = new StringBuilder();

        for (String palavra : palavras) {
            String palavraInvertida = invertedorDepalavras(palavra);

            fraseFinal.append(palavraInvertida).append(" ");
        }
        System.out.println(fraseFinal);
    }

    public static String invertedorDepalavras(String palavra) {

        StringBuilder palavraInvertida = new StringBuilder();

        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraInvertida.append(palavra.charAt(i));
        }
        return palavraInvertida.toString();
    }


}
