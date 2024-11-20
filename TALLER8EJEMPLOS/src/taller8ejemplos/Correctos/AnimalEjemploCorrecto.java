/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Ejemplo Correcto 1: Clase Animal y Clase Perro
// Este ejemplo muestra cómo la clase Perro hereda atributos y métodos de Animal.
// También agrega nuevos atributos y sobrescribe un método.

public class AnimalEjemploCorrecto {
    protected String especie;  // Atributo protegido para herencia

    // Constructor
    public AnimalEjemploCorrecto(String especie) {
        this.especie = especie;
    }

    // Método para emitir un sonido genérico
    public void emitirSonido() {
        System.out.println("El animal hace un sonido.");
    }

    // Método para mostrar la especie del animal
    public void mostrarEspecie() {
        System.out.println("Especie: " + especie);
    }
}

class PerroEjemploCorrecto extends AnimalEjemploCorrecto {
    private String raza;  // Atributo adicional de la clase Perro

    // Constructor
    public PerroEjemploCorrecto(String especie, String raza) {
        super(especie);  // Llama al constructor de la clase base
        this.raza = raza;
    }

    // Nuevo método para ladrar
    public void ladrar() {
        System.out.println("El perro ladra.");
    }

    // Sobrescribimos el método emitirSonido
    @Override
    public void emitirSonido() {
        System.out.println("El perro ladra.");
    }

    // Clase de prueba
    public static void main(String[] args) {
        PerroEjemploCorrecto perro = new PerroEjemploCorrecto("Mamifero", "Golden Retriever");
        perro.mostrarEspecie();  // Muestra la especie
        perro.emitirSonido();  // Llama al método sobrescrito
        perro.ladrar();  // Llama al nuevo método
    }
}
