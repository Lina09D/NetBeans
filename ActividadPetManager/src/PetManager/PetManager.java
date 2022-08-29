/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetManager;

import Clases.*;
import java.util.Date;
public class PetManager {
    public static void main(String[] args){
        ClsDog dog1 = new ClsDog("Pincher", false, "001", "Mariposa", 2022, "Negro", "Sano");
        
        ClsCat cat2 = new ClsCat("Angora", "002", "Bayli", 2021, "Blanco y Negro", "Sano");
        
       Date fecha_actual = new Date();
        int anioActual = fecha_actual.getYear();
        
        int edadpet1 = anioActual - dog1.getAño_nacimiento();
        int edadpet2 = anioActual - cat2.getAño_nacimiento();
        
        if(edadpet1 > edadpet2){
            System.out.println("La mascota " + dog1.getNombre() + " es mayor que la mascota " + cat2.getNombre());
        }else{
            if(edadpet2 > edadpet1){
                System.out.println("La mascota " + cat2.getNombre() + " es mayor que la mascota " + dog1.getNombre());
            }else{
                System.out.println("La mascota " + dog1.getNombre() + " tiene la misma edad que la mascota " + cat2.getNombre());

            }
        }
        
        dog1.Eat();
        cat2.Eat();
        cat2.Mover();
        cat2.Sonar();
        
        dog1.Caminar();
        cat2.SelfCleaning();
    }
}
