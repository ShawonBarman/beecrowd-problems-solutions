import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        double num = input.nextDouble();
        double earned;
        if (num >= 0 && num <= 400){
            earned = num * (15.0/100);
            System.out.printf("Novo salario: %.2f\n", (earned + num));
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 15 %");
        }
        else if (num > 400 && num <= 800){
            earned = num * (12.0/100);
            System.out.printf("Novo salario: %.2f\n", (earned + num));
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 12 %");
        }
        else if (num > 800 && num <= 1200){
            earned = num * (10.0/100);
            System.out.printf("Novo salario: %.2f\n", (earned + num));
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 10 %");
        }
        else if (num > 1200 && num <= 2000){
            earned = num * (7.0/100);
            System.out.printf("Novo salario: %.2f\n", (earned + num));
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 7 %");
        }
        else{
            earned = num * (4.0/100);
            System.out.printf("Novo salario: %.2f\n", (earned + num));
            System.out.printf("Reajuste ganho: %.2f\n", earned);
            System.out.println("Em percentual: 4 %");
        }
    }
}