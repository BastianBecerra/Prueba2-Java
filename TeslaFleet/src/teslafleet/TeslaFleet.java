/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teslafleet;

import cl.duoc.models.Autos;
import cl.duoc.models.Bicicletas;
import cl.duoc.models.Motos;
import cl.duoc.models.Vehiculo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class TeslaFleet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        //Vehiculos
        Autos auto1 = new Autos("ATO-001", true, "Auto", "Chevrolet", 2,false);
        Autos auto2 = new Autos("ATO-012", true, "Auto", "Camaron", 3,true);
        Autos auto3 = new Autos("ATO-945", true, "Auto", "Susuki", 5,false);
        List<Autos> listaAutos = new ArrayList<>();
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        listaAutos.add(auto3);
        
        Motos motos1 = new Motos("MTS-456", false, "Moto", "Dino", 2,true);
        Motos motos2= new Motos("MTS-415", true, "Moto", "Cheft", 9,false);
        List<Motos> listaMotos = new ArrayList<>();
        listaMotos.add(motos1);
        listaMotos.add(motos2);
        
        Bicicletas bici1 = new Bicicletas("BTA-101", true, "Bici electrica", "Madera", 1, "Aire");
        Bicicletas bici2 = new Bicicletas("BTA-200", true, "Mici Electrica", "Aluminio", 2, "Manual");
        List<Bicicletas> listadoBicis = new ArrayList<>();
        listadoBicis.add(bici1);
        listadoBicis.add(bici2);

        List<Object> coleccion = new ArrayList<>();
        
        int opcion = 0;
        
        while(opcion != 4){
            
            System.out.println("1- Ver vehiculos");
            System.out.println("2- Seleccionar vehiculo");
            System.out.println("3- Calculo del valorAlquiler");
            System.out.println("3- Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                case 1:
                    System.out.println("Estos son los vehiculos disponibles!!!");
                    int index = 1;
                    for(Vehiculo mostrarVehiculos : listaAutos){
                        System.out.println(index++ + " - " + mostrarVehiculos.getId()+ " - " + mostrarVehiculos.getVehiculo() + " - " + mostrarVehiculos.getMarca());
                    }
                    
                    for(Vehiculo mostrarVehiculos : listaMotos){
                        System.out.println(index++ + " - " + mostrarVehiculos.getId()+ " - " + mostrarVehiculos.getVehiculo() + " - " + mostrarVehiculos.getMarca());
                    }
                    
                    for(Vehiculo mostrarVehiculos : listadoBicis){
                        System.out.println(index++ + " - " + mostrarVehiculos.getId()+ " - " + mostrarVehiculos.getVehiculo() + " - " + mostrarVehiculos.getMarca());
                    }
                    
                    System.out.println("Hay en total "+ (index - 1) + " de vehiculos");
                    break;
                case 2:
                    System.out.println("Vamos a hacer una coleccion!!, del 1 al 10");
                    int seleccion = entrada.nextInt();
                    index = 1;
                    
                    if(seleccion >= index && seleccion < listaAutos.size()){
                        Autos i = listaAutos.get(index);
                        break;
                    }
                    
                       
                    int contadorAutos = 0;
                    int contadorMotos = 0;
                    int contadorBicis = 0;
                    
                    for(Object i : coleccion){
                        if( i instanceof Autos)contadorAutos++;
                        if( i instanceof Motos)contadorMotos++;
                        if( i instanceof Bicicletas)contadorBicis++;
                        
                        System.out.println("Autos: " + contadorAutos);
                        System.out.println("Autos: " + contadorMotos);
                        System.out.println("Autos: " + contadorBicis);
                    }
                    break;
                case 3:
                    System.out.println("Este es el valor total de cada Vehiculo...");
                    auto1.costoAlquiler(115);
                    auto2.costoAlquiler(022);
                    auto3.costoAlquiler(456);
                    motos1.costoAlquiler(25);
                    motos2.costoAlquiler(77);
                    bici1.costoAlquiler(50);
                    bici1.costoAlquiler(0);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        }
    }
    
}
