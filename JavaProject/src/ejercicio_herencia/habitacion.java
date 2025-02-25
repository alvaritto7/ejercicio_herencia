/**
 * 
 */
package ejercicio_herencia;



/**
 * @author Alumno
 * 
 */
class Habitacion extends Estancia {
    private int puertasArmario;
    private boolean accesoBanio;

    public Habitacion(double metrosCuadrados, int numeroPuertas, int numeroVentanas, int puertasArmario, boolean accesoBanio) {
        super("Habitación", metrosCuadrados, numeroPuertas, numeroVentanas);
        this.puertasArmario = puertasArmario;
        this.accesoBanio = accesoBanio;
    }

    
    public void mostrarInfo() {
        System.out.println("Habitación: " + metrosCuadrados + "m², " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, Armario: " + puertasArmario + " puertas, Acceso directo a baño: " + accesoBanio);
    }
}

