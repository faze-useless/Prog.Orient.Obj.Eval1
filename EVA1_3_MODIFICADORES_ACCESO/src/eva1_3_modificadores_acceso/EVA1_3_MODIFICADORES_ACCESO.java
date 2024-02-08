package eva1_3_modificadores_acceso;

import Packetaxo.*;

public class EVA1_3_MODIFICADORES_ACCESO {
    public int x;
    protected int y;
    private int z;
    int w;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        test1 obj1 = new test1();
        //obj1. --> puede ver x (public) y (protected) w (default)
        Cheeto cheeto1 = new Cheeto();
        //cheeto1.x --> puede ver x (public)
        //test2 obj2 = new test2(); --> no es visible por tanto no se puede importar si no es public
    }
    
}

// El modificador de estas clases es default
class test1{
    public int x;
    protected int y;
    private int z;
    int w;
}