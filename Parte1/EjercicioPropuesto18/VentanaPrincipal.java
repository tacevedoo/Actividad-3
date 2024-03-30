package EjercicioPropuesto18;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel codigo, nombre, horas, valor_hora, retencion, salario_bruto, salario_neto;
	private JTextField campo_codigo, campo_nombre, campo_horas, campo_valor_hora, campo_retencion;
	private JButton calcular, limpiar;
	
	public VentanaPrincipal() {
			inicio();
			setTitle("Calculadora de salario Neto y Bruto");
			setSize(400,400);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setResizable(false);
			}
	
	public void inicio() {
			contenedor = getContentPane();
			contenedor.setLayout(null);

			codigo = new JLabel();
			codigo.setText("Código: ");
			codigo.setBounds(20, 30, 135, 23);
			campo_codigo = new JTextField();
			campo_codigo.setBounds(140, 30, 135, 23);
			nombre = new JLabel();
			nombre.setText("Nombre: ");
			nombre.setBounds(20, 50, 135, 23);
			campo_nombre = new JTextField();
			campo_nombre.setBounds(140, 50, 135, 23);
			horas = new JLabel();
			horas.setText("Horas trabajadas: ");
			horas.setBounds(20, 70, 135, 23);
			campo_horas = new JTextField();
			campo_horas.setBounds(140, 70, 135, 23);
			valor_hora = new JLabel();
			valor_hora.setText("precio de la hora: ");
			valor_hora.setBounds(20, 90, 135, 23);
			campo_valor_hora = new JTextField();
			campo_valor_hora.setBounds(140, 90, 135, 23);
			retencion = new JLabel();
			retencion.setText("% de retención: ");
			retencion.setBounds(20, 110, 135, 23);
			campo_retencion = new JTextField();
			campo_retencion.setBounds(140, 110, 135, 23);
			
			calcular = new JButton();
			calcular.setText("Calcular");
			calcular.setBounds(20, 140, 100, 23); 
			calcular.addActionListener(this);
			limpiar = new JButton();
			limpiar.setText("Limpiar");
			limpiar.setBounds(125, 140, 80, 23); 
			limpiar.addActionListener(this);
			
			salario_bruto = new JLabel();
			salario_bruto.setText("Salario bruto = ");
			salario_bruto.setBounds(20, 180, 300, 23);
			salario_neto = new JLabel();
			salario_neto.setText("Salario neto = ");
			salario_neto.setBounds(20, 200, 300, 23);
			
			contenedor.add(codigo);
			contenedor.add(nombre);
			contenedor.add(horas);
			contenedor.add(valor_hora);
			contenedor.add(retencion);
			contenedor.add(salario_bruto);
			contenedor.add(salario_neto);
			contenedor.add(campo_codigo);
			contenedor.add(campo_nombre);
			contenedor.add(campo_horas);
			contenedor.add(campo_valor_hora);
			contenedor.add(campo_retencion);
			contenedor.add(calcular);
			contenedor.add(limpiar);
			
			}
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			CalculadoraSalario CS = new CalculadoraSalario();
			CalculadoraSalario.codigo = Integer.parseInt(campo_codigo.getText());
			CalculadoraSalario.nombre = campo_nombre.getText();
			CalculadoraSalario.horas = Double.parseDouble(campo_horas.getText());
			CalculadoraSalario.valor_hora = Double.parseDouble(campo_valor_hora.getText());
			CalculadoraSalario.retencion = Double.parseDouble(campo_retencion.getText());
			double salBruto = CS.calcularSalarioBruto();
			double salNeto = CS.calcularSalarioNeto(salBruto);
			salario_bruto.setText("Salario bruto = " + salBruto);
			salario_neto.setText("Salario neto = " + salNeto);
		}
		
		if (evento.getSource() == limpiar) {
			campo_codigo.setText("");
			campo_nombre.setText("");
			campo_horas.setText("");
			campo_valor_hora.setText("");
			campo_retencion.setText("");
			salario_bruto.setText("");
			salario_neto.setText("");
		}
	}
}
		




