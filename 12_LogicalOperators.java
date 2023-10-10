/*Scrivi un programma che contiene un metodo che prenda un numero in ingresso e capisca se 
un numero è pari o dispari utilizzando solo gli operatori logici.*/


public class Main {
    public static void main (String[] args){
    int num = 151;
    
    System.out.println("Is it a even number? " + evenOdd(num));
}

static boolean evenOdd (int a) {
   boolean result = (a%2 == 0);
   return result;
    
   

}
}
