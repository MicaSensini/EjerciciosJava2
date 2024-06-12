package ClasesYObjetos;

//Encapsulamiento y metodos de acceso(getters y setters)

public class Clase1 {

    public static void main(String[] args) {
        Clase2 objeto1 = new Clase2();
        
        objeto1.setEdad(10);
        
        System.out.println("La edad es: "+objeto1.getEdad());
    }
    
}
