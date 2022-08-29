

package Clases;

import InterFases.*;


public class ClsPet implements IAnimal, IVertebrate {
    private String codigo;
    private String nombre;
    private int año_nacimiento;
    private String color;
    private String estado_de_salud;

    public ClsPet() {
    }

    public ClsPet(String codigo, String nombre, int año_nacimiento, String color, String estado_de_salud) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.año_nacimiento = año_nacimiento;
        this.color = color;
        this.estado_de_salud = estado_de_salud;
    }

    public void Eat(){
        System.out.println("La Mascota " + this.nombre + " está comiendo.");
    }
    
    public void Mover(){
        System.out.println("La Mascota " + this.nombre + " está moviéndose.");
    }
    
    public void Sonar(){
        System.out.println("La Mascota " + this.nombre + " está realizando el sonido.");
    }    
    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
     * @return the año_nacimiento
     */
    public int getAño_nacimiento() {
        return año_nacimiento;
    }

    /**
     * @param año_nacimiento the año_nacimiento to set
     */
    public void setAño_nacimiento(int año_nacimiento) {
        this.año_nacimiento = año_nacimiento;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the estado_de_salud
     */
    public String getEstado_de_salud() {
        return estado_de_salud;
    }

    /**
     * @param estado_de_salud the estado_de_salud to set
     */
    public void setEstado_de_salud(String estado_de_salud) {
        this.estado_de_salud = estado_de_salud;
    }

    @Override
    public String getTipoDeAnimal() {
        return "Doméstico.";
    }

    @Override
    public int getNumeroDeHuesos() {
    return 0;
    }
    
    
}
