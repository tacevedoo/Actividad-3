package EjercicioPropuesto41;
import java.util.Vector;

public class ListaNumeros {
	Vector<?> ListaNumeros;
	
	public ListaNumeros() {
		ListaNumeros = new Vector<Object>();
	}
	
	public String calcularMayor(Vector<Integer> Numeros) {
		String mensaje = "";
		int mayor = 0;
		for (int numero : Numeros) {
	         if (numero > mayor) {
	        	 mayor = numero;
	         }
	    }
		mensaje = "El número mayor es: " + mayor;
	    return mensaje;
	}
	
	public void borrarLista() {
		ListaNumeros.removeAllElements();
	}
	
	public void eliminarNumero(int i) {
		if (i >= 0 && ListaNumeros.size() > 0) {
			ListaNumeros.removeElementAt(i);
		}
	}
}
