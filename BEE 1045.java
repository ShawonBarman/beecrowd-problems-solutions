import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double[] arr = {a, b, c};
        Arrays.sort(arr);
        a = arr[2];
        b = arr[1];
        c = arr[0];
        if (a >= (b + c)){
            System.out.println("NAO FORMA TRIANGULO");
        }
        else if ((a * a) == ((b * b) + (c * c))){
            System.out.println("TRIANGULO RETANGULO");
        }
        else if ((a * a) > ((b * b) + (c * c))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }
        else if ((a * a) < ((b * b) + (c * c))){
            System.out.println("TRIANGULO ACUTANGULO");
        }
    
        if (a == b && a == c){
            System.out.println("TRIANGULO EQUILATERO");
        }
        if ((a == b && a != c) || (b == c && b != a) || (a == c && a != b)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}