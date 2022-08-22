import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        int grenais = 0;
        int inter = 0;
        int gremio = 0;
        int empates = 0;
        while (true)
        {
            int i = input.nextInt();
            int g = input.nextInt();
            grenais += 1;
            if (i > g)
            {
                inter += 1;
            }
            else if (i < g)
            {
                gremio += 1;
            }
            else
            {
                empates += 1;
            }
            System.out.println("Novo grenal (1-sim 2-nao)");
            int n = input.nextInt();
            if (n == 2)
            {
                break;
            }
        }
        System.out.printf("%d grenais\nInter:%d\nGremio:%d\nEmpates:%d\n", grenais, inter, gremio, empates);
        if (inter > gremio)
        {
            System.out.println("Inter venceu mais");
        }
        else if (inter < gremio)
        {
            System.out.println("Gremio venceu mais");
        }
        else
        {
            System.out.println("Nao houve vencedor");
        }
    }
}

