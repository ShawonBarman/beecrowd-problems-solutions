import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main{

    public static void main(String[] args)  throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int c = 0, r = 0, s = 0, total = 0;
        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            String b = input.next();
            if (a >= 1 && a <= 15) {
                if (b.equalsIgnoreCase("C")) {
                    c += a;
                }
                if (b.equalsIgnoreCase("R")) {
                    r += a;
                }
                if (b.equalsIgnoreCase("S")) {
                    s += a;
                }
                total += a;
            }
        }

        System.out.println("Total: " + total + " cobaias");
        System.out.println("Total de coelhos: " + c);
        System.out.println("Total de ratos: " + r);
        System.out.println("Total de sapos: " + s);

        System.out.printf("Percentual de coelhos: %.2f %%\n", ((c * 100.0) / total));
        System.out.printf("Percentual de ratos: %.2f %%\n", ((r * 100.0) / total));
        System.out.printf("Percentual de sapos: %.2f %%\n", ((s * 100.0) / total));

    }
}
