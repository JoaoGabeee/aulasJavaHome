package exercicios;

import console.Console;

public class Exercicio07 {

    public static void main(String[] args) {

        Console console = new Console();

        int[] array1 = new int[20];
        int[] array2 = new int[20];
        int[] array3 = new int[40];

        for (int i = 0; i < array1.length; i++) {
            array1[i] = console.readInt("Digite o valor para o primeiro vetor com indice: " + i);
        }

        for (int i = 0; i < array2.length; i++) {
            array2[i] = console.readInt("Digite o valor para o segundo vetor com indice: " + i);
        }

        for (int i = 0; i < array3.length; i++) {
            if ((i % 2) == 1) {
                array3[i] = array1[i];
            }
            else {
                array3[i] = array2[i];
            }
        }
    }

}
