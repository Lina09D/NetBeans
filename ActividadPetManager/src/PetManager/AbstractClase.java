/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PetManager;

import Clases.ClsDoctor;
import Clases.ClsVeterinary;

/**
 *
 * @author Tatiana
 */
public class AbstractClase {
    public static void main(String[] args) {
        // Instancia de veterinaria
                ClsDoctor doctor = new ClsDoctor("Sergio Lopéz", "J1234");
                ClsVeterinary veterinario = new ClsVeterinary("Juana Garzón", "3245672311", "Bilbao",doctor);
                
                veterinario.setData(veterinario.getNombre() + " - " + veterinario.getDireccion());
                
                String data = veterinario.getInformacionHospital();
                String type = veterinario.getTipoDePaciente();
                String surger = veterinario.Surgery();
                                
                System.out.println("Data: " + data);
                System.out.println("Type: " + type);
                System.out.println("Surger: " + surger);
    }
}
