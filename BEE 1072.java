import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int cnt = 0;
        for (int i = 0; i < n; i++){
            int num = input.nextInt();
            if (num >= 10 && num <= 20){
                cnt += 1;
            }
        }
        System.out.printf("%d in\n", cnt);
        System.out.printf("%d out\n", n - cnt);
    }
}