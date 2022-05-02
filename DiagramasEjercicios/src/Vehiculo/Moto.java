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
public class Moto extends Vehiculo implements Motor{

    public Moto(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    public Moto() {
    }

    public static String getTipo() {
        return tipo;
    }
    
     public double Precio(){
    double precio = 500000;
    return precio;
    }
    public double Velocidad_Maxima(){
    double vel = 150;
    return vel;
    }
}
