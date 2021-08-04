import java.util.Scanner;

public class Residencia{
  
    public static void main(String args[]){
      
        Scanner teclado = new Scanner(System.in);
  
        double valor_sal_min, qte_kw, valor_kw, valor_total, valor_desconto;
     
        System.out.println("Valor do Salario Minimo ");
        valor_sal_min = teclado.nextDouble();
     
        System.out.println("Digite qte_kw_gastos ");
        qte_kw= teclado.nextDouble();

        valor_kw = valor_sal_min/700;
        valor_total = valor_kw * qte_kw;
        valor_desconto = valor_total * 0.9;
    
        System.out.printf("o valor do kw %.2f\n ", valor_kw);
        System.out.printf("o valor total total %.2f\n ", valor_total);
        System.out.printf("o valor total desconto 10%% R$ %.2f\n ", valor_desconto);
              
    }
}