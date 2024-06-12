package Matriz;

import java.util.Scanner;

/*Crear y cargar una matriz de tamaño n * m y decir si es simetrica o no
simetrica: filas == columnas deben ser iguales y se debe obtener la misma matriz
al cambiar filas por columnas (los valores deben ser iguales en las dos posiciones) */

public class EjercicioMatriz {

    public static void main(String[] args) {
     
       int matriz[][], filas, columnas;
       Scanner entrada = new Scanner(System.in);
       boolean simetrica = true; 
               
        System.out.println("Digite el numero de filas");
        filas = entrada.nextInt();
        System.out.println("Digite el numero de columnas");
        columnas = entrada.nextInt();
       
        matriz = new int[filas][columnas];
        
        System.out.println("Digite la matriz");
        for (int i =0 ; i<filas ; i++) {
            for (int j =0 ; j<columnas ; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            } 
        }
        
        if (filas == columnas) {
           int i = 0;
           
           while (i<filas && simetrica == true) {
              int j = 0;
               while (j<columnas && simetrica == true) {
                  if (matriz[i][j] != matriz[j][i]) {
                      simetrica = false;
                  }
               j++;  
               }
               i++;
           }
            if (simetrica == true) {
                System.out.println("La matriz es simetrica"); 
            } else  {
               System.out.println("La matriz NO es simetrica");  
            }
           
        } 
        else {
            System.out.println("La matriz NO es simetrica");
        }
        
        
    }
    
}
