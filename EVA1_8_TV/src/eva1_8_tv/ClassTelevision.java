package eva1_8_tv;

import java.util.*;

public class ClassTelevision {
    //atributos
    private int canal;
    private int volumen;
    private boolean isOn;
    
    //constuctor default
    public ClassTelevision() {
        canal = 5;
        volumen = 30;
        isOn = false;
    }
    
    //metodos
    public void subirVolumen() {
        if (volumen < 100 && isOn) {
            volumen += 1;
        }// else
            //System.out.println("[!] Error.");
    }
    public void bajarVolumen() {
        if (volumen > 0 && isOn) {
            volumen -= 1;
        }
    }
    
    public void subirCanal() {
        if (isOn) {
            canal += 1;
        }
    }
    public void bajarCanal() {
        if (canal > 1 && isOn) {
            canal -= 1;
        }
    }
    public void cambiarCanal(int value) {
        if (value >= 1 && isOn) {
            canal = value;
        }
    }
    
    public void botonRojo() {
        isOn = !isOn;
        /*
        if (isOn == false) {
            isOn = true;
        } else if (isOn == true) {
            isOn = false;
        }
        */
    }
    
    public void printState() {
        System.out.println("volumen: "+volumen);
        System.out.println("canal: "+canal);
        System.out.println("Estado de energia: "+isOn);
    }
}