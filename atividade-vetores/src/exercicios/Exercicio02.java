package exercicios;

public class Exercicio02 {

    public static void main(String[] args) {

        int[] arrayNumerosImpares = new int[10];

        for (int i = 0; i < arrayNumerosImpares.length; i++) {
            arrayNumerosImpares[i] = 2 * i + 1;
            System.out.println(arrayNumerosImpares[i]);
        }

    }

}
