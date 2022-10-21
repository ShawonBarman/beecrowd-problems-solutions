import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        while(x != 0){
            for(int i = 1; i < x; i++){
                System.out.printf("%d ", i);
            }
            System.out.println(x);
            x = input.nextInt();
        }
    }
}

// Time limit exceeded error