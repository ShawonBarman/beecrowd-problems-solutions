import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while(true){
            int n = input.nextInt();
            if (n < 0){
                break;
            }
            sum += n;
            cnt += 1;
        }
        System.out.printf("%.2f\n", (((1.0) *sum) / cnt));
    }
}


