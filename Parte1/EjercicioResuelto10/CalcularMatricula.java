package EjercicioResuelto10;
public class CalcularMatricula {
	private int numero;
	private String nombre;
	private double patrimonio;
	private int estrato;
	
	public CalcularMatricula(int numero, String nombre, double patrimonio, int estrato) {
		this.numero = numero;
		this.nombre = nombre;
		this.patrimonio = patrimonio;
		this.estrato = estrato;
	}
	
	public String Matricula() {
		double pago = 50000;
		String mensaje;
		if(patrimonio > 2000000 && estrato > 3) {
			pago = pago + (0.03*patrimonio);
			mensaje = "El estudiante con número de inscripción " + numero + " y nombre " + nombre + " debe pagar: $" + pago;
		}else {
			mensaje = "El estudiante con número de inscripción " + numero + " y nombre " + nombre + " debe pagar: $" + pago;
		}
		return mensaje;
	}
}
