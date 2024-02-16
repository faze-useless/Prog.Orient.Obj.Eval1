package eva1_7_metodos;

import java.util.*;

public class EVA1_7_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner input = new Scanner(System.in);
        
        ClassHumano objhumano = new ClassHumano();
        objhumano.setNombre("Finn");
        objhumano.setApellido("Mertens");
        objhumano.setEdad(17);
        
        System.out.println("El nombre es: "+objhumano.createNombreCompleto());
        System.out.println("Nacio en el annio: "+objhumano.createFechaNacimiento());
        
        ClassHumano [] grupo = new ClassHumano[4];
        // hay que crear cada objeto
        for (int i = 0; i < grupo.length; i += 1) {
            Scanner input = new Scanner(System.in);
            // instance create
            grupo[i] = new ClassHumano();
            // asignando atributos
            System.out.print("["+i+"] Introduce el nombre: ");
            //String nombre = input.nextLine();
            grupo[i].setNombre(input.nextLine());
            
            System.out.print("["+i+"] Introduce el apellido: ");
            //String apellido = input.nextLine();
            grupo[i].setApellido(input.nextLine());
            
            System.out.print("["+i+"] Introduce la edad: ");
            //int edad = input.nextInt();
            grupo[i].setEdad(input.nextInt());
            
        }
        System.out.println("------------------------------------------");
        
        for (int i = 0; i < grupo.length; i += 1) {
            //System.out.println("["+i+"]");
            System.out.println("["+i+"] El nombre es: "+grupo[i].createNombreCompleto());
            System.out.println("["+i+"] Nacio en el annio: "+grupo[i].createFechaNacimiento());
        }
    }
    
}
