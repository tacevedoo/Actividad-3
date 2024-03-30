package EjercicioResuelto7;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel numero_a, numero_b, resultado;
	private JTextField campo_a, campo_b;
	private JButton calcular, limpiar;
	
	public VentanaPrincipal() {
		inicio();
		setTitle("Comparador de Números");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		numero_a = new JLabel();
		numero_a.setText("Número 1: ");
		numero_a.setBounds(20, 30, 135, 23);
		campo_a = new JTextField();
		campo_a.setBounds(140, 30, 135, 23);
		
		numero_b = new JLabel();
		numero_b.setText("Número 2: ");
		numero_b.setBounds(20, 60, 135, 23);
		campo_b = new JTextField();
		campo_b.setBounds(140, 60, 135, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 140, 100, 23); 
		calcular.addActionListener(this);
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(125, 140, 80, 23); 
		limpiar.addActionListener(this);
		
		resultado = new JLabel();
		resultado.setText("");
		resultado.setBounds(20, 180, 200, 23);
		
		
		contenedor.add(numero_a);
		contenedor.add(numero_b);
		contenedor.add(campo_a);
		contenedor.add(campo_b);
		contenedor.add(resultado);
		contenedor.add(calcular);
		contenedor.add(limpiar);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			Comparar Com = new Comparar(Double.parseDouble(campo_a.getText()), Double.parseDouble(campo_b.getText()));
			String mensaje = Com.CompararNum();
			resultado.setText(mensaje);
		}
		
		if (evento.getSource() == limpiar) {
			campo_a.setText("");
			campo_b.setText("");
			resultado.setText("");
		}
	}
}