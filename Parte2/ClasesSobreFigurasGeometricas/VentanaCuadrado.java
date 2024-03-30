package ClasesSobreFigurasGeometricas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCuadrado extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel lado, area, perimetro;
	private JTextField campo_lado;
	private JButton calcular;
	
	public VentanaCuadrado() {
		inicio();
		setTitle("Cuadrado");
		setSize(400,400); 
		setLocationRelativeTo(null);
		setResizable(false); 
	}
	
	private void inicio() {
		contenedor = getContentPane(); 
		contenedor.setLayout(null);
		
		lado = new JLabel();
		lado.setText("Lado(cms): ");
		lado.setBounds(20, 20, 135, 23);
		campo_lado = new JTextField();
		campo_lado.setBounds(120, 20, 135, 23);
		
		area = new JLabel();
		area.setText("Área (cm2): ");
		area.setBounds(20, 140, 200, 23);
		
		perimetro = new JLabel();
		perimetro.setText("Perímetro (cm): ");
		perimetro.setBounds(20, 160, 200, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(120, 110, 135, 23);
		calcular.addActionListener(this);
		
		contenedor.add(lado);
		contenedor.add(campo_lado);
		contenedor.add(area);
		contenedor.add(perimetro);
		contenedor.add(calcular);
	}
	
	public void actionPerformed(ActionEvent event) {
		cuadrado Cuadrado;
		boolean error = false;
		double a = 0;
		double p = 0;
		try {
			Cuadrado = new cuadrado(Integer.parseInt(campo_lado.getText()));
			a = Cuadrado.calcularArea();
			p = Cuadrado.calcularPerimetro();
			area.setText("Área (cm2): " + a);
			perimetro.setText("Perímetro (cm): " + p);
			
		} catch (Exception e) {
			error = true; 
		} finally {
			if (error) { 
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}