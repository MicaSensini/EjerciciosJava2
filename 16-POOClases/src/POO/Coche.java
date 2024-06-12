package POO;

/*CREACION CLASES
  public class Coche {
   ---------
   ---------
 }

 Con una clase se pueden crear muchos objetos
  CREAR UN OBJETO
  Coche coche1 = new Coche();*/

public class Coche { //primera clase
    //Atributos
    String color;
    String marca;
    int km;

    public static void main(String[] args) {
        //Creamos un objeto
       Coche coche1 = new Coche();
       
       //Rellenamos los atributos
       coche1.color = "Blanco";
       coche1.marca = "Audi";
       coche1.km = 0;
       
       //Los mostramos
        System.out.println("El color del coche es: "+coche1.color);
        System.out.println("La marca del coche es: "+coche1.marca);
        System.out.println("los kilometros del coche es: "+coche1.km); 
    }
    
}
