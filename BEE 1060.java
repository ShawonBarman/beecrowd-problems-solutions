import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float num;
        int count = 0;
        for(int i = 0; i < 6; i++){
            num = input.nextFloat();
            if (num >= 0){
                count += 1;
            }
        }
        System.out.printf("%d valores positivos\n", count);
    }
}