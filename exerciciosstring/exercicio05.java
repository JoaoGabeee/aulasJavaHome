
import java.util.Scanner;

public class ExercicioMath05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite quantos metros você que transformar para centimetros: ");
        int metros = entrada.nextInt();

        int centimetros = metros*100;

        System.out.println(metros + "Metros, são: " + centimetros + "Centimetros");
    }

}
