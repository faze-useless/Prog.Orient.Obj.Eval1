package eva1_8_tv;

import java.util.*;
/**
 *
 * @author DELL
 */
public class EVA1_8_TV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                                    //constructor de la clase
        ClassTelevision objTv1 = new ClassTelevision();
        
        objTv1.bajarVolumen();
        objTv1.subirCanal();
        objTv1.botonRojo();
        objTv1.printState();
        
        
        objTv1.cambiarCanal(input.nextInt());
        
        objTv1.printState();
    }
    
}
