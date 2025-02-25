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
    private boolean accesoBa�o;

    public Habitacion(double metrosCuadrados, int numeroPuertas, int numeroVentanas, int puertasArmario, boolean accesoBa�o) {
        super("Habitaci�n", metrosCuadrados, numeroPuertas, numeroVentanas);
        this.puertasArmario = puertasArmario;
        this.accesoBa�o = accesoBa�o;
    }

    
    public void mostrarInfo() {
        System.out.println("Habitaci�n: " + metrosCuadrados + "m�, " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, Armario: " + puertasArmario + " puertas, Acceso directo a ba�o: " + accesoBa�o);
    }
}

