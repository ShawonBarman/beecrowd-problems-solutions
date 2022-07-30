import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num;
        int total_positive = 0;
        int total_negative = 0;
        int total_even = 0;
        int total_odd = 0;
        for(int i = 0; i < 5; i++){
            num = input.nextInt();
            if (num  > 0){
                total_positive += 1;
            }
            if (num < 0){
                total_negative += 1;
            }
            if (num % 2 == 0){
                total_even += 1;
            }
            if (num % 2 == 1){
                total_odd += 1;
            }
        }
        System.out.printf("%d valor(es) par(es)\n", total_even);
        System.out.printf("%d valor(es) impar(es)\n", total_odd);
        System.out.printf("%d valor(es) positivo(s)\n", total_positive);
        System.out.printf("%d valor(es) negativo(s)\n", total_negative);
    }
}