public class Main{
    public static void main(String[] args){
        float s = 1;
        int x = 2;
        for (int i = 3; i < 40 ; i += 2){
            s += (((1.0) * i) / x);
            x *= 2;
        }
        System.out.printf("%.2f\n", s);
    }
}