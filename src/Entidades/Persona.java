package Entidades;


/**
 *
 * @author MERY ACEVEDO
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private String dui;

    public Persona(String pNom, String pApe)
    {
        this.setNombre(pNom);
        this.setApellido(pApe);
        
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the dui
     */
    
    /**
     * @param dui the dui to set
     */
  
    
    
}
