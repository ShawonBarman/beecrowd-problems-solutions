import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        while (true) {
            int m = input.nextInt();
            int n = input.nextInt();
            if (m == 0 || m < 0 || n == 0 || n < 0){
                break;
            }
    
            if (m < n){
                int temp = m;
                m = n;
                n = temp;
            }
    
            int sum = 0;
            for (int i = n; i <= m ; i ++){
                sum += i;
                System.out.printf("%d ", i);
            }
            System.out.printf("Sum=%d\n", sum);
        }
    }
}