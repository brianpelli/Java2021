
package ejercicio21;
import java.util.*;


public class Ejercicio21 {



    public static void main(String[] args) {
        int c = 1;
        ArrayList<String> nombres = new ArrayList();
        nombres.add("Bariloche");
        nombres.add("Cordoba");
        nombres.add("Resistencia");
        
        
        for(int i = 0; i < nombres.size(); i++){
          System.out.println("#" + c + " " + nombres.get(i));
          c = c+1;
        }
        
    }


    
}