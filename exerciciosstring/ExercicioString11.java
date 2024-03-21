package exerciciosstring;


import java.util.Scanner;

public class ExercicioString11 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = entrada.nextLine();

                char letra = ' ';
                int quantidade = 0;
                int quantasVezesRepetiu = 0;
                char letraQueMaisApareceu = ' ';

                for (int i = 0; i < palavra.length(); i++) {
                    char letraAtual = palavra.charAt(i);

                    if (letraAtual == letra) {
                        quantidade++;
                    } else {
                        quantidade = 1;
                        letra = letraAtual;
                    }
                    if (quantidade > quantasVezesRepetiu) {
                        quantasVezesRepetiu = quantidade;
                        letraQueMaisApareceu = letra;
                    }
                }
                System.out.println("A maior sequência é de " + "'" + letraQueMaisApareceu + "'" + " com uma sequencia de: " + quantasVezesRepetiu+ " caracteres.");
    }

}
