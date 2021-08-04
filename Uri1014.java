import java.util.Scanner;

public class Uri1014{
  public static void main(String args[]){
      Scanner teclado = new Scanner(System.in);

      int dist;
      double litros, consumo;

        dist  = teclado.nextInt();
        litros  = teclado.nextDouble();

        consumo = dist / litros;

       System.out.printf("%.3f km/l\n", consumo);



  } 

}