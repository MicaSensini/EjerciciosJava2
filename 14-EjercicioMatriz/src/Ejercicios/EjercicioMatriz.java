package Ejercicios;

import java.util.Scanner;

/*Crear y cargar una matriz de tamaño n * m, mostrar
la suma de cada fila y cada columna */

public class EjercicioMatriz {
 
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int matriz[][], filas, columnas, sfilas, scolumnas;
              
       System.out.print("Digite el numero de filas: ");
       filas = entrada.nextInt();
       System.out.print("Digite el numero de columnas: ");
       columnas = entrada.nextInt();
       
       matriz = new int[filas][columnas];
       
        System.out.println("Digite la matriz");
        for (int i =0 ; i<filas ; i++) {
            for (int j =0 ; j<columnas ; j++) {
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            } 
        }
                
        System.out.println("La matriz es: ");
         for(int i = 0; i<filas; i++) {
           for(int j= 0; j<columnas; j++) {
             System.out.print(matriz[i][j]+" "); 
           }  
             System.out.println(" ");
        }
         
        //Suma filas
        for (int i=0; i<filas; i++) {
             sfilas = 0;
             for (int j=0; j<columnas; j++) {
                 sfilas += matriz[i][j];
             }
             System.out.println("\nLa suma de las filas "+i+" es: "+sfilas);      
        }
        System.out.println(" ");
         
        //Suma Columnas
        for (int j=0; j<columnas; j++) { 
             scolumnas = 0;
            for (int i=0; i<filas; i++) {
                scolumnas += matriz[i][j];
            } 
             System.out.println("\nLa suma de las columna "+j+" es: "+scolumnas);  
        }
        System.out.println(" ");
        
    }
    
}
