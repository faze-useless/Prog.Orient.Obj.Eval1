package eva1_11_formula_general;

/**
 *
 * @author DELL
 */
public class ClassFormulaGeneral {
    //atributos
    int a;
    int b;
    int c;
    
    //constructor
    //xd
    public ClassFormulaGeneral() {
        a = -1;
        b = -1;
        c = -1;
    }
    
    //metodos
    public void setA(int value) {
        a = value;
    }
    public double getA() {
        return a;
    }
    
    public void setB(int value) {
        b = value;
    }
    public double getB() {
        return b;
    }
    
    public void setC(int value) {
        c = value;
    }
    public double getC() {
        return c;
    }
    
    public void printData(){
        System.out.println("Con: "+a+", "+b+", "+c+".");
        System.out.println("X1 (-) = "+calcX1());
        System.out.println("X2 (+) = "+calcX2());
    }
    
    public double calcX1() {
        double x1 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return x1;
    }
    public double calcX2() {
        double x2 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        return x2;
    }
}
