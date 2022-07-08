import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double B = input.nextDouble();
        double C = input.nextDouble();
        double root = (B * B - 4 * A * C);
        if(A != 0 && root > 0){
            double R1 = (- B + Math.sqrt(root)) / (2 * A);
            double R2 = (- B - Math.sqrt(root)) / (2 * A);
            System.out.printf("R1 = %.5f\n", R1);
            System.out.printf("R2 = %.5f\n", R2);
        }
        else{
            System.out.println("Impossivel calcular");
        }
    }
}