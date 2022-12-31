import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0){
            int x = input.nextInt();
            int y = input.nextInt();
            int ans = 0;
            while(y != 0){
                if (x % 2 != 0){
                    ans += x;
                    y -= 1;
                }
                x += 1;
            }
            System.out.println(ans);
            n -= 1;
        }
    }
}