package exerciciosstring;


import java.util.Scanner;

public class ExercicioString06 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra ou frase: ");
        String palavraOuFrase = entrada.nextLine();

        if (palavraOuFrase.contains(".")){
            System.out.println("A sua palavra/frase contém '.' nela");
        } else{
            System.out.println("A sua palavra/frase NÃO contém '.' nela");
        }
    }

}
