package exercicios;

import console.Console;

public class Exercicio08 {

    public static void main(String[] args) {

        Console console = new Console();

        int[] arrayValores = new int[40];

        String mostrarResultado = "";
        for (int i = 0; i < arrayValores.length; i++) {
            arrayValores[i] = console.readInt("Digite o valor para o vetor com indice: " + i);

            arrayValores[i] = arrayValores[i++];
            mostrarResultado +=  arrayValores[i];
        }

        System.out.println(mostrarResultado);
    }

}
