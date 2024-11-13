package exerciciosmath;


import java.util.Random;

public class ExercicioMath13 {

    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            System.out.println("Jogada " + i + ": " + dadoJogado());
        }
    }

    public static int dadoJogado(){

        Random aleatorio = new Random();

        return aleatorio.nextInt(6) + 1;
    }

}
