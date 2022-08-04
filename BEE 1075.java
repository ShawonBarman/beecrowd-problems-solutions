import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 2; i < 10000; i++){
            if (i % n == 2){
                System.out.println(i);
            }
        }
    }
}