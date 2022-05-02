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
public class Bicicleta extends Vehiculo{

    public Bicicleta(int ruedas, String duenio) {
        super(ruedas, duenio);
    }

    public Bicicleta() {
    }
     public double Precio(){
    double precio = 5000;
    return precio;
    }
    public double Velocidad_Maxima(){
    double vel = 15;
    return vel;
    }
    
}
