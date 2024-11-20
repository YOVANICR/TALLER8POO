/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios2;

/**
 *
 * @author yoven
 */
// Clase Persona
// Representa a una persona con atributos básicos como nombre y edad.

public class Persona {
    protected String nombre;  // Atributo protegido
    protected int edad;  // Atributo protegido

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los detalles de la persona
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
