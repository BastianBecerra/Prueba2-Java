/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Motos extends Vehiculo {
    private int capacidadBateria;
    private boolean modoEco;

    public Motos(String id, boolean mantencion, String vehiculo, String marca, int capacidadBateria, boolean modoEco) {
        super(id, mantencion, vehiculo, marca);
        this.capacidadBateria = capacidadBateria;
        this.modoEco = false;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public boolean isModoEco() {
        return modoEco;
    }

    public void setModoEco(boolean modoEco) {
        this.modoEco = modoEco;
    }
    
    
    public void costoAlquiler(int alquilerHora){
        int tiempo = 100;
        int total = 0;
        alquilerHora = 15000;
        
        if(tiempo == 50){
            total = (int) (alquilerHora * 1.08);
            
            System.out.println(total);
        } else{
            System.out.println(total);
        }
        
    }
    
}
