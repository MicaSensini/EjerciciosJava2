package Paquete;

public class Principal {

    public static void main(String[] args) {
      Persona p1 = new Persona(24,"Micaela");
      p1.mostrar(); 
        
      //Pueda cambiar la edad aunque le alla asignado otra
      p1.setEdad(22);
      p1.mostrar(); 
    }
    
}
