package ClasesSobreFigurasGeometricas;
public class circulo {
	int radio;
	
	circulo(int radio){
		this.radio = radio;
	}
	
	double calcularArea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	double calcularPerimetro() {
		return 2*Math.PI*radio;
	}
}