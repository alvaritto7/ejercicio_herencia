/**
 * 
 */
package ejercicio_herencia;

/**
 * 
 */
class Banio extends Estancia {
    private String tipo;

    public Banio(double metrosCuadrados, int numeroPuertas, int numeroVentanas, String tipo) {
        super("Banio", metrosCuadrados, numeroPuertas, numeroVentanas);
        this.tipo = tipo;
    }

  
    public void mostrarInfo() {
        System.out.println("Baño: " + metrosCuadrados + "m², " + numeroPuertas + " puertas, " + numeroVentanas + " ventanas, Tipo: " + tipo);
    }
}

