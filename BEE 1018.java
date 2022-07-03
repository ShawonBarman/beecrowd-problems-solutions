import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.printf("%d\n",num);
        int x = num / 100;
        System.out.printf("%d nota(s) de R$ 100,00\n", x);
        num = num % 100;
        x = num / 50;
        System.out.printf("%d nota(s) de R$ 50,00\n", x);
        num = num % 50;
        x = num / 20;
        System.out.printf("%d nota(s) de R$ 20,00\n", x);
        num = num % 20;
        x = num / 10;
        System.out.printf("%d nota(s) de R$ 10,00\n", x);
        num = num % 10;
        x = num / 5;
        System.out.printf("%d nota(s) de R$ 5,00\n", x);
        num = num % 5;
        x = num / 2;
        System.out.printf("%d nota(s) de R$ 2,00\n", x);
        num = num % 2;
        System.out.printf("%d nota(s) de R$ 1,00\n", num);
    }
}