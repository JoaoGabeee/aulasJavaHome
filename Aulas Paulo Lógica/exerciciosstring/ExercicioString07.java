package exerciciosstring;


import java.util.Scanner;

public class ExercicioString07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma frase/palavra: ");
        String palavraOuFrase = entrada.nextLine();

        String duasUltimasLetras = palavraOuFrase.substring(palavraOuFrase.length() -2);
        System.out.println(palavraOuFrase + duasUltimasLetras);
    }

}
