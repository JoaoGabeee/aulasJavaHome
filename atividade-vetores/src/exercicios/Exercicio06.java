package exercicios;

import console.Console;

public class Exercicio06 {

    public static void main(String[] args) {

        Console console = new Console();

        int[] arrayValores = new int[40];

        for (int i = 0; i <arrayValores.length; i++) {
            arrayValores[i] = console.readInt("Digite o valor para o vetor com indice: " + i);

            if (arrayValores[i] < 0) {
                arrayValores[i] = 0;
            }
        }
    }
}
