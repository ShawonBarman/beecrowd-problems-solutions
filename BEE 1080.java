import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int maxi = -99999999;
        int position = 0;
        for (int i = 1; i <= 100; i++){
            int num = input.nextInt();
            if (num > maxi){
                maxi = num;
                position = i;
            }
        }
        System.out.println(maxi);
        System.out.println(position);
    }
}