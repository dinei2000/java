public class TesteWhile{
    public static void main(String args[]){

        int num = 5;

        int cont;

        cont = 1;
        while (cont <= 10){
            System.out.println(num + " x " + cont + " = " + (num * cont));
            cont = cont + 1;
        }
    }
}