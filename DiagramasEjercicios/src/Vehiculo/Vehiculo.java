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
public abstract class Vehiculo {
    private int ruedas;
    private String duenio;

    public Vehiculo(int ruedas, String duenio) {
        this.ruedas = ruedas;
        this.duenio = duenio;
    }

    public Vehiculo() {
    }

    public int getRuedas() {
        return ruedas;
    }

    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }
    public double Precio(){
    double precio = 580;
    return precio;
    }
    public double Velocidad_Maxima(){
    double vel = 10;
    return vel;
    }
}
