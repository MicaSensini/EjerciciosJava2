package Matriz;

import java.util.Scanner;

public class Matriz {
    
/*Rellenar una matriz manualmente, mostrar una matriz
pedir filas y columnas y rellenar matriz por el usuario*/
    
    public static void main(String[] args) {
      
       //Rellenar una matriz manualmente de 3x3
       //int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
    
    /* mostrar la matriz por pantalla
       for (int i=0; i<3 ; i++) { //numeros de filas
        for (int j=0; j<3 ; j++) { //numeros de columnas
            System.out.print(matriz[i][j]); 
        }  
           System.out.println(" ");
       } 
     */
    
   //Matriz ingresada por el usuario
   int matriz[][], filas, columnas;
   Scanner entrada = new Scanner(System.in);
   
   //Pedir filas y columnas
        System.out.println("Ingrese filas");
        filas = entrada.nextInt();
        System.out.println("Ingrese columnas");
        columnas = entrada.nextInt();
        
        
        matriz = new int[filas][columnas];
        
    //Ingresa los datos en la matriz
        for (int i=0; i<filas ; i++) {
            for (int j=0; j<columnas ; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        
    //Mostar la matriz por pantalla
        System.out.println("La matriz es: ");
        for (int i=0; i<filas ; i++) {
            for (int j=0; j<columnas ; j++) { 
              System.out.print(matriz[i][j]);  
            }   
            System.out.println(" ");
            }
    }
    
}
