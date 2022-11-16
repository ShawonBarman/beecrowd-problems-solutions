import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int arr[] = new int[50];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i - 2];
        }
        for (int i = 0; i < n; i++){
            if (i == (n - 1)){
                System.out.println(arr[i]);
            }
            else{
                System.out.printf("%d ", arr[i]);
            }
        }
    }
}
