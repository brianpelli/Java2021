
package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int num2;
                System.out.println("Ingrese número");
                num2 = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= num2; i++) {
            resultado *= i;
        }
       System.out.println("El facorial es: "+ resultado);
    }
}
