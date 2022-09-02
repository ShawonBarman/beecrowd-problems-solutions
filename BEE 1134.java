import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int a = 0;
        int g = 0;
        int d = 0;
        while(true){
            int num = input.nextInt();
            if (num == 4){
                break;
            }
            else if (num == 1){
                a += 1;
            }
            else if (num == 2){
                g += 1;
            }
            else if (num == 3){
                d += 1;
            }
            else{
                continue;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", a);
        System.out.printf("Gasolina: %d\n", g);
        System.out.printf("Diesel: %d\n", d);
    }
}