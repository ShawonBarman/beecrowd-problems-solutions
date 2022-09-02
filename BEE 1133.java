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

        for (int i = x+1; i < y; i++){
            if ((i % 5 == 2) || (i % 5 == 3)){
                System.out.println(i);
            }
        }
    }
}