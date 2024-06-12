package Busqueda;

import java.util.Scanner;

/* La búsqueda binaria es un algoritmo eficiente para encontrar 
un elemento en una lista ordenada de elementos. Funciona al dividir
repetidamente a la mitad la porción de la lista que podría contener 
al elemento, hasta reducir las ubicaciones posibles a solo una*/

public class BusquedaBinaria {

    public static void main(String[] args) {
 
        int[] A = {1,2,3,4,5,6,7,8,9,10};
        int num;
        Scanner entrada = new Scanner(System.in);
                
        System.out.print("Ingrese el numero a buscar: ");
        num =entrada.nextInt();
        
        int resultado = Busqueda(A, num);
        
        if(resultado != -1){
            System.out.println("Numero encontrado en la posicion: "+resultado);    
        } else{
            System.out.println("Numero no encontrado en el arreglo");
        }
        
        
    }
    
    //Metodo busqueda binaria
    public static int Busqueda(int [] arreglo, int dato){
        int inicio = 0;
        int fin = arreglo.length - 1;
        int medio;
        
        
        while (inicio <= fin) {
        medio = (inicio+fin) / 2;
           if ( arreglo[medio] == dato ) {
           return medio;
        } else if ( arreglo[medio] < dato ) {
              inicio = medio+1;
           } else {
             fin = medio-1;
            }        
        }       
       return -1;
        }
    
    
    }
    
    
    

