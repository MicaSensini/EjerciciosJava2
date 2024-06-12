package MetodosYArgumentos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
       double num1, num2;
       
        System.out.println("Digite dos numeros");
        System.out.print("N° 1: ");
        num1= entrada.nextDouble();
        System.out.print("N° 2: ");
        num2= entrada.nextDouble();
        
        Operaciones op = new Operaciones();
        
         /*Para utilizar el objeto sumar debemos mandarle los numeros a los parametros y me los toma
        como varabiales locales y los suma o hace la opracion que hay en el metodo*/
        op.sumar(num1, num2);
        op.dividir(num1, num2);
        op.multiplicar(num1, num2);
        op.restar(num1, num2);
        op.mostar();
    }
    
}
