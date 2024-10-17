package exercicios;

import console.Console;

public class Exercicio03 {

    public static void main(String[] args) {
        Console console = new Console();

        int[] arrayMaior = new int[16];
        int[] arrayMenor = new int[8];

        for (int i = 0; i < arrayMaior.length; i++) {
            arrayMaior[i] = console.readInt("Digite o valor para o indice " + i + " do vetor");
        }
        String valoresArrayAntes = "";
        for (int i = 0; i < arrayMaior.length; i++){
            valoresArrayAntes += " " + arrayMaior[i];
        }
        for (int i = 0; i < arrayMenor.length; i++) {
            arrayMenor[i] = arrayMaior[i];
            arrayMaior[i] = arrayMaior[i + 8];
            arrayMaior[i + 8] = arrayMenor[i];
        }
        String valoresArrayDepois = "";
        for (int i = 0; i < arrayMaior.length; i++){
            valoresArrayDepois += " " + arrayMaior[i];
        }

        System.out.println("Valores digitados: " + valoresArrayAntes);
        System.out.println("Valores depois: " + valoresArrayDepois);
    }

}
