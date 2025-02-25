/**
 * 
 */
package ejercicio_herencia;

/**
 * @author Alumno
 *
 */


class Salon extends Estancia {
    private int tomasRed;
    private boolean tieneTerraza;
    private double metrosTerraza;

    public Salon(double metrosCuadrados, int numeroPuertas, int numeroVentanas, int tomasRed, boolean tieneTerraza, double metrosTerraza) {
        super("Salón", metrosCuadrados, numeroPuertas, numeroVentanas);
        this.tomasRed = tomasRed;
        this.tieneTerraza = tieneTerraza;
        this.metrosTerraza = tieneTerraza ? metrosTerraza : 0;
    }

    
    public double getMetrosCuadrados() {
        return metrosCuadrados + metrosTerraza;
    }

    
    public void mostrarInfo() {
        System.out.println("Salón: " + metrosCuadrados + "m², " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, Tomas de red: " + tomasRed + ", Terraza: " + tieneTerraza + " (" + metrosTerraza + "m²)");
    }
}
