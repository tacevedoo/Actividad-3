package ClasesSobreFigurasGeometricas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaCirculo extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel radio, area, perimetro;
	private JTextField campo_radio;
	private JButton calcular;
	
	public VentanaCirculo() {
		inicio();
		setTitle("Círculo");
		setSize(400,400); 
		setLocationRelativeTo(null);
		setResizable(false); 
	}
	
	private void inicio() {
		contenedor = getContentPane(); 
		contenedor.setLayout(null);
		
		radio = new JLabel();
		radio.setText("Radio(cms): ");
		radio.setBounds(20, 20, 135, 23);
		campo_radio = new JTextField();
		campo_radio.setBounds(120, 20, 135, 23);
		
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

		
		contenedor.add(radio);
		contenedor.add(campo_radio);
		contenedor.add(area);
		contenedor.add(perimetro);
		contenedor.add(calcular);
	}
	
	public void actionPerformed(ActionEvent event) {
		circulo Circulo;
		boolean error = false;
		double a = 0;
		double p = 0;
		try {
			Circulo = new circulo(Integer.parseInt(campo_radio.getText()));
			a = Circulo.calcularArea();
			p = Circulo.calcularPerimetro();
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