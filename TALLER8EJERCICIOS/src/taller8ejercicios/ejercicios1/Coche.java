/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios1;

/**
 *
 * @author yoven
 */
// Clase Coche
// Hereda de Vehiculo y agrega un atributo adicional: numeroDePuertas.

public class Coche extends Vehiculo {
    private int numeroDePuertas;  // Atributo adicional

    // Constructor
    public Coche(String marca, double velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);  // Llama al constructor de la clase base
        this.numeroDePuertas = numeroDePuertas;
    }

    // Método para mostrar la información del coche
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();  // Llama al método de la clase base
        System.out.println("Numero de puertas: " + numeroDePuertas);
    }
}
