package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath02 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite algum caractere: ");
        char caractereDigitadaPeloUsuario = entrada.next().charAt(0);

        if (Character.isDigit(caractereDigitadaPeloUsuario)) {

            System.out.println("Você informou um número");
        } else {
            System.out.println("Você não informou um número");
        }
    }

}
