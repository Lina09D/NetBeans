
package PetManager;

import Clases.*;


public class Polimorfismo2 {
    public static void main(String[] args) {
        //Instancias de las clases hijas
                ClsDog dog = new ClsDog("Pincher", false, "001", "Mariposa", 2022, "Negro", "Sano");
                ClsCat cat = new ClsCat("Angora", "002", "Bayli", 2021, "Blanco y Negro", "Sano");
                dog.Sonar();
                cat.Sonar();
    }
    
}
