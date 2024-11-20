/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios2;

/**
 *
 * @author yoven
 */
// Clase Estudiante
// Hereda de Persona y agrega un atributo adicional: matricula.

public class Estudiante extends Persona {
    private String matricula;  // Atributo adicional

    // Constructor
    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);  // Llama al constructor de la clase base
        this.matricula = matricula;
    }

    // Método sobrescrito para mostrar los detalles del estudiante
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base
        System.out.println("Matricula: " + matricula);
    }
}
