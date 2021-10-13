package Entidades;


import Entidades.Persona;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MERY ACEVEDO
 */
public class clinica {
    private String nombre;
    private String direccion;
    private Persona oGerente;
    private ArrayList<Persona> lVet;

    public clinica(String pNom, String pDir, Persona oGer, ArrayList<Persona> pCaj)
    {
        this.setNombre(pNom);
        this.setDireccion(pDir);
        this.setoGerente(oGer);
        this.setlCaj(pCaj);
    }     
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the oGerente
     */
    public Persona getoGerente() {
        return oGerente;
    }

    /**
     * @param oGerente the oGerente to set
     */
    public void setoGerente(Persona oGerente) {
        this.oGerente = oGerente;
    }

    /**
     * @return the lCaj
     */
    public ArrayList<Persona> getlCaj() {
        return lVet;
    }

    /**
     * @param lCaj the lCaj to set
     */
    public void setlCaj(ArrayList<Persona> lCaj) {
        this.lVet = lCaj;
    }
    
    
    
}
