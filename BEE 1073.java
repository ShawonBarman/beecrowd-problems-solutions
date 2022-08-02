import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            if (i % 2 == 0){
                System.out.printf("%d^2 = %d\n", i, i*i);
            }
        }
    }
}