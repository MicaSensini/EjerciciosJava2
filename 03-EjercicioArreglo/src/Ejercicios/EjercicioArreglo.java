package Ejercicios;

/*pedirle al usuario cuantos elementos tiene y
que ingrese los valores (en numeros)*/

import java.util.Scanner;

public class EjercicioArreglo {

    public static void main(String[] args) {
       
       int elementos;
       Scanner entrada = new Scanner(System.in);
      
      
        System.out.println("Ingrese cuantos elementos quiere en el arreglo");
        elementos = entrada.nextInt();
        
        int[] letras = new int[elementos];
        
        System.out.println("Digite los elementos del arreglo");
         for (int i=0; i<elementos; i++) {
             System.out.println((i+1)+"-Digite un caracter");
             letras[i] = entrada.next().charAt(0);
         }
         
         
        System.out.println("\nLos caracteres del arreglo son: ");
         for(int i= 0; i<elementos; i++) {
             System.out.print(letras[i]+" ");
         }
        
    }
    
}
