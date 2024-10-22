/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public abstract class Vehiculo {
    
    protected String id, vehiculo, marca;
    protected boolean mantencion;
    
    public Vehiculo() {
    }
    
    public Vehiculo(String id, boolean mantencion, String vehiculo, String marca){
        this.id = id;
        this.vehiculo = vehiculo;
        this.marca = marca;
        this.mantencion = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getVehiculo(){
        return vehiculo;
    }
    
    public void setVehiculo(String vehiculo){
        this.vehiculo = vehiculo;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    public boolean isMantencion() {
        return mantencion;
    }

    public void setMantencion(boolean mantencion) {
        this.mantencion = mantencion;
    }
    
    
    //Metodo para ver el vehiculo
    
    public void mostrarInfo(){
        System.out.println("id vehiculo" + id + ", Vehiculo: " + vehiculo + ", Necesita mantenciòn? " + mantencion);
    }
    
    
}
