package exerciciosmath;


import java.util.Scanner;

public class ExercicioMath07 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é a temperatura em graus Farenheit? ");
        double temperaturaEmGrausFarenheit = entrada.nextDouble();

        double temperaturaGrausCelsius = (5 * (temperaturaEmGrausFarenheit - 32) / 9);

        System.out.println("Temperatua em graus Farenheit: " + temperaturaEmGrausFarenheit + "ºF\nTemperatura em graus Celsius: " + temperaturaGrausCelsius + "ºC");

    }

}
