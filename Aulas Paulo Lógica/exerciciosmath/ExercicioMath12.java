package exerciciosmath;


public class ExercicioMath12 {

    public static void main(String[] args) {

        double numero01 = 5.2;
        double numero02 = 5.6;
        double numero03 = -5.8;

        System.out.println(numero01 + " Arredondado: " + numeroArredondado(numero01));
        System.out.println(numero02 + " Arredondado: " + numeroArredondado(numero02));
        System.out.println(numero03 + " Arredondado: " + numeroArredondado(numero03));
    }

    public static double numeroArredondado(double numero){

        return Math.floor(numero);
    }

}
