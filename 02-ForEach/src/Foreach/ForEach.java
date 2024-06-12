package Foreach;

/*Diferencia entre un for - for Each*/

public class ForEach {

    public static void main(String[] args) {
       
    String[] nombres ={"Maria","Juan","Dolores","Ramona","Domingo","Roberto"};
        
    //FOR 
    /*length es para ver la cantidad de posiciones que tiene el vector 
    para usar el for es necesario saber la cantidad de posiciones que tiene el vector 
    
    for (int i=0; i<nombres.length  ;i++) {
    System.out.println(nombres[i]);
    }
    */
        
        
    //FOR EACH
    //va a mostar todos los nombres de mi arreglo sin necesidad de saber cuantos elementos tiene
    for (String i:nombres) { 
         System.out.println(i);
    }
        
        
        
    }
    
}
