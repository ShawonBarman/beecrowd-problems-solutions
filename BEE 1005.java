import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);

        double a, b, avg;

        a = input.nextDouble();
        b = input.nextDouble();

        avg = (a*3.5 + b*7.5)/(3.5+7.5);

        System.out.printf("MEDIA = %.5f\n", avg);
    }
}