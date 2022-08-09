import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++){
            int x = input.nextInt();
            int y = input.nextInt();
            if (x > y){
                int temp = x;
                x = y;
                y = temp;
            }
            int sum = 0;
            for (int j = x+1; j < y; j++){
                if (j % 2 != 0){
                    sum += j;
                }
            }
            System.out.println(sum);
        }
    }
}