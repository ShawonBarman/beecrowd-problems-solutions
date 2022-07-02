import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int hour = input.nextInt();
        int kmh = input.nextInt();
        double ans = (hour * kmh) / 12.0;
        System.out.printf("%.3f\n", ans);
    }
}