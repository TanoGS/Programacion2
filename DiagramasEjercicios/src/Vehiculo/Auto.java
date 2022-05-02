/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculo;

/**
 *
 * @author Tano
 */
public class Auto extends Vehiculo implements Motor{
    private int puertas;

    public Auto(int puertas, int ruedas, String duenio) {
        super(ruedas, duenio);
        this.puertas = puertas;
    }

    public Auto(int puertas) {
        this.puertas = puertas;
    }

    public Auto() {
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
     public double Precio(){
    double precio = 2000000;
    return precio;
    }
    public double Velocidad_Maxima(){
    double vel = 240;
    return vel;
    }
}
