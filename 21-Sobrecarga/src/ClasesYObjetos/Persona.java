package ClasesYObjetos;

public class Persona {
    String nombre;
    int edad;
    String dni;
    
    //MEtodos 
    //Sobre carga de constructores
    public Persona(String dni) {
        this.dni = dni;
    }
    

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //sobre carga de metodos
    public void correr() {
        System.out.println("Soy "+nombre+" y estoy corriendo");
    }
    
    public void correr( int km) {
        System.out.println("Corri "+km+" kilometros");
    }
}
