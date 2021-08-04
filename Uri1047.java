import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int hI, mI, hF, mF;   // variáveis para armazenar o inicio/fim
        int durI, durF, durT; // calcular tudo em minutos
        int durH, durM;       // converter novamente para a unidade horas/minutos

        hI = teclado.nextInt();
        mI = teclado.nextInt();
        hF = teclado.nextInt();
        mF = teclado.nextInt();

        // passo 1 - converter todo mundo pra minutos
        durI = hI * 60 + mI;
        durF = hF * 60 + mF;

        // passo 2 - ver o quanto durou efetivamente
        durT = durF - durI; // aqui é exatamente o mesmo raciocínio do exercício anterior
        if (durT <= 0){
            durT = durT + 24*60; // ou 1440
        }

        // passo 3 - converter de volta
        durH = durT / 60;
        durM = durT % 60;

        System.out.println("O JOGO DUROU " + durH + " HORA(S) E " + durM + " MINUTO(S)");


    }
}