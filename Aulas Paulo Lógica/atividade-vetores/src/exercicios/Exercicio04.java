package exercicios;

import console.Console;

public class Exercicio04 {

    public static void main(String[] args) {
        Console console = new Console();

        int[] arrayPosicoes = new int[20];

        for (int i = 0; i < arrayPosicoes.length; i++) {
            arrayPosicoes[i] = console.readInt("Digite o valor para o vetor com o indicie " + i);
        }

        int buscarNumero = console.readInt("Digite o numero que deseja buscar no array");

        for (int i = 0; i < arrayPosicoes.length; i++) {

            if (arrayPosicoes[i] == buscarNumero) {
                System.out.println("Esse numero esta no indice: " + i);
            }

            }
            System.out.println("Numero não encontrado");
    }
}
