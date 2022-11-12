import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = input.nextInt();
        while(n <= 0){ n = input.nextInt();}
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += i + a;
        }
        System.out.println(sum);
    }
}