import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num, working_hour;
        float hour_rate;
        num = input.nextInt();
        working_hour = input.nextInt();
        hour_rate = input.nextFloat();
        System.out.println("NUMBER = "+num);
        System.out.printf("SALARY = U$ %.2f\n", working_hour*hour_rate);
    }
}