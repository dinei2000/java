import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int d, h, m, s, r;

        d  = teclado.nextInt();

        h     = d / 3600;
        r     = d % 3600;
        m     = r / 60;
        s     = r % 60;

         System.out.println(h + ":" + m + ":" + s);

    }


}