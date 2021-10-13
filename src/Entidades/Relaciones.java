/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author MERY ACEVEDO
 */
public class Relaciones {
    private Persona duennio;
    private animal mascota;
    private clinica clinic;
    private Consulta consulta;
    private Persona veterinario;

    
    public Relaciones(Persona pduennio, animal panimal, clinica pCli, Persona pdoc, Consulta oconsul)
    {
        this.setDuennio(pduennio);
        this.setMascota(panimal);
        this.setoSucursal(pCli);
        this.setConsulta(oconsul);
        this.setVeterinario(pdoc);
    }
    
    /**
     * @return the oCajero
     */
    public Persona getVeterinario() {
        return veterinario;
    }

    /**
     * @param oCajero the oCajero to set
     */
    public void setVeterinario(Persona oCajero) {
        this.veterinario = oCajero;
    }
    
    /**
     * @return the oPagador
     */
    public Persona getDuennio() {
        return duennio;
    }

    /**
     * @param oPagador the oPagador to set
     */
    public void setDuennio(Persona oPagador) {
        this.duennio = oPagador;
    }

    /**
     * @return the oReceptor
     */
    public animal getoMascota() {
        return mascota;
    }

    /**
     * @param oReceptor the oReceptor to set
     */
    public void setMascota(animal oReceptor) {
        this.mascota = oReceptor;
    }

    /**
     * @return the oSucursal
     */
    public clinica getoSucursal() {
        return clinic;
    }

    /**
     * @param oSucursal the oSucursal to set
     */
    public void setoSucursal(clinica oSucursal) {
        this.clinic = oSucursal;
    }

    /**
     * @return the oTransac
     */
    public Consulta getoConsulta() {
        return consulta;
    }

    /**
     * @param oTransac the oTransac to set
     */
    public void setConsulta(Consulta oTransac) {
        this.consulta = oTransac;
    }
}
