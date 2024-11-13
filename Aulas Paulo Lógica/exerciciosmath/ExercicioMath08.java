package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath08 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroInteiro01 = entrada.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numeroInteiro02 = entrada.nextInt();

        System.out.println("Digite um número real: ");
        double numeroReal = entrada.nextDouble();

        System.out.println("Primeiro número inteiro: " + numeroInteiro01 + "\nSegundo número inteiro: " + numeroInteiro02 + "\nNúmero real: " + numeroReal);

        int produtoDoDobroDoPrimeiroComMetadeeDoSegundo = (numeroInteiro01*2) + (numeroInteiro02/2);
        double somaDoTriploDoPrimeiroComOTerceiro = (numeroInteiro01*3) + numeroReal;
        double terceiroNumeroElevadoAoCubo = numeroReal*numeroReal*numeroReal;

        System.out.println("Produto do dobro do primeiro com metade do segundo: " + produtoDoDobroDoPrimeiroComMetadeeDoSegundo);
        System.out.println("Soma do triplo do primeiro com o terceiro: " + somaDoTriploDoPrimeiroComOTerceiro);
        System.out.println("Terceiro numero elevado ao cubo: " + terceiroNumeroElevadoAoCubo);

    }

}
