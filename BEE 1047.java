import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int total_hour, total_minute;
        if ((h1 == h2) && (m1 == m2)){
            total_hour = (24 - h1) + h2;
            total_minute = m2 - m1; 
        }
        else if ((h1 == h2) && (m1 < m2)){
            total_hour = h2 - h1;
            total_minute = m2 - m1; 
        }
        else if ((h1 == h2) && (m1 > m2)){
            total_hour = (24 - h1) + h2 - 1;
            total_minute = (60 - m1) + m2; 
        }
        else if ((h1 < h2) && (m1 == m2)){
            total_hour = h2 - h1;
            total_minute = m2 - m1;
        }
        else if ((h1 > h2) && (m1 == m2)){
            total_hour = (24 - h1) + h2;
            total_minute = m2 - m1;
        }
        else if ((h1 < h2) && (m1 < m2)){
            total_hour = h2 - h1;
            total_minute = m2 - m1;
        }
        else if ((h1 < h2) && (m1 > m2)){
            total_hour = h2 - h1 - 1;
            total_minute = (60 - m1) + m2;
        }
        else if ((h1 > h2) && (m1 < m2)){
            total_hour = (24 - h1) + h2 - 1;
            total_minute = m2 - m1;
        }
        else{
            total_hour = (24 - h1) + h2 - 1;
            total_minute = (60 - m1) + m2;
        }
        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", total_hour, total_minute);
    }
}