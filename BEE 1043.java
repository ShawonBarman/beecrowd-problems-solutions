import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float x = input.nextFloat();
        float y = input.nextFloat();
        float z = input.nextFloat();
        if ((x + y > z) && (y + z > x) && (x + z > y)){
            System.out.printf("Perimetro = %.1f\n", (x + y + z));
        }
        else{
            System.out.printf("Area = %.1f\n", (1.0/2) * (x + y) * z);
        }
    }
}