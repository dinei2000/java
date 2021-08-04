import java.util.Scanner;

public class Exercicio2A{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valorInteiro;
        double valorDouble;
        float valorFloat;

        System.out.println("Digite um valor Double= ");
        valorDouble = teclado.nextDouble();
        System.out.println("Valor digitado = "+valorDouble);
        
    }
}