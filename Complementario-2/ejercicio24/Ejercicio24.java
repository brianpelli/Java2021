
package ejercicio24;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio24 {

    public static void main(String[] args) {

       ArrayList<Object> alumnos = new ArrayList<>();
          alumnos.add("Chavo");
          alumnos.add("Quico");
          alumnos.add("Chilindrina");
          alumnos.add("Ñoño"); 
          alumnos.add("Arya");
          alumnos.add("Sansa");
          alumnos.add("Jon");
          alumnos.add("Rob");
          alumnos.add("Nelson");
          alumnos.add("Martin");
          alumnos.add("Bart");
          alumnos.add("Milhouse");


        List<Object> curso1 = alumnos.subList(0, 4);
        List<Object> curso2 = alumnos.subList(4, 8);
        List<Object> curso3 = alumnos.subList(8, 12);

        System.out.println("La primera lista tiene a " + alumnos.subList(0, 4) );
        System.out.println("La segunda lista tiene a " + alumnos.subList(4, 8) );
        System.out.println("La tercera lista tiene a " + alumnos.subList(8, 12) );
    }

}
