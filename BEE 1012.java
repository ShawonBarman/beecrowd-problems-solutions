import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c = input.nextFloat();
        System.out.printf("TRIANGULO: %.3f\n", ((1.0/2)*a*c));
        System.out.printf("CIRCULO: %.3f\n", (3.14159*(c*c)));
        System.out.printf("TRAPEZIO: %.3f\n", ((1.0/2)*(a+b)*c));
        System.out.printf("QUADRADO: %.3f\n", (b*b));
        System.out.printf("RETANGULO: %.3f\n", (a*b));
    }
}