/**
 * 
 */
package ejercicio_herencia;

/**
 * @author Alumno
 *
 */
class Hall extends Estancia {
    private boolean puertaBlindada;

    public Hall(double metrosCuadrados, int numeroPuertas, int numeroVentanas, boolean puertaBlindada) {
        super("Hall", metrosCuadrados, numeroPuertas, numeroVentanas);
        this.puertaBlindada = puertaBlindada;
    }

   
    public void mostrarInfo() {
        System.out.println("Hall: " + metrosCuadrados + "m², " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, Puerta Blindada: " + puertaBlindada);
    }
}
