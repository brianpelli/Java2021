
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
    System.out.println("Introduzca el primer valor:");
    Scanner valor1 = new Scanner(System.in);
    int numero1=valor1.nextInt();
    System.out.println("Introduzca el segundo valor:");
    Scanner valor2 = new Scanner(System.in);
    int numero2 = valor2.nextInt();
    int resultado=numero1;
        for (int i = 2; i <= numero2; i++) { 
         resultado = resultado + numero1;
        }
     System.out.println("Resultado: " + resultado );
    }
}