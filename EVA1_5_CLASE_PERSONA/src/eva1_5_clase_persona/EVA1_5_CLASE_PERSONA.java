package eva1_5_clase_persona;
import java.util.*;
/**
 *
 * @author DELL
 */
public class EVA1_5_CLASE_PERSONA {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Persona objPersona1 = new Persona();
        
        System.out.println("Nombre: ");
        objPersona1.setNombre(input.nextLine());
        System.out.println("Apellidos: ");
        objPersona1.setApellidos(input.nextLine());
        System.out.println("Edad: ");
        objPersona1.setEdad(input.nextInt());
        
        System.out.println("Nombre completo: "+objPersona1.getNombre()+" "+objPersona1.getApellidos());
        System.out.println("Edad:"+objPersona1.getEdad());
        
    }
    
}

class Persona {
    //atributos --> estado del objeto
    //no debe ser directamente accesible
    private String nombre;
    private String apellidos;
    private int edad;
    
    //metodos:
    //publicos --> son la interfaz (comunicacion con el objeto) metodos get y set
    //metodos set(escritura) y get(lectura)
    
    //get nombre
    public String getNombre(){
        return nombre;
    }
    //set nombre
    public void setNombre(String value){
        nombre = value;
    }
    
    //get apellidos
    public String getApellidos(){
        return apellidos;
    }
    //set apellidos
    public void setApellidos(String value){
        apellidos = value;
    }
    
    //get edad
    public int getEdad(){
        return edad;
    }
    //set edad
    public void setEdad(int value){
        edad = value;
    }
}