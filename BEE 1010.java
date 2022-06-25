import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int p1, p2, u1, u2;
        float price1, price2;
        p1 = input.nextInt();
        u1 = input.nextInt();
        price1 = input.nextFloat();
        p2 = input.nextInt();
        u2 = input.nextInt();
        price2 = input.nextFloat();
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", ((u1*price1)+(u2*price2)));
    }
}