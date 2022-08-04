import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int num = input.nextInt();
            if ((num % 2 == 0) && (num  > 0)){
                System.out.println("EVEN POSITIVE");
            }
            else if ((num % 2 == 0) && (num  < 0)){
                System.out.println("EVEN NEGATIVE");
            }
            else if ((num % 2 != 0) && (num  > 0)){
                System.out.println("ODD POSITIVE");
            }
            else if ((num % 2 != 0) && (num  < 0)){
                System.out.println("ODD NEGATIVE");
            }
            else{
                System.out.println("NULL");
            }
        }
    }
}