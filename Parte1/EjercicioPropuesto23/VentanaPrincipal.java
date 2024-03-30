package EjercicioPropuesto23;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel A, B, C, mensaje;
	private JTextField campo_A, campo_B, campo_C;
	private JButton calcular, limpiar;
	
	public VentanaPrincipal() {
		inicio();
		setTitle("Calculadora de ecuaciones de segundo grado");
		setSize(600,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		A = new JLabel();
		A.setText("Ingrese A: ");
		A.setBounds(20, 40, 160, 23);
		campo_A = new JTextField();
		campo_A.setBounds(190, 40, 120, 23);
		
		B = new JLabel();
		B.setText("Ingrese B: ");
		B.setBounds(20, 60, 160, 23);
		campo_B = new JTextField();
		campo_B.setBounds(190, 60, 120, 23);
		
		C = new JLabel();
		C.setText("Ingrese C: ");
		C.setBounds(20, 80, 200, 23);
		campo_C = new JTextField();
		campo_C.setBounds(190, 80, 120, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 120, 100, 23); 
		calcular.addActionListener(this);
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(125, 120, 80, 23); 
		limpiar.addActionListener(this);
		
		mensaje = new JLabel();
		mensaje.setText("");
		mensaje.setBounds(20, 140, 800, 60);
		
		contenedor.add(A);
		contenedor.add(B);
		contenedor.add(C);
		contenedor.add(campo_A);
		contenedor.add(campo_B);
		contenedor.add(campo_C);
		contenedor.add(mensaje);
		contenedor.add(calcular);
		contenedor.add(limpiar);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			EcuacionSegundoGrado.A = Double.parseDouble(campo_A.getText());
			EcuacionSegundoGrado.B = Double.parseDouble(campo_B.getText());
			EcuacionSegundoGrado.C = Double.parseDouble(campo_C.getText());
			String respuesta = EcuacionSegundoGrado.PosiblesSoluciones();
			mensaje.setText(respuesta);
		}

		if (evento.getSource() == limpiar) {
			campo_A.setText("");
			campo_B.setText("");
			campo_C.setText("");
			mensaje.setText("");
		}
	}
	
}