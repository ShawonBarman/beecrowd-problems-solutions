import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        int[] arr = {x, y, z};
        Arrays.sort(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}