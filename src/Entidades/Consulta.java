package Entidades;


import java.util.Date;


/**
 *
 * @author MERY ACEVEDO
 */
public class Consulta {
    private String numC;
    private int tipo;
    private Date fechaHora;
    private double monto;

    public Consulta(String numC, int tipo, Date fechaHora, double monto) {
        this.numC = numC;
        this.tipo = tipo;
        this.fechaHora = fechaHora;
        this.monto = monto;
    }

    public String getNumC() {
        return numC;
    }

    public void setNumC(String numC) {
        this.numC = numC;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
    
    
    
    
    
    
    
    /**
     * @return the fechaHora
     */
    public Date getFechaHora() {
        return fechaHora;
    }

    /**
     * @param fechaHora the fechaHora to set
     */
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    /**
     * @return the monto
     */
    public double getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(double monto) {
        this.monto = monto;
    }

    
            
}
