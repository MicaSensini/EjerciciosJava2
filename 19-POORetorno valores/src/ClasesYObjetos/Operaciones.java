package ClasesYObjetos;

public class Operaciones {
    public double sumar(double numero1, double numero2) {
       double suma = numero1+ numero2;
       return suma;
    }
    
     public double restar(double numero1, double numero2) {
       double resta = numero1 - numero2;
       return resta;
    }
     
      public double division(double numero1, double numero2) {
       double dividir;
       
       if(numero1==0 || numero2==0){
           dividir =0;
       } else {
           dividir = numero1 / numero2;
       }
          
       return dividir;
    }
      
       public double multi(double numero1, double numero2) {
       double mul = numero1 * numero2;
       return mul;
    }
    
        public void mostar(double suma, double restar, double multi,double division ) {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+restar);
        System.out.println("La multiplicacion es: "+multi);
        System.out.println("La division es: "+division);
    }
}
