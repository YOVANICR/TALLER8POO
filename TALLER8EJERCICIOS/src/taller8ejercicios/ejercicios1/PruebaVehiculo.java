/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios1;

/**
 *
 * @author yoven
 */
// Clase de prueba para Vehiculo y Coche

public class PruebaVehiculo {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Vehiculo
        Vehiculo vehiculo = new Vehiculo("Toyota", 180);
        vehiculo.mostrarInformacion();

        // Creamos un objeto de tipo Coche
        Coche coche = new Coche("Honda", 200, 4);
        coche.mostrarInformacion();
    }
}
