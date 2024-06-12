package MetodosYArgumentos;

/*Los métodos son bloques de código que se utilizan para realizar tareas específicas.
Cada método tiene un nombre que lo identifica y puede recibir una serie de parámetros, 
los cuales son variables que proporcionan información necesaria para que el método 
realice su tarea. Estos parámetros actúan como entrada para el método, permitiéndole 
operar con los valores recibidos*/

/*Los métodos en Java son bloques de código que agrupan un conjunto de instrucciones 
relacionadas. Por otro lado, los parámetros son variables que se utilizan en los 
métodos para recibir información. Y los argumentos son los valores reales que se 
pasan a los métodos al llamarlos*/

public class Operaciones {
    //Atributos
    double suma;
    double resta;
    double multiplicacion;
    double division;
    
    //Metodos
    public void sumar(double numero1, double numero2) {
        suma = numero1 + numero2; 
    }
    
    public void restar(double numero1, double numero2) {
       resta = numero1 - numero2; 
    }
    
    public void multiplicar(double numero1, double numero2) {
        multiplicacion = numero1 * numero2;
    }
    
    public void dividir(double numero1, double numero2) {
       if(numero2 == 0 || numero1 == 0){
         division = 0;  
       } else {
        division = (double)(numero1 / numero2); }
    }
    
    //Muestra todos los resultados
    public void mostar() {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
}
