
package ejercicio22;


import java.util.ArrayList;


public class Ejercicio22 {
public static void main(String[] args) {
        //crea nueva arraylist
        ArrayList<String> aListNumbers = new ArrayList<String>();
        aListNumbers.add("1");
        aListNumbers.add("2");
        aListNumbers.add("3");
        aListNumbers.add("4");
        aListNumbers.add("5");
        
        System.out.println(aListNumbers);
        System.out.println("Cantidad de elementos: 5");
        
        //Agrega y muestra primer elemento
        aListNumbers.add(0, "0");
        System.out.println("Primer elemento agregado");
        System.out.println(aListNumbers);
        //Agrega y muestra ultimo elemento
        aListNumbers.add(6, "6");
        System.out.println("Ultimo elemento agregado");
        System.out.println(aListNumbers);
        
        System.out.println("Cantidad de elementos: 7");
    }
}
