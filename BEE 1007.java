import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{

        Scanner input = new Scanner(System.in);
        int a, b, c, d, diff;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();
        diff = (a*b)-(c*d);
        System.out.println("DIFERENCA = "+ diff);

    }
}