
package ejercicio23;

import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio23 {
    
    public static void main(String[] args) {
        ArrayList<String> baraja = new ArrayList<String>();
          baraja.add("A");
          baraja.add("2");
          baraja.add("3");
          baraja.add("4"); 
          baraja.add("5");
          baraja.add("6");
          baraja.add("7");
          baraja.add("8");
          baraja.add("9");
          baraja.add("10");
          baraja.add("J");
          baraja.add("Q");
          baraja.add("K");
          //Muestra Baraja Ordenada
          System.out.println("Baraja Ordenada");
          System.out.println(baraja); 
          
          //Muestra Baraja Orden Inverso
          Collections.reverse(baraja);
          System.out.println("Baraja Ordenada Inversamente");
          System.out.println(baraja);
          
          //Muestra Baraja Mezclada
          Collections.shuffle(baraja);
          System.out.println("Baraja Mezclada");
          System.out.println(baraja);
    }
}
    

