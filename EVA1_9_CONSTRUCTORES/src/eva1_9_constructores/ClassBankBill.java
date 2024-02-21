package eva1_9_constructores;

/**
 *
 * @author DELL
 */
public class ClassBankBill {
    // atributos
    private double saldo;
    private String numerocuenta;
    private String propietario;
    
    //constructor
    public ClassBankBill() {
        numerocuenta = "1234 5678 9101";
        propietario = "noone";
        saldo = 10000;
    }
    
    // metodos
   public String getNumeroCuenta() {
       return numerocuenta;
   }
   public void setNumeroCuenta(String value) {
       
   }
   
   public String getPropietario() {
       return propietario;
   }
   public void setPropietario(String value) {
       
   }
   
   public double getSaldo() {
       return saldo;
   }
   
   public void retirar(int value) {
       if (saldo >= value) {
           saldo -= value;
       }
   }
}
