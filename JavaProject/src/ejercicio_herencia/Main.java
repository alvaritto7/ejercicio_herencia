/**
 * 
 */
package ejercicio_herencia;

import java.util.Scanner;

/**
 * 
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Casa casa = new Casa();
        
        System.out.print("Metros cuadrados del hall: ");
        casa.agregarEstancia(new Hall(sc.nextDouble(), 1, 1, true));
        
        System.out.print("Metros cuadrados de la cocina: ");
        casa.agregarEstancia(new Cocina(sc.nextDouble(), 1, 1, true, 3));
        
        System.out.print("Metros cuadrados del salón: ");
        casa.agregarEstancia(new Salon(sc.nextDouble(), 1, 1, 2, true, 5));
        
        System.out.print("Número de habitaciones: ");
        int numHabitaciones = sc.nextInt();
        for (int i = 0; i < numHabitaciones; i++) {
            casa.agregarEstancia(new habitacion(12, 1, 1, 2, true));
        }

        System.out.print("Número de baños: ");
        int numBaños = sc.nextInt();
        for (int i = 0; i < numBaños; i++) {
            casa.agregarEstancia(new Banio(6, 1, 1, "Ducha"));
        }

        casa.mostrarInfo();
        sc.close();
    }
}
