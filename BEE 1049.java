import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        if(a.equals("vertebrado")){
            String b = input.nextLine();
            if(b.equals("ave")){
                String c = input.nextLine();
                if(c.equals("carnivoro"))
                    System.out.println("aguia");
                else if(c.equals("onivoro"))
                    System.out.println("pomba");
            }
            if(b.equals("mamifero")){
                String c = input.nextLine();
                if(c.equals("onivoro"))
                    System.out.println("homem");
                else if(c.equals("herbivoro"))
                    System.out.println("vaca");
            }
        }
        else if(a.equals("invertebrado")){
            String b = input.nextLine();
            if(b.equals("inseto")){
                String c = input.nextLine();
                if(c.equals("hematofago"))
                    System.out.println("pulga");
                else if(c.equals("herbivoro"))
                    System.out.println("lagarta");
            }
            if(b.equals("anelideo")){
                String c = input.nextLine();
                if(c.equals("hematofago"))
                    System.out.println("sanguessuga");
                else if(c.equals("onivoro"))
                    System.out.println("minhoca");
            }
        }
    }
}