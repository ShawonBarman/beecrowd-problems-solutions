import java.io.IOException;

import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
 
        int a, b, sum;

        a = input.nextInt();
        b = input.nextInt();

        sum = a + b;

        System.out.println("X = "+sum);
 
    }
 
}