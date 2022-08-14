import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        while(true){
            int x = input.nextInt();
            int y = input.nextInt();
            if (x == 0 || y == 0){
                break;
            }
            else if (x > 0 && y > 0){
                System.out.println("primeiro");
            }
            else if (x > 0 && y < 0){
                System.out.println("quarto");
            }
            else if (x < 0 && y < 0){
                System.out.println("terceiro");
            }
            else{
                System.out.println("segundo");
            }
        }
    }
}

