package EjercicioPropuesto22;
public class EvaluarSalario {
	public static String nombre;
	public static double sal_hora;
	public static double num_horas;
	
	public static double SalarioMensual() {
		double salario_mensual = -1;
		double salario = sal_hora * num_horas;
		if(salario > 450000) {
			salario_mensual = sal_hora * num_horas;
		}
		return salario_mensual;
	}
}