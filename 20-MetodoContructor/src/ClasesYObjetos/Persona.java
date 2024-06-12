package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    
    //Metodo constructor
    /*"Un constructor sirve para inicializar el objeto y establecer 
    sus propiedades y valores predeterminados. Tiene el mismo nombre 
    que la clase y no cuenta con ningún valor de retorno, ya que 
    su función principal es inicializar el objeto y no devolver ningún valor"*/
    
    public Persona(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }
        
    //Para mostar los datos    
    public void mostar() {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
