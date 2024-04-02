package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath21 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int quantidadeDeInteirosEntreOsLimites = 0;
        int somaDosIntervalos = 0;
        int quantidadeDeImparesEntreOsIntervalos = 0;

        System.out.println("Qual é o limite inferior?");
        int limiteInferior = entrada.nextInt();

        System.out.println("Qual é o limite superior?");
        int limiteSuperior = entrada.nextInt();

        if (limiteInferior < limiteSuperior) {

            for (int i = limiteInferior; i < limiteSuperior + 1; i++) {
                somaDosIntervalos += i;
                quantidadeDeInteirosEntreOsLimites++;

                if (numeroPar(i).equals("Impar")) {
                    quantidadeDeImparesEntreOsIntervalos++;
                }

            }
            System.out.println("Soma dos valores entre os limites " + limiteInferior + " e " + limiteSuperior + " é: " + somaDosIntervalos);
            System.out.println("Quantidade de inteiros entre os limites " + limiteInferior + " e " + limiteSuperior + " é " + quantidadeDeInteirosEntreOsLimites);
            for (int i = limiteInferior; i < limiteSuperior + 1; i++) {
                System.out.println("O número " + i + " é " + numeroPar(i));
            }
            System.out.println("Entre os intervalos " + limiteInferior + " e " + limiteSuperior + " temos " + quantidadeDeImparesEntreOsIntervalos + " números ímpares.");
        } else {
            System.out.println("O limite inferior não pode ser maior que o superior.");
        }
    }

    public static String numeroPar(int numero) {

        if (numero % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
    }

}
