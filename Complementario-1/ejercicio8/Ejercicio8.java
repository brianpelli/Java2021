
package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    String nombap, edad, direc, ciud;
    System.out.println("Ingrese su nombre y apellido");
    nombap = reader.nextLine();
    System.out.println("Ingrese su edad");
    edad = reader.nextLine();
    System.out.println("Ingrese su dirección");
    direc = reader.nextLine();
    System.out.println("Ingrese su ciudad");
    ciud = reader.nextLine();
    System.out.println(ciud + " - " + direc + " - " + edad + " - " + nombap);
    }
}