package Ordenamiento;

import java.util.Scanner;

/* Ordenamiento por insercion
consiste en el recorrido por la lista seleccionando en cada iteración un 
valor como clave y compararlo con el resto insertándolo en el lugar correspondiente */

public class OrdenamientoIncercion {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int arreglo[], elementos, aux,pos;
        
        System.out.print("Digite las dimension del arreglo que desea: ");
        elementos = entrada.nextInt();
        arreglo = new int[elementos];
        
        System.out.println("Digite los numeros: ");
        for (int i=0; i<elementos; i++) {
            System.out.print("Numero "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }
        
         //METODO INSERCION
        for (int i = 1; i<elementos; i++) {
          pos = i-1;
          aux = arreglo[i];
          
          while ((pos>=0) && (arreglo[pos] > aux)) {
             arreglo[pos+1] = arreglo[pos];
             pos--;
          }
          
          arreglo[pos+1] = aux;
        }
        
        
        System.out.println("Arreglo ordenado de forma creciente");
         for (int i=0; i<elementos; i++) {
            System.out.print(arreglo[i]+" - "); 
        }
        
    }
    
}
