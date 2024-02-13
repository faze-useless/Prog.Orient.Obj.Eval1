package eva1_6_vehiculo;

public class ClassVehiculo {
    //atributos
    private String marca;
    private String modelo;
    private String color;
    private int annio;
    private double valor;
    
    // metodos
    
    //get marca y set marca
    public String getMarca(){
        return marca;
    }
    public void setMarca(String value){
        marca = value;
    }
    //get modelo y set modelo
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String value){
        modelo = value;
    }
    //get color y set color
    public String getColor(){
        return color;
    }
    public void setColor(String value){
        color = value;
    }
    //get annio y set annio
    public int getAnnio(){
        return annio;
    }
    public void setAnnio(int value){
        annio = value;
    }
    //get valor y set valor
    public double getValor(){
        return valor;
    }
    public void setValor(double value){
        valor = value;
    }
}
