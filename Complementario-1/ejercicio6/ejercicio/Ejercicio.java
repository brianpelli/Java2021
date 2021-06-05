
package ejercicio;
import java.util.Scanner;


public class Ejercicio {

    public static void main(String[] args) {
        
    System.out.println("Introduzca el primer valor:");
    Scanner valor1 = new Scanner(System.in);
    int base=valor1.nextInt();
    System.out.println("Introduzca el segundo valor:");
    Scanner valor2 = new Scanner(System.in);
    int exponente = valor2.nextInt();
 int resultado=base;
        for (int i = 2; i <= exponente; i++) { 
         resultado = resultado*base;
        }
     System.out.println("Resultado: " + resultado );
    }
    
}
    
    
