/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Bicicletas extends Vehiculo {
    private String tipoFreno;
    private int capacidadBateria;
    
    public Bicicletas(String id, boolean mantencion, String vehiculo, String marca, int capacidadBateria, String tipoFreno) {
        super(id, mantencion, vehiculo, marca);
        this.capacidadBateria = capacidadBateria;
        this.tipoFreno = tipoFreno;
    }

    public String getTipoFreno() {
        return tipoFreno;
    }

    public void setTipoFreno(String tipoFreno) {
        this.tipoFreno = tipoFreno;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }
    
    
    //Metodo
    
    public void costoAlquiler(int alquilerHora){
        int capacidadBateria = 100;
        int total = 0;
        alquilerHora = 15000;
        
        if(capacidadBateria < 20){
            total = (int) (alquilerHora * 1.08);
            
            System.out.println(total);
        } else{
            System.out.println(total);
        }
        
    }
}
