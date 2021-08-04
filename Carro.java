import java.util.Scanner;

public class Carro{
  
    public static void main(String args[]){
      
        Scanner teclado = new Scanner(System.in);
  
        double distancia , velocidade, tempo, consumo;
     
        System.out.println("digite velocidade media ");
        velocidade = teclado.nextDouble();
     
        System.out.println("digite tempo em horas ");
        tempo= teclado.nextDouble();

        distancia = velocidade * tempo;
        consumo = distancia /12.0;


    
        System.out.printf("foram necessarios %.1f litros de conbustivel\n", consumo); 
       
    }
}