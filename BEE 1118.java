import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int newNum;
        while(true){
            int cnt = 0;
            float sum = 0;
            while(cnt != 2){
                float num = input.nextFloat();
                if (num >= 0 && num <= 10){
                    sum += num;
                    cnt += 1;
                }
                else{
                    System.out.println("nota invalida");
                }
            }
            System.out.printf("media = %.2f\n", (sum / cnt));

            while(true){
                System.out.println("novo calculo (1-sim 2-nao)");
                newNum = input.nextInt();
                if (newNum < 1 || newNum > 2){
                    continue;
                }
                else{
                    break;
                }
            }
            if (newNum == 2){
                break;
            }
        }
    }
}

