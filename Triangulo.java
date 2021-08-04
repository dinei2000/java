// pré-requisito preciso importar a biblioteca de leitura
import java.util.Scanner;

public class Triangulo{
    //cabecalho do modulo principal
    public static void main(String args[]){
        //preciso do componente de leitura
        Scanner teclado = new Scanner(System.in);
        
        //precuso das variaveis  quais lado o usuario inputar e area ser calculada
        double lado, area, altura;

        //entrada:
        System.out.println("Digite o lado do triangulo= ");
        lado = teclado.nextDouble();
        
        //entrada:
        System.out.println("Digite a altura do triangulo= ");
        altura = teclado.nextDouble();

        //processamento
        area = lado * altura /2;

        //saida
        System.out.printf("Valor da area = %.3f\n = ", area);
        
    }
}