package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath01 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o raio da sua circunferencia?");
        double raioDaCircunferencia = entrada.nextDouble();

        double perimetroCircunferencia = 2*3.14*raioDaCircunferencia;
        double areaCircunferencia = 3.14*(raioDaCircunferencia*raioDaCircunferencia);

        System.out.println("Raio: " + raioDaCircunferencia + "\nPerimetro: " + perimetroCircunferencia + "\nÁrea: " + areaCircunferencia);
    }

}
