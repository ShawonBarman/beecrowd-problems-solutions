import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double pi = 3.14159;
        double r = input.nextDouble();
        double ans = (4.0/3)*pi*(r*r*r);
        System.out.printf("VOLUME = %.3f\n", ans);
    }
}