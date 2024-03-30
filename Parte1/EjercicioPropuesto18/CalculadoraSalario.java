package EjercicioPropuesto18;
public class CalculadoraSalario {
	public static int codigo;
	public static String nombre;
	public static double horas;
	public static double valor_hora;
	public static double retencion;
	
	public double calcularSalarioBruto() {
			double salario_bruto = horas * valor_hora;
			return salario_bruto;
	}
	
	public double calcularSalarioNeto(double salario_bruto) {
			double salario_neto = salario_bruto - (salario_bruto * retencion);
			return salario_neto;
	}
}
