package EjercicioPropuesto40;
import java.util.Vector;

public class ListaNumeros {
	Vector<Integer> ListaNumeros;
	
	public ListaNumeros() {
		ListaNumeros = new Vector<>();
	}
	
	public String calcularNumeros(Vector<Integer> Numeros) {
		StringBuilder mensaje = new StringBuilder("<html>");
		for (int numero : Numeros) {
	        mensaje.append("Número: ").append(numero)
	                .append(" Raíz: ").append(String.format("%.2f", Math.sqrt(numero)))
	                .append(" Cuadrado: ").append(numero * numero)
	                .append(" Cubo: ").append(numero * numero * numero)
	                .append("<br>"); 
	    }
	    mensaje.append("</html>");
	    return mensaje.toString();
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
