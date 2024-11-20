/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejercicios.ejercicios3;

/**
 *
 * @author yoven
 */
// Clase Gerente
// Hereda de Empleado y agrega un atributo adicional: departamento.

public class Gerente extends Empleado {
    private String departamento;  // Atributo adicional

    // Constructor
    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);  // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    // Método sobrescrito para mostrar los detalles del gerente
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }
}
