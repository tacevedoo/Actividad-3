package EjercicioPropuesto23;
public class EcuacionSegundoGrado {
	public static double A;
	public static double B;
	public static double C;
	
	public static String PosiblesSoluciones(){
		double x1, x2;
		String mensaje = "";
		if(Math.sqrt(Math.pow(B, 2)-(4.0*A*C)) > 0) {
			x1 = ((-1.0 * B) + (Math.sqrt(Math.pow(B, 2) - (4.0 * A * C)))) / (2.0 * A);
			x2 = ((-1.0 * B) - (Math.sqrt(Math.pow(B, 2) - (4.0 * A * C)))) / (2.0 * A);
			mensaje = "Primera solución: " + x1 + " Segunda solución: " + x2;
		}else if(Math.sqrt(Math.pow(B, 2)-(4.0*A*C)) == 0) {
			x1 = (-1.0 * B)/(2.0*A);
			mensaje = "La única solución es: " + x1;
		}else {
			mensaje = "La ecuación no tiene solución en los reales";
		}
		return mensaje;
	}
}
