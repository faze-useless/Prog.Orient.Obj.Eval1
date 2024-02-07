package eva1_2_instanciacion;

public class EVA1_2_INSTANCIACION {

    public static void main(String[] args) {
        // TODO code application logic here
        // INSTANCIACION: crear objeto = darle memoria
        // CLASE IDENTIFICADOR = new Constructor();
        // Constructor --> Metodo con el mismo nombre de la clase.
        Humano human1 = new Humano(); // instanciacion
        System.out.println(human1); // @ --> at --> en
        // human1 --> referencia --> direccion de memoria
        
        Automovil batimovil = new Automovil();
        System.out.println(batimovil);
        batimovil.marca = "Ford";
        batimovil.annio = 2019;
        batimovil.modelo = "Mustang";
        
        System.out.println("Marca: "+batimovil.marca);
        System.out.println("Año: "+batimovil.annio);
        System.out.println("Modelo: "+batimovil.modelo); //XD
        
    }
    
}

//tipo de dato abstracto
class Humano {
    
}

class Automovil {
    // Atributos
    String marca;
    int annio;
    String modelo;
}
