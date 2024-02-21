package eva1_9_constructores;

/**
 *
 * @author DELL
 */
public class EVA1_9_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClassBankBill cuenta1 = new ClassBankBill();
        
        System.out.println("Propietario: "+cuenta1.getPropietario());
        System.out.println("No. cuenta: "+cuenta1.getNumeroCuenta());
        System.out.println("Saldo : $"+cuenta1.getSaldo());
    }
    
}
