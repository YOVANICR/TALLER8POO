/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller8ejemplos.Correctos;

/**
 *
 * @author yoven
 */
// Ejemplo Correcto 2: Clase Empleado y Clase Gerente
// En este código, Gerente hereda de Empleado, agrega un atributo adicional y sobrescribe un método.

public class EmpleadoEjemploCorrecto {
    protected String nombre;  // Atributo protegido para herencia
    protected double salario;  // Atributo protegido para herencia

    // Constructor
    public EmpleadoEjemploCorrecto(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para mostrar detalles del empleado
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Salario: " + salario);
    }
}

class GerenteEjemploCorrecto extends EmpleadoEjemploCorrecto {
    private String departamento;  // Atributo adicional de Gerente

    // Constructor
    public GerenteEjemploCorrecto(String nombre, double salario, String departamento) {
        super(nombre, salario);  // Llama al constructor de la clase base
        this.departamento = departamento;
    }

    // Sobrescribimos el método para mostrar detalles
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();  // Llama al método de la clase base
        System.out.println("Departamento: " + departamento);
    }

    // Clase de prueba
    public static void main(String[] args) {
        GerenteEjemploCorrecto gerente = new GerenteEjemploCorrecto("Ana", 5000, "Ventas");
        gerente.mostrarDetalles();  // Muestra detalles del gerente
    }
}
