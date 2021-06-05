
package javaapplication9;
import java.util.Scanner;

public class JavaApplication9 {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    char [] Arraycadena ;
    char caracter;
    String cadena;
    System.out.println("Introduce una palabra o frase");
    cadena = reader.nextLine();
    System.out.println("Introduce la letra que deseas contar");
    char c = reader.next().charAt(0);
    
    Arraycadena=cadena.toCharArray();

    char[] caracteres = new char[cadena.length()];
    int[] cuantasVeces = new int[cadena.length()];

    for(int i =0;i<Arraycadena.length;i++){
        caracter = Arraycadena[i];   
        caracteres[i] = caracter;
        for(int j = i; j < Arraycadena.length; j++)   {                  
            if(Arraycadena[j]==caracter){
                cuantasVeces[i]++;
                Arraycadena[j] = ' ';
            }
        }    
        if(caracteres[i] != ' ')
            System.out.println(caracteres[i] +" "+cuantasVeces[i]+" veces.");
    }
}
}
   
