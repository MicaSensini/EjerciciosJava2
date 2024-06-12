package ClasesYObjetos;

public class Sobrecarga {

  /*La sobrecarga de métodos es la creación de varios métodos con
    el mismo nombre pero con diferente lista de tipos de parámetros*/  
    
    public static void main(String[] args) {
    Persona p1 = new Persona("Micaela",24);
     
     p1.correr();
     p1.correr(23);
    }
    
}
