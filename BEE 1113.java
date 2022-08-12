import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        while (true) {
            int x = input.nextInt();
            int y = input.nextInt();
            if (x == y){
                break;
            }
    
            if (x > y){
                System.out.println("Decrescente");
            }
            else{
                System.out.println("Crescente");
            }
        }
    }
}