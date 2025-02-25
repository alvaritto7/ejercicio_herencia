/**
 * 
 */
package ejercicio_herencia;

import com.sun.java_cup.internal.runtime.Scanner;

/**
 * @author Alumno
 * 
 */
public class habitacion extends Estancia {
	

	int numpuertasarmario;
	boolean accesobanio;

	public int Getnumpuertasarmario() {
		return numpuertasarmario;
	}

	public void Setnumpuertasarmario(int numpuertasarmario) {
		numpuertasarmario = this.numpuertasarmario;
	}

	public boolean Getaccesobanio() {
		return accesobanio;
	}

	public void Setaccesobanio(boolean accesobanio) {
		accesobanio = this.accesobanio;
	}
}
