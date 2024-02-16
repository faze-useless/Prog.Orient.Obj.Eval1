package eva1_7_metodos;

/**
 *
 * @author DELL
 */
public class ClassHumano {
    private String nombre;
    private String apellido;
    private int edad;
    
    //get nombre y set nombre
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String value){
        nombre = value;
    }
    //get apellido y set apellido
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String value){
        apellido = value;
    }
    //get edad y set edad
    public int getEdad(){
        return edad;
    }
    public void setEdad(int value){
        edad = value;
    }
    
    //crear nombre completo
    public String createNombreCompleto() {
        return nombre+" "+apellido;
    }
    //crear fecha de nacimiento
    public int createFechaNacimiento() {
        return 2024 - edad;
    }
}
