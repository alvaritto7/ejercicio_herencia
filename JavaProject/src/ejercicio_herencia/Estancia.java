
package ejercicio_herencia;

/**
 * @author Alumno
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

abstract class Estancia {
    protected String nombre;
    protected double metrosCuadrados;
    protected int numeroPuertas;
    protected int numeroVentanas;

    public Estancia(String nombre, double metrosCuadrados, int numeroPuertas, int numeroVentanas) {
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.numeroPuertas = numeroPuertas;
        this.numeroVentanas = numeroVentanas;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public abstract void mostrarInfo();
    
    }

