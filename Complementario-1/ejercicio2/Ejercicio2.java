
package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
    int num1 = 0;
    int num2 = 0;
    Scanner reader = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    num1 = reader.nextInt();
    System.out.println("Ingrese otro numero");
    num2 = reader.nextInt();
    System.out.println(num1+num2);
    System.out.println(num1-num2);
    System.out.println(num1*num2);
    System.out.println(num1/num2);
    System.out.println(num1%num2);
    }
    
}

