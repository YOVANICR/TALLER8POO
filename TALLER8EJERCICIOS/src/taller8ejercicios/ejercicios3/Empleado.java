/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios3;

/**
 *
 * @author yoven
 */
// Clase Empleado
// Representa a un empleado con atributos básicos como nombre y salario.

public class Empleado {
    protected String nombre; 
    protected double salario;  

    // Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar los detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}
