package Ejercicio;

import java.util.Scanner;

/*Leer 5 numeros, guardarlos en un arreglo 
y mostrarlos en el orden inverso al introducido*/

public class EjercicioArreglo {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese 5 numeros");
         for (int i = 0; i < numeros.length ; i++ ) {
             System.out.print("Numero "+(1+i)+": ");
             numeros[i] = entrada.nextInt();
         }
   
        System.out.println("Los numeros al inverso son: ");
         for (int j = 4 ; j >= 0 ; j--) {
             System.out.print(numeros[j]+" - "); 
         }
    }
    
}
