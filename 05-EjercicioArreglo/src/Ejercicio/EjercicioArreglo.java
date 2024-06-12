package Ejercicio;

import java.util.Scanner;

public class EjercicioArreglo {

/*Leer por teclado dos tablas de 10 numeros enteros y 
mezclarlos, en una tercera de la forma el 1° de a, el 1° de b,
el 2° de a, el 2° de b, etc. */
    
    public static void main(String[] args) {
      int[] A = new int[10];
      int[] B = new int[10];
      int[] C = new int[20];
      Scanner entrada = new Scanner(System.in);
     
      //Otra forma de declarar arreglos
      /*  
      int a[], b[], c[];
      
      a = new int[10];
      b = new int[10];
      c = new int[10];
      */
      
        System.out.println("Digite el arreglo A: ");
        for (int i = 0; i<10; i++) {
            System.out.print("Numero "+(i+1)+": ");
            A[i] = entrada.nextInt();
        }
        
        System.out.println("Digite el arreglo B: ");
        for (int j = 0; j<10; j++) {
            System.out.print("Numero "+(j+1)+": ");
            B[j] = entrada.nextInt();
        }
        
        //Mezclamos por arreglos
        int j=0;
         for (int i = 0; i<10; i++) {
             C[j] = A[i];
             j++;
             C[j] = B[i];
             j++;
         }
      
      
        System.out.println("El arreglo es: ");
        
        for (int i = 0; i<20; i++) {
            System.out.print(C[i]+" - ");
        }
    }
    
}
