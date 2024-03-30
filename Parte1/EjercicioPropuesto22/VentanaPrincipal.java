package EjercicioPropuesto22;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel nombre, sal_hora, num_horas, salario, nombre_final;
	private JTextField campo_nombre, campo_sal_hora, campo_num_horas;
	private JButton calcular, limpiar;
	
	public VentanaPrincipal() {
		inicio();
		setTitle("Calculadora de salario mensual");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		nombre = new JLabel();
		nombre.setText("Nombre: ");
		nombre.setBounds(20, 40, 160, 23);
		campo_nombre = new JTextField();
		campo_nombre.setBounds(190, 40, 120, 23);
		
		sal_hora = new JLabel();
		sal_hora.setText("Salario básico por hora: ");
		sal_hora.setBounds(20, 60, 160, 23);
		campo_sal_hora = new JTextField();
		campo_sal_hora.setBounds(190, 60, 120, 23);
		
		num_horas = new JLabel();
		num_horas.setText("Número de horas trabajadas: ");
		num_horas.setBounds(20, 80, 200, 23);
		campo_num_horas = new JTextField();
		campo_num_horas.setBounds(190, 80, 120, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 120, 100, 23); 
		calcular.addActionListener(this);
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(125, 120, 80, 23); 
		limpiar.addActionListener(this);
		
		nombre_final = new JLabel();
		nombre_final.setText("");
		nombre_final.setBounds(20, 140, 800, 60);
		
		salario = new JLabel();
		salario.setText("");
		salario.setBounds(20, 180, 800, 60);
		
		contenedor.add(nombre);
		contenedor.add(campo_nombre);
		contenedor.add(sal_hora);
		contenedor.add(campo_sal_hora);
		contenedor.add(num_horas);
		contenedor.add(campo_num_horas);
		contenedor.add(salario);
		contenedor.add(nombre_final);
		contenedor.add(calcular);
		contenedor.add(limpiar);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			EvaluarSalario.nombre = campo_nombre.getText();
			EvaluarSalario.sal_hora = Double.parseDouble(campo_sal_hora.getText());
			EvaluarSalario.num_horas = Double.parseDouble(campo_num_horas.getText());
			double salario_mensual = EvaluarSalario.SalarioMensual();
			nombre_final.setText("Nombre del empleado: " + campo_nombre.getText());
			if(salario_mensual == -1) {
				salario.setText("");
			}else {
				salario.setText("Salario mensual: " + salario_mensual);
			}
		}
		
		if (evento.getSource() == limpiar) {
			campo_nombre.setText("");
			campo_sal_hora.setText("");
			campo_num_horas.setText("");
			salario.setText("");
			nombre_final.setText("");
		}
	}
	
}