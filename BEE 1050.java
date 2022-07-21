import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num == 61){
            System.out.println("Brasilia");
        }
        else if (num == 71){
            System.out.println("Salvador");
        }
        else if (num == 11){
            System.out.println("Sao Paulo");
        }
        else if (num == 21){
            System.out.println("Rio de Janeiro");
        }
        else if (num == 32){
            System.out.println("Juiz de Fora");
        }
        else if (num == 19){
            System.out.println("Campinas");
        }
        else if (num == 27){
            System.out.println("Vitoria");
        }
        else if (num == 31){
            System.out.println("Belo Horizonte");
        }
        else{
            System.out.println("DDD nao cadastrado");
        }
    }
}