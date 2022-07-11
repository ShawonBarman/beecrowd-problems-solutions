import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        float n2 = input.nextFloat();
        float n3 = input.nextFloat();
        float n4 = input.nextFloat();

        float avg = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

        System.out.printf("Media: %.1f\n", avg);

        if (avg >= 7){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (avg < 5){
            System.out.printf("Aluno reprovado.\n");
        }
        else{
            System.out.printf("Aluno em exame.\n");
            float score = input.nextFloat();
            System.out.printf("Nota do exame: %.1f\n", score);
            float new_avg = (avg + score) / 2;
            if (new_avg >= 5){
                System.out.printf("Aluno aprovado.\n");
            }
            else{
                System.out.printf("Aluno reprovado.\n");
            }
            System.out.printf("Media final: %.1f\n", new_avg);
        }
    }
}