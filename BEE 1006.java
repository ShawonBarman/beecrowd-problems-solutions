import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);
        double a, b, c, avg;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        avg = (a*2 + b*3 + c*5)/(2+3+5);
        System.out.printf("MEDIA = %.1f\n", avg);

    }
}