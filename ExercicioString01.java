package exerciciosstring;


import java.util.Scanner;

public class ExercicioString01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        StringBuilder palavraFinal = new StringBuilder();

        System.out.println("Digite uma palavra: ");
        String palavra = entrada.next();

        for (int i = 0; i < palavra.length(); i++) {
            char c = palavra.charAt(i);
            palavraFinal.append(c);
            palavraFinal.append(c);

        }
        System.out.println("Palavra digitada: " + palavra);
        System.out.println("Palavra com caracteres duplicados: " + palavraFinal);
    }

}
