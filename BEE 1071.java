import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y){
            int temp;
            temp = x;
            x = y;
            y = temp;
        }
        int sum = 0;
        for (int i = x+1; i < y; i++){
            if (i % 2 != 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}