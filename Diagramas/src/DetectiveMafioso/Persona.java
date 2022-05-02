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
public class Persona {
    private String nombre;
    private String apellido;
    private Foto foto;
    private ArrayList <MedioDeComunicacion> comunicaciones = new ArrayList();
    private ArrayList <Perfil> perfiles = new ArrayList();

    public Persona(String nombre, String apellido, Foto foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public ArrayList<MedioDeComunicacion> getComunicaciones() {
        return comunicaciones;
    }

    public void setComunicaciones(ArrayList<MedioDeComunicacion> comunicaciones) {
        this.comunicaciones = comunicaciones;
    }

    public ArrayList<Perfil> getPerfiles() {
        return perfiles;
    }

    public void setPerfiles(ArrayList<Perfil> perfiles) {
        this.perfiles = perfiles;
    }
    
//    public void agregarPerfil(){
//    
//    Perfil perfil = new Perfil(leerEntero("Tipo de perfil: "),
//     leerCadena("Descripcion: "));
//    this.perfiles.add(perfil);
//    
//    
//    }
    
    
}
