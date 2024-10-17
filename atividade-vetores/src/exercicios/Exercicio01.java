package exercicios;


import console.Console;

public class Exercicio01 {

    public static void main(String[] args) {
        Console console = new Console();

        int[] arrayPossicoes = new int[12];

        while (true) {

            for (int i = 0; i < arrayPossicoes.length; i++){
                arrayPossicoes[i] = console.readInt("Digite o valor para o indice " + i + " do vetor");
            }

            int posicaoX = console.readInt("Digite a posição X");
            int posicaoY = console.readInt("Digite a posição Y");

            if (posicaoX > arrayPossicoes.length && posicaoY > arrayPossicoes.length) {
                System.out.println("Posição invalida");
            }

            int soma = arrayPossicoes[--posicaoX] + arrayPossicoes[--posicaoY];
            System.out.println("A soma dos valores é:" + soma);
        }
    }

}
