package EjercicioResuelto7;
public class Comparar {
	private double A;
	private double B;
	
	public Comparar(double A, double B) {
		this.A = A;
		this.B = B;
	}
	
	public String CompararNum() {
		String mensaje;
		if (A > B) {
            mensaje = A + " ES MAYOR QUE " + B;
        }else if (A == B) {
        	mensaje = "LOS NÚMEROS SON IGUALES.";
        }else {
        	mensaje = B + " ES MAYOR QUE " + A;
        }
		return mensaje;
	}
}