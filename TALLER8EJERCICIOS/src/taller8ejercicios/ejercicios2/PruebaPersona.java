/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios2;

/**
 *
 * @author yoven
 */
// Clase de prueba para Persona y Estudiante

public class PruebaPersona {
    public static void main(String[] args) {
        // Creamos un objeto de tipo Persona
        Persona persona = new Persona("Carlos", 30);
        persona.mostrarDetalles();

        // Creamos un objeto de tipo Estudiante
        Estudiante estudiante = new Estudiante("Laura", 20, "20231001");
        estudiante.mostrarDetalles();
    }
}
