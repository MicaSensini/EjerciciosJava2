package Burbuja;

import java.util.Scanner;

//METODO BURBUJA
/*Metodos de ordenamiento mas siemple. revisa cada elemento
de la lista que que va a ser ordenado intercambiando de posicion
si estan en orden equivocado. revisa la lista hasta que el arreglo
este todo ordenado*/

public class MetodoBurbuja {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int arreglo[], elementos, aux;
        
        System.out.print("Digite las dimension del arreglo que desea: ");
        elementos = entrada.nextInt();
        arreglo = new int[elementos];
        
        System.out.println("Digite los numeros: ");
        for (int i=0; i<elementos; i++) {
            System.out.print("Numero "+(i+1)+": ");
            arreglo[i] = entrada.nextInt();
        }
        
         //Metodo Burbuja
         for (int i = 0; i<elementos-1; i++) {
             for (int j=0; j<elementos-1; j++){ //intercambia y ordena el arreglo
                 if (arreglo[j] > arreglo[j+1]) {
                    aux = arreglo[j]; 
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = aux;
                 }
             }
         }
        
         System.out.println("Arreglo ordenado de forma creciente");
         for (int i=0; i<elementos; i++) {
            System.out.print(arreglo[i]+" - ");
            
        }        
        
        
        
        
        
    }
    
}
