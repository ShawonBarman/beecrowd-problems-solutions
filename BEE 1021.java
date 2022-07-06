import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();
        int arr[] = {10000, 5000, 2000, 1000, 500, 200, 100, 50, 25, 10, 5, 1};
        String title = "nota(s) de R$";
        int temp, n;
        n = (int)(num * 100);

        System.out.printf("NOTAS:\n");
        for (int i = 0; i < arr.length; i++) {
            temp = n / arr[i];
            n = n % arr[i];
            if (i == 6) {
                title = "moeda(s) de R$";
                System.out.printf("MOEDAS:\n");
            }
            System.out.printf("%d %s %.2f\n", temp, title, (arr[i]/100.00));
        }
    }
}