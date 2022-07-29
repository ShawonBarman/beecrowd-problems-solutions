import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num;
        int count = 0;
        for(int i = 0; i < 5; i++){
            num = input.nextInt();
            if (num % 2 == 0){
                count += 1;
            }
        }
        System.out.printf("%d valores pares\n", count);
    }
}