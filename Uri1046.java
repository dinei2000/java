import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hi, hf, dur;

        hi = teclado.nextInt();
        hf = teclado.nextInt();

        dur = hf - hi;
        if (dur <= 0) {
            dur = dur + 24;
        }

System.out.println("O JOGO DUROU " + dur + " HORA(S)");

    }
}