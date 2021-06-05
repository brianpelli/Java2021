
package ejercicio7;

import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        mayusculaString();
    }
    // Convierte texto a mayusculas
    static void mayusculaString() {
        String palabra;
        try (Scanner sc = new Scanner(System.in)) {
            palabra = sc.nextLine();
        }
        char[] caracteres = palabra.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = mayusculaChar(caracteres[i]);
        }
        Arrays.toString(caracteres);
        System.out.println(caracteres);
    }

    // Convierte un caracter de minuscula a mayuscula
    static char mayusculaChar(char valor) {
        int upper = (int)valor - (int)'a' + (int)'A';
        char nuevo = (char)upper;
        return nuevo;
    }
}