import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = 1;
        for (int i = 1; i <= n; i++){
            ans *= i;
        }
        System.out.println(ans);
    }
}

