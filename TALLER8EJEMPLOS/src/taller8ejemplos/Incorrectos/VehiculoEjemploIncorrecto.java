/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejemplos.Incorrectos;

/**
 *
 * @author yoven
 */
// Ejemplo Incorrecto 2: Intentar acceder a atributos privados de la clase base
// Este ejemplo genera un error porque los atributos privados no son accesibles desde la clase derivada.

public class VehiculoEjemploIncorrecto {
    private String marca;  // Atributo privado

    // Constructor
    public VehiculoEjemploIncorrecto(String marca) {
        this.marca = marca;
    }
}

class CocheEjemploIncorrecto extends VehiculoEjemploIncorrecto {
    public CocheEjemploIncorrecto(String marca) {
        super(marca);  // Llama al constructor de la clase base
    }

    // Esto genera un error
    /*
    public void mostrarMarca() {
        System.out.println(marca);  // Error: 'marca' tiene acceso privado
    }
    */
}
