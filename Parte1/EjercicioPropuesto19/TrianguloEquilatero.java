package EjercicioPropuesto19;
public class TrianguloEquilatero {
	private double lado;
	
	public TrianguloEquilatero(double lado) {
		this.lado = lado;
	}
	
	public double calcularPerimetro() {
		double perimetro = lado + lado + lado;
		return perimetro;
	}
	
	public double calcularAltura(double area) {
		double altura = (2 * area)/lado;
		return altura;
	}
	
	public double calcularArea() {
		double semip = (lado + lado + lado)/2;
		double area = Math.sqrt((semip * (semip - lado) * (semip - lado) * (semip - lado)));
		return area;
	}
}