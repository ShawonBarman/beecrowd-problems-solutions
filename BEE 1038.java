import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int code = input.nextInt();
        int items = input.nextInt();
        if (code == 1){
            System.out.printf("Total: R$ %.2f\n", 4.0 * items);
        }
        else if (code == 2){
            System.out.printf("Total: R$ %.2f\n", 4.50 * items);
        }
        else if (code == 3){
            System.out.printf("Total: R$ %.2f\n", 5.0 * items);
        }
        else if (code == 4){
            System.out.printf("Total: R$ %.2f\n", 2.0 * items);
        }
        else if (code == 5){
            System.out.printf("Total: R$ %.2f\n", 1.5 * items);
        }
    }
}