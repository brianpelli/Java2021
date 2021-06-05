
package javaapplication27;

import java.util.*;
import java.util.Scanner;


public class JavaApplication27 {

    
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero y luego uno mayor al primero");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.print(frase(num,num2));
    }
    
public static List<String> frase(int n,int n2){
   List<String> numeros = new ArrayList<>();
   for (int i = n; i< n2; i++){
   if ((i % 2 == 0) && (i % 3 == 0)){
   }
   else if (i % 3 == 0){
     numeros.add("Buzz");
   }
   else if (i % 2 == 0) {
     numeros.add("Fizz");
   }
   else{
     String b = String.valueOf(i);
     numeros.add(b);
   }
}
return numeros;
    }
    
}
