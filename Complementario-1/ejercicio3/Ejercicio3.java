
package ejercicio3;


import java.util.Scanner;
public class Ejercicio3 {


    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num2;
    
            System.out.println("Ingrese número");
            num2 = sc.nextInt();
            StringBuilder print = new StringBuilder();
            
            for (int i = 1; i <= num2; i++) {
              print.append(String.valueOf(i)).append(" ");
              System.out.print(print + "\n");
            }
   
        }
    
    }

