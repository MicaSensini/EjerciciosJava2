package Busquedas;

import java.util.Scanner;

/*Busqueda secuencial (de uno en uno) de un digito*/

public class BusquedaSecuencial {

    public static void main(String[] args) {
      
       int arreglo[] = {4,1,5,2,3,9,6};
       int dato;
       Scanner entrada = new Scanner(System.in);
       boolean bandera = false;
       
       
        System.out.print("Digite el numero buscado: ");
        dato = entrada.nextInt();
        
        
        //BUSQUEDA SECUENCIAL
        int i=0;
        
        while ((i<arreglo.length) && (bandera == false)) { //i menor a la cantidad de numeros en el arreglo que hay
            
            if (arreglo[i] == dato) {
               bandera = true; 
            }
            i++;
    }
        
        
        if (bandera == false) {
            System.out.println("No se encontro el numero en el arreglo");  
        } else {
            System.out.println("El numero ha sido encontrado en la posicion: "+(i-1));
        }
        
    }
    
}
