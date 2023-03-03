import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        double n = 3.14159;
        double r;
        r = input.nextDouble();
        System.out.printf("A=%.4f\n", n*(r*r));

    }
 
}