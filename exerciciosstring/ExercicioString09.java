package exerciciosstring;


import java.util.Scanner;

public class ExercicioString09 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = entrada.nextLine();

        String fraseFinal = frase.replace(" ", "");
        System.out.println("Sua frase sem espaços: " + fraseFinal);
    }

}
