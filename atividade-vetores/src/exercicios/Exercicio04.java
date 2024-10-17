package exercicios;

import console.Console;

public class Exercicio04 {

    public static void main(String[] args) {
        Console console = new Console();

        int[] arrayPosicoes = new int[20];

        for (int i = 0; i < arrayPosicoes.length; i++) {
            arrayPosicoes[i] = console.readInt("Digite o valor para o vetor com o indicie " + i );
        }
    }

}
