/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Tatiana
 */
public class ClsVeterinary extends AbstHospital {
    private String nombre;
    private String telefono;
    private String direccion;
    private ClsDoctor doctor;

    public ClsVeterinary(String nombre, String telefono, String direccion, ClsDoctor doctor) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.doctor = doctor;
    }

    public String PetCare(ClsPet pet){
        System.out.println("Atendiendo la mascota " + pet.getNombre());
        return pet.getEstado_de_salud();
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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
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
     * @return the doctor
     */
    public ClsDoctor getDoctor() {
        return doctor;
    }

    /**
     * @param doctor the doctor to set
     */
    public void setDoctor(ClsDoctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public String getTipoDePaciente() {
        return "Animal.";
    }

    @Override
    public String Surgery() {
        return "Surgery animal data.";
    }
    
    
}
