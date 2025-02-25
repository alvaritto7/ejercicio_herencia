/**
 * 
 */
package ejercicio_herencia;

import java.util.ArrayList;

/**
 * @author Alumno
 *
 */
class Casa {
    private ArrayList<Estancia> estancias = new ArrayList<>();

    public void agregarEstancia(Estancia estancia) {
        estancias.add(estancia);
    }

    public double calcularMetrosCuadrados() {
        double total = 0;
        for (Estancia estancia : estancias) {
            total += estancia.getMetrosCuadrados();
        }
        return total;
    }

    public void mostrarInfo() {
        for (Estancia estancia : estancias) {
            estancia.mostrarInfo();
        }
        System.out.println("Total metros cuadrados: " + calcularMetrosCuadrados() + "m²");
    }
}
