package Paquete;

//Constantes
//No cambia de valor en todo el programa
public class Persona {
    private int edad; //Es una variable porque puede cambiar su valor 
    private final String nombre; //Constante una ves que le pongo el valor no cambia mas 

    //constructor
    public Persona(int edad, String nombre) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
      public void mostrar() {
        System.out.println("El nombre es: "+nombre);
        System.out.println("la Edad es: "+edad);
    }
}
