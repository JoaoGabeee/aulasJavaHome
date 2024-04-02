package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath10 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        pararRepeticao:
        while (true) {

            System.out.println("Você é: \n[h]Homem\n[m]Mulher");
            char homemOuMulher = entrada.next().charAt(0);

            System.out.println("Qual é sua altura? ");
            double altura = entrada.nextDouble();

            switch (homemOuMulher){

                case 'h' -> {
                    System.out.println("Seu peso ideal é: " + ((72.7 * altura) - 58));
                break pararRepeticao;
                }
                case 'm' -> {
                        System.out.println("Seu peso ideal é: " + ((62.1 * altura) - 58));
                break pararRepeticao;
                }
                default -> System.out.println("Tente novamente.");
            }
        }
    }

}
