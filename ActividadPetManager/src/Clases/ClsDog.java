/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class ClsDog extends ClsPet {
    private String raza;
    private boolean Pedigree;

    public ClsDog(String raza, boolean Pedigree, String codigo, String nombre, int año_nacimiento, String color, String estado_de_salud) {
        super(codigo, nombre, año_nacimiento, color, estado_de_salud);
        this.raza = raza;
        this.Pedigree = Pedigree;
    }

    
    public void Caminar(){
        System.out.println("El perro " + super.getNombre() + " está caminando.");
    }
    
    @Override
    public void Sonar(){
        System.out.println("El perro " + super.getNombre() + " hace guauu.");
    }
    
    /**
     * @return the raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * @param raza the raza to set
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }

    /**
     * @return the Pedigree
     */
    public boolean isPedigree() {
        return Pedigree;
    }

    /**
     * @param Pedigree the Pedigree to set
     */
    public void setPedigree(boolean Pedigree) {
        this.Pedigree = Pedigree;
    }
    
    
    
}
