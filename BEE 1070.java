import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int cnt = 0;
        while(cnt < 12){
            if (x % 2 == 1){
                System.out.println(x);
            }
            x += 1;
            cnt += 1;
        }
    }
}