package Arreglos;

/*Estructura del arreglo

TipoVariable[]NombreArray = new TipoVariable[dimension];
 */
public class Arreglo {

    public static void main(String[] args) {
       //Creo un arreglo - tipo entero con nombre "numeros" de 3 dimensiones
       int[] numeros = new int[3];
       
        //Agrego los datos al arreglo
        numeros[0] = 7;
        numeros[1] = 10;
        numeros[2] = 13;
        
       //Puedo crear el arreglo y agregar los datos manualmente
       //int[] numeros = {2,3,4}; 
        
        //muestro todo los numeros del arreglo
        for (int i=0; i<3;i++) {
            System.out.println(numeros[i]);
        } 
    }
    
}
