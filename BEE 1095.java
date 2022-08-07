import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        int i = 1;
        for (int j = 60; j >= 0; j -= 5){
            System.out.println("I="+ i +" J="+ j);
            i += 3;
        }
    }
}