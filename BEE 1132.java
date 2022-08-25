import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y){
            int temp = x;
            x = y;
            y = temp;
        }
        int sum = 0;
        for (int i = x; i <= y; i++){
            if (i % 13 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}