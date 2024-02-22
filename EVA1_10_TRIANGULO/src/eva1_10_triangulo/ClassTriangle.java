package eva1_10_triangulo;

/**
 *
 * @author DELL
 */
public class ClassTriangle {
    // atributos
    private double base;
    private double height;
    
    // constructor
    public ClassTriangle() {
        base = -1;
        height = -1;
    }
    
    // metodos
    public void setBase(double value) {
        base = value;
    }
    public double getBase() {
        return base;
    }
    
    public void setHeight(double value) {
        height = value;
    }
    public double getHeight() {
        return height;
    }
    
    public void printData() {
        System.out.println("El area del triangulo es: "+calcArea());
        System.out.println("El perimetro del triangulo es: "+calcPerimeter());
    }
    
    private double calcArea() {
        return (base*height)/2;
    }
    private double calcPerimeter() {
        double h = Math.sqrt(base*base+height*height);
        double p = base+height+h;
        return p;
    }
    
}
