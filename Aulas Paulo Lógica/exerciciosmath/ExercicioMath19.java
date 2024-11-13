package exerciciosmath;


import java.util.Random;
import java.util.Scanner;

public class ExercicioMath19 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Números: " + geradorBilhetes());

        pararRepeticao:
        while (true) {

            System.out.println("Gerar outro cartão?\n[s]Sim\n[n]Não");
            char simOuNao = entrada.next().charAt(0);

            switch (simOuNao) {

                case 's' -> System.out.println("Números: " + geradorBilhetes());
                case 'n' -> {
                    System.out.println("Até a próxima!");
                    break pararRepeticao;
                }
                default -> System.out.println("Tente de novo, não há essa opção.");
            }
        }
    }

    public static String geradorBilhetes() {

        Random aleatorio = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 6; i++) {
            stringBuilder.append(aleatorio.nextInt(60)).append(" - ");
        }

        stringBuilder.delete(stringBuilder.length() -2, stringBuilder.length() );
        return stringBuilder.toString();
    }

}
