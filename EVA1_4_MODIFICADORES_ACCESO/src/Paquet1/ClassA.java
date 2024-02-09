package Paquet1;

import Paquet2.*;

public class ClassA {

    public static void main(String[] args) {
        // TODO code application logic here
        One objOne = new One();
        System.out.println(objOne);
        
        // Paquet2
        ClassB objClassB = new ClassB();
        System.out.println(objClassB);
        
        //Two objTwo = new Two();
        //--> Two no es accesible por su nivel de acceso (default)
        
        ClassC objClassC = new ClassC();
        System.out.println(objClassC);
        
        //Three objThree = new Three();
        //--> Three no es accesible por su nivel de acceso (default)
        
    }
    
}

class One {
    //xd
}