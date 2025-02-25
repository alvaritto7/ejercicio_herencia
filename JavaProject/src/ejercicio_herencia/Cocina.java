package ejercicio_herencia;

class Cocina extends Estancia {
	private boolean tieneTendedero;
	private double metrosTendedero;

	public Cocina(double metrosCuadrados, int numeroPuertas, int numeroVentanas, boolean tieneTendedero,
			double metrosTendedero) {
		super("Cocina", metrosCuadrados, numeroPuertas, numeroVentanas);
		this.tieneTendedero = tieneTendedero;
		this.metrosTendedero = tieneTendedero ? metrosTendedero : 0;
	}

	public double getMetrosCuadrados() {
		return metrosCuadrados + metrosTendedero;
	}

	public void mostrarInfo() {
		System.out.println("Cocina: " + metrosCuadrados + "m², " + numeroPuertas + " puertas, " + numeroVentanas
				+ " ventanas, Tendedero: " + tieneTendedero + " (" + metrosTendedero + "m²)");
	}
}
