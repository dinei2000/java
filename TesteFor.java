public class TesteFor{
    public static void main(String args[]){
        
        int num = 5;

        for ( int cont = 1 ; cont <= 10 ;  cont = cont + 1 ) {
            System.out.println(num + " x " + cont + " = " + (num*cont));
        }


        // cont = cont + 1   ==>  cont++   ==> cont += 1

        // cont = cont + 5   ==>               cont += 5
    }
}