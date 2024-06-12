package ClasesYObjetos;

import java.util.Scanner;

public class Main {
    
    public static void main(String [] args) {
      Scanner entrada = new Scanner(System.in);
       int num1, num2;
       
        System.out.println("Digite dos numeros ");
        System.out.print("N° 1: ");
        num1= entrada.nextInt();
        System.out.print("N° 2: ");
        num2= entrada.nextInt();
        
        Operaciones op = new Operaciones();
        
        double suma = op.sumar(num1, num2);
        double division = op.division(num1, num2);
        double multi = op.multi(num1, num2);
        double restar = op.restar(num1, num2);
       
        op.mostar(suma, restar, multi, division);
        
        
        /*OTRA FORMA DE IMPRIMIR LOS RESULTADOS SIN NECESIDAD DE UN METODO
        System.out.println("La suma es: "+op.sumar(num1, num2));
        System.out.println("La resta es: "+op.restar(num1, num2););
        System.out.println("La multiplicacion es: "+op.multi(num1, num2););
        System.out.println("La division es: "+op.division(num1, num2);
        */
          
        
        
    }
}
