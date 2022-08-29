/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetManager;

import Clases.*;

/**
 *
 * @author Tatiana
 */
public class Polimorfismo {
    public static void main(String[] args) {
        //Instancias de las clases hijas
                ClsDog dog = new ClsDog("Pincher", false, "001", "Mariposa", 2022, "Negro", "Sano");
                ClsCat cat = new ClsCat("Angora", "002", "Bayli", 2021, "Blanco y Negro", "Sano");
     
                // Instancia de veterinaria
                ClsDoctor doctor = new ClsDoctor("Sergio Lopéz", "J1234");
                ClsVeterinary veterinario = new ClsVeterinary("Juana Garzón", "3245672311", "Bilbao",doctor);
                
                String careDog = veterinario.PetCare(dog);
                System.out.println("El estado de salud de " + dog.getNombre() + " es " + careDog);
                
                String careCat = veterinario.PetCare(cat);
                System.out.println("El estado de salud de " + cat.getNombre() + " es " + careCat);
                
                
                
    }
}
