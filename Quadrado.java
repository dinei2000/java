// pré-requisito preciso importar a biblioteca de leitura
import java.util.Scanner;

public class Quadrado{
    //cabecalho do modulo principal
    public static void main(String args[]){
        //preciso do componente de leitura
        Scanner teclado = new Scanner(System.in);
        
        //precuso das variaveis  quais lado o usuario inputar e area ser calculada
        double lado, area;

        //entrada:
        System.out.println("Digite Valor do Quadrado= ");
        lado = teclado.nextDouble();


        //processamento
        area = lado * lado;

        //saida
        System.out.printf("Valor da area = %.3f\n = ", area);
        
    }
}