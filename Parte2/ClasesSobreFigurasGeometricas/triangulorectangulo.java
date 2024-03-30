package ClasesSobreFigurasGeometricas;
public class triangulorectangulo {
	int base;
	int altura;
	
	public triangulorectangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	double calcularArea() {
		return (base*altura/2);
	}
	
	double calcularPerimetro() {
		return (base + altura + calcularHipotenusa());
	}
	
	double calcularHipotenusa() {
		return Math.pow(base*base + altura*altura, 0.5);
	}
	
	String determinarTipoTriangulo() {
		String mensaje = "";
		if((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa())) {
			mensaje = "Es un triángulo equilátero";
		}else if((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa())) {
			mensaje = "Es un triángulo escaleno";
		}else {
			mensaje = "Es un triángulo isósceles";
		}
		return mensaje;
	}
}
