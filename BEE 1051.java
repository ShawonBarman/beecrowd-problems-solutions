import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        if (num >= 0 && num <= 2000){
            System.out.printf("Isento\n");
        }
        else if (num > 2000 && num <= 3000){
            System.out.printf("R$ %.2f\n", ((num - 2000) * (8.0 / 100)));
        }
        else if (num > 3000 && num <= 4500){
            double ans = (1000 * (8.0 / 100)) + ((num - 3000) * (18.0 / 100));
            System.out.printf("R$ %.2f\n", ans);
        }
        else{
            double ans = (1000 * (8.0 / 100)) + (1500 * (18.0 / 100)) + ((num - 4500) * (28.0 / 100));
            System.out.printf("R$ %.2f\n", ans);
        }
    }
}