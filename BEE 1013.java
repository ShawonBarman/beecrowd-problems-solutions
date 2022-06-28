import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int maiorAB = (a+b+Math.abs(a-b))/2;
        int greatestValue = (maiorAB+c+Math.abs(maiorAB-c))/2;
        System.out.println(greatestValue+" eh o maior");
    }
}