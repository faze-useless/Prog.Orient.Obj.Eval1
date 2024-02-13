package eva1_6_vehiculo;

/**
 *
 * @author DELL
 */
public class EVA1_6_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassVehiculo objWarthog = new ClassVehiculo();
        objWarthog.setMarca("UNSC Motors & Electric");
        objWarthog.setModelo("Warthog");
        objWarthog.setAnnio(2550);
        objWarthog.setValor(2200000);
        objWarthog.setColor("Verde");
        
        System.out.println("Marca: "+objWarthog.getMarca());
        System.out.println("Modelo: "+objWarthog.getModelo());
        System.out.println("Annio: "+objWarthog.getAnnio());
        System.out.println("Valor: $"+objWarthog.getValor());
        System.out.println("Color: "+objWarthog.getColor());
        
    }
    
}
