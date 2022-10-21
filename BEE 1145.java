import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int cnt = 0;
        for (int i = 1; i <= y; i++){
            cnt += 1;
            if (cnt == x){
                System.out.println(i);
                cnt = 0;
            }
            else{
                System.out.printf("%d ", i);
            }
        }
    }
}