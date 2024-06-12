package Ejercicios;

import java.util.Scanner;

/*crear y cargar una matriz de tamaño 3*3, trasponerla y mostarla*/

public class EjercicioMatriz {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        
        
         System.out.println("Ingrese los valores de la matriz");
         for(int i = 0; i<3; i++) {
           for(int j= 0; j<3; j++) {
             System.out.print("Matriz ["+i+"]["+j+"]: "); 
             matriz[i][j] = entrada.nextInt();
           }  
         }
         
         
         System.out.println("\n Matriz original");
         for(int i = 0; i<3; i++) {
           for(int j= 0; j<3; j++) {
             System.out.print(matriz[i][j]+" "); 
           }  
             System.out.println(" ");
         }
        
         //Tranponer la matriz
         int aux;
        
         for(int i = 0; i<3; i++) {
           for(int j= 0; j<i; j++) {
             aux = matriz[i][j];
            matriz[i][j] = matriz[j][i];
            matriz[j][i] = aux;
           }  
         }
         
         System.out.println("Matriz tranpuesta");
         for(int i = 0; i<3; i++) {
           for(int j= 0; j<3; j++) {
             System.out.print(matriz[i][j]+" "); 
           }  
             System.out.println(" ");
         }
          
    }
    
}
