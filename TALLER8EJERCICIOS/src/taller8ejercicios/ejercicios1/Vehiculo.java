/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios1;

/**
 *
 * @author yoven
 */
// Clase Vehiculo
// Representa un vehículo con atributos básicos como marca y velocidad máxima.

public class Vehiculo {
    protected String marca;  // Atributo protegido
    protected double velocidadMaxima;  // Atributo protegido

    // Constructor
    public Vehiculo(String marca, double velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para mostrar la información del vehículo
    public void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Velocidad maxima: " + velocidadMaxima + " km/h");
    }
}
