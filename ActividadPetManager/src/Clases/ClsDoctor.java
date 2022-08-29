
package Clases;


public class ClsDoctor {
    private String nombre;
    private String licencia;

    public ClsDoctor(String nombre, String licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
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
     * @return the licencia
     */
    public String getLicencia() {
        return licencia;
    }

    /**
     * @param licencia the licencia to set
     */
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    
    
}
