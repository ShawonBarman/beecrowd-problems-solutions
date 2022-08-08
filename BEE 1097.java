import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        int x = 7;
        for (int i = 1; i < 10; i += 2){
            for (int j = x; j > (x - 3); j--){
                System.out.println("I="+ i +" J="+ j);
            }
            x += 2;
        }
    }
}