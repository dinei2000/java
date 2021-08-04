import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int Numero_Func, Horas_Trab;
        double Custo_Horas , Salario;

        
        Numero_Func = teclado.nextInt();
        Horas_Trab = teclado.nextInt();
        Custo_Horas = teclado.nextDouble();
        
        Salario = Horas_Trab * Custo_Horas;

        System.out.println("NUMBER = " + Numero_Func); 
        System.out.printf("SALARY = U$ %.2f\n", Salario); 

    }
}
