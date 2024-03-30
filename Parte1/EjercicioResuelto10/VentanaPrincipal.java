package EjercicioResuelto10;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel numero, nombre, patrimonio, estrato, pago_matricula;
	private JTextField campo_numero, campo_nombre, campo_patrimonio, campo_estrato;
	private JButton calcular, limpiar;
	
	public VentanaPrincipal() {
		inicio();
		setTitle("Matrícula Estudiante");
		setSize(800,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		numero = new JLabel();
		numero.setText("Número de inscripción: ");
		numero.setBounds(20, 20, 135, 23);
		campo_numero = new JTextField();
		campo_numero.setBounds(160, 20, 135, 23);
		
		nombre = new JLabel();
		nombre.setText("Nombre: ");
		nombre.setBounds(20, 40, 135, 23);
		campo_nombre = new JTextField();
		campo_nombre.setBounds(160, 40, 135, 23);
		
		patrimonio = new JLabel();
		patrimonio.setText("Patrimonio: ");
		patrimonio.setBounds(20, 60, 135, 23);
		campo_patrimonio = new JTextField();
		campo_patrimonio.setBounds(160, 60, 135, 23);
		
		estrato = new JLabel();
		estrato.setText("Estrato social: ");
		estrato.setBounds(20, 80, 135, 23);
		campo_estrato = new JTextField();
		campo_estrato.setBounds(160, 80, 135, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 120, 100, 23); 
		calcular.addActionListener(this);
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(125, 120, 80, 23); 
		limpiar.addActionListener(this);
		
		pago_matricula = new JLabel();
		pago_matricula.setText("");
		pago_matricula.setBounds(20, 140, 800, 23);
		
		contenedor.add(numero);
		contenedor.add(nombre);
		contenedor.add(patrimonio);
		contenedor.add(estrato);
		contenedor.add(pago_matricula);
		contenedor.add(campo_numero);
		contenedor.add(campo_nombre);
		contenedor.add(campo_patrimonio);
		contenedor.add(campo_estrato);
		contenedor.add(calcular);
		contenedor.add(limpiar);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			CalcularMatricula CM = new CalcularMatricula(Integer.parseInt(campo_numero.getText()), campo_nombre.getText(), Double.parseDouble(campo_patrimonio.getText()), Integer.parseInt(campo_estrato.getText()));
			String mensaje = CM.Matricula();
			pago_matricula.setText(mensaje);
		}
		
		if (evento.getSource() == limpiar) {
			campo_numero.setText("");
			campo_nombre.setText("");
			campo_patrimonio.setText("");
			campo_estrato.setText("");
			pago_matricula.setText("");
		}
	}
}
