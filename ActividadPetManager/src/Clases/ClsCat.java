
package Clases;


public class ClsCat extends ClsPet {
    private String raza;

    public ClsCat(String breed, String codigo, String nombre, int año_nacimiento, String color, String estado_de_salud) {
        super(codigo, nombre, año_nacimiento, color, estado_de_salud);
        this.raza = breed;
    }
    
    
    public void SelfCleaning(){
        System.out.println("El gato " + super.getNombre()+ " se está limpiando.");
    }

    @Override
    public void Sonar(){
        System.out.println("El gato " + super.getNombre() + " hace miauu.");
    }
    
    @Override
    public int getNumeroDeHuesos(){
        return 230;
    }
    
    @Override
    public String getTipoDeAnimal(){
        return "Gato";
    }
    /**
     * @return the breed
     */
    public String getBreed() {
        return raza;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.raza = breed;
    }
}
