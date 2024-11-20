/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios3;

/**
 *
 * @author yoven
 */
// Clase de prueba para Empleado y Gerente

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Empleado
        Empleado empleado = new Empleado("Luis", 3000);
        empleado.mostrarDetalles();

        // Creamos un objeto de tipo Gerente
        Gerente gerente = new Gerente("Sofia", 5000, "Marketing");
        gerente.mostrarDetalles();
    }
}
