package Ejercicios;

import java.util.Scanner;

/*Crear y cargar dos martices de tamaño 3*3, sumarlas y mostar su suma*/

public class EjercicioMatriz {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int total = 0;
        
        
        System.out.println("Ingrese los valores de la matriz");
         for(int i = 0; i<3; i++) {
           for(int j= 0; j<3; j++) {
             System.out.print("Matriz ["+i+"]["+j+"]: "); 
             matriz[i][j] = entrada.nextInt();
             
             total = total + matriz[i][j];
           }  
         }
         
         System.out.println("La suma de la matriz es: "+total);
         
    }
    
}
    
