import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int z = input.nextInt();
        while(z <= x){ z = input.nextInt();}
        int sum = 0;
        int cnt = 1;
        for (int i = x; i < z; i++){
            sum += i;
            if (sum < z){
                cnt += 1;
            }
        }
        System.out.println(cnt);
    }
}