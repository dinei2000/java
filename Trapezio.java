// pré-requisito preciso importar a biblioteca de leitura
import java.util.Scanner;

public class Trapezio{
    //cabecalho do modulo principal
    public static void main(String args[]){
        //preciso do componente de leitura
        Scanner teclado = new Scanner(System.in);
        
        //precuso das variaveis  quais lado o usuario inputar e area ser calculada
        double base_maior, base_menor, area, altura;

        //entrada:
        System.out.println("Digite a base_maior ");
        base_maior = teclado.nextDouble();
        
        //entrada:
        System.out.println("Digite a base_menor ");
        base_menor = teclado.nextDouble();

        //entrada:
        System.out.println("Digite a altura  ");
        altura = teclado.nextDouble();

        //processamento
        area = (base_maior + base_menor) * altura /2;

        //saida
        System.out.printf(" area do trapezio = %.3f\n = ", area);
        
    }
}