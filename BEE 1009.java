import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;
        float fixed_salary, total_sale;
        name = input.nextLine();
        fixed_salary = input.nextFloat();
        total_sale = input.nextFloat();
        System.out.printf("TOTAL = R$ %.2f\n", fixed_salary+(total_sale*0.15));
    }
}