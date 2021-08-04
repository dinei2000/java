import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int id, q;
        float preco;

        id = teclado.nextInt();
        q =  teclado.nextInt();
       

          if ( id == 1 ){preco = q * 4.0f;}
          else{if ( id == 2 ){preco = q * 4.50f;}
          else{if ( id == 3 ){preco = q * 5.0f;}
          else{if ( id == 4 ){ preco = q * 2.0f;}
          else{preco = q * 1.5f;}}}}

        System.out.printf("Total: R$ %.2f\n",  preco);

    }
}