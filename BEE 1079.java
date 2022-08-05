import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            float num1 = input.nextFloat();
            float num2 = input.nextFloat();
            float num3 = input.nextFloat();
            float avg = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);
            System.out.printf("%.1f\n", avg);
        }
    }
}