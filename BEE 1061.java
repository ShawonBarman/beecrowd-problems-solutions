import java.io.IOException;
import java.util.Scanner;
import java.lang.String;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        String str1 = input.next();
        int day1 = input.nextInt();
        int hour1 = input.nextInt();
        String str2 = input.next();
        int minute1 = input.nextInt();
        String str3 = input.next();
        int second1 = input.nextInt();

        String str4 = input.next();
        int day2 = input.nextInt();
        int hour2 = input.nextInt();
        String str5 = input.next();
        int minute2 = input.nextInt();
        String str6 = input.next();
        int second2 = input.nextInt();

        int total_first_day = (day1 * 24 * 3600) + (hour1 * 3600) + (minute1 * 60) + second1;
        int total_second_day = (day2 * 24 * 3600) + (hour2 * 3600) + (minute2 * 60) + second2;
        int diff = total_second_day - total_first_day;
        int d = diff / (24 * 3600);
        int h = (diff % (24 * 3600)) / 3600;
        int m = ((diff % (24 * 3600)) % 3600) / 60;
        int s = ((diff % (24 * 3600)) % 3600) % 60;

        System.out.printf("%d dia(s)\n", d);
        System.out.printf("%d hora(s)\n", h);
        System.out.printf("%d minuto(s)\n", m);
        System.out.printf("%d segundo(s)\n", s);
    }
}