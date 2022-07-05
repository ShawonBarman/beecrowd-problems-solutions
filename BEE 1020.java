import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int year = num / 365;
        int month = (num % 365) / 30;
        int day = (num % 365) % 30;
        System.out.printf("%d ano(s)\n", year);
        System.out.printf("%d mes(es)\n", month);
        System.out.printf("%d dia(s)\n", day);
    }
}