import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <= num * 4; i++){
            if (count == 3){
                System.out.println("PUM");
                count = 0;
                continue;
            }
            System.out.printf("%d ", i);
            count += 1;
        }
    }
}