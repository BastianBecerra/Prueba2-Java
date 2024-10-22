/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Autos extends Vehiculo {
    private int capacidad;
    private boolean autoPilot;

    public Autos(String id, boolean mantencion, String vehiculo, String marca, int capacidad, boolean autoPilot) {
        super(id, mantencion, vehiculo, marca);
        this.capacidad = capacidad;
        this.autoPilot = false;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isAutoPilot() {
        return autoPilot;
    }

    public void setAutoPilot(boolean autoPilot) {
        this.autoPilot = autoPilot;
    }
    
    
    //Metodos
    
    public void costoAlquiler( double alquilerHora){
        double total = 0;
        alquilerHora = 15000;
        
        if (autoPilot == true){
             total = alquilerHora * 1.10;
            System.out.println("El total es de: " + total);
        }else{
            System.out.println("El total es de " + alquilerHora);
        }
        
    }
    
    
    
    
}
