package ClasesYObjetos;

import java.util.Scanner;

/*CREACION DE METODOS
un metodo es una accion o comportamiento de los objetos

public void metodo(argumentos) {
void si no retorna nada, si retorna algo
se pone el tipo de variable string, int , etc
------------
-------------
}*/

public class Operaciones {
   //Atributos 
    double numero1;
    double numero2;
    double resta = 0;
    double suma = 0;
    double multiplicacion = 0;
    double division = 0;
    
    //Metodos
    //Le pedimos al usuario dos numeros
    public void numeros() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el 1° numero: ");   
        numero1 = entrada.nextInt();
        System.out.print("Ingrese el 2° numero: "); 
        numero2 = entrada.nextInt();  
    }
    
    //Metodo sumar
    public void sumar() {
        suma = numero1+numero2;   
    }
    
    //Metodo resta
     public void resta() {
        resta = numero1-numero2;   
    }
     
    //Metodo multiplicacion
     public void multiplicacion() {
        multiplicacion = numero1*numero2;    
    }
     
    //Metodo division
     public void division() {
        if(numero2 == 0 || numero1 ==0){
        division = 0;
        } else {
        division = (double)(numero1/numero2) ; }
    } 
    
     //Muestra todos los resultados
    public void mostar() {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
