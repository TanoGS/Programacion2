/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DetectiveMafioso;

import java.util.ArrayList;

/**
 *
 * @author Tano
 */
public class Mafioso extends Persona implements Investigable{
    private ArrayList <Lugar> lugaresFrecuentes;

    public Mafioso(ArrayList<Lugar> lugaresFrecuentes, String nombre, String apellido, Foto foto) {
        super(nombre, apellido, foto);
        this.lugaresFrecuentes = lugaresFrecuentes;
    }
    
}
