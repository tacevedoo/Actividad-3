package EjercicioPropuesto19;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel lado, perimetro, altura, area;
	private JTextField campo_lado;
	private JButton calcular, limpiar;
	
	public VentanaPrincipal() {
		inicio();
		setTitle("Triángulo Equilátero");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		lado = new JLabel();
		lado.setText("Lado: ");
		lado.setBounds(20, 30, 135, 23);
		campo_lado = new JTextField();
		campo_lado.setBounds(140, 30, 135, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 140, 100, 23); 
		calcular.addActionListener(this);
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(125, 140, 80, 23); 
		limpiar.addActionListener(this);
		
		perimetro = new JLabel();
		perimetro.setText("Perímetro = ");
		perimetro.setBounds(20, 180, 135, 23);
		altura = new JLabel();
		altura.setText("Altura = ");
		altura.setBounds(20, 200, 135, 23);
		area = new JLabel();
		area.setText("Área = ");
		area.setBounds(20, 220, 135, 23);
		
		contenedor.add(lado);
		contenedor.add(perimetro);
		contenedor.add(altura);
		contenedor.add(area);
		contenedor.add(campo_lado);
		contenedor.add(calcular);
		contenedor.add(limpiar);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) {
			TrianguloEquilatero TE = new TrianguloEquilatero(Double.parseDouble(campo_lado.getText()));
			double peri = TE.calcularPerimetro();
			double a = TE.calcularArea();
			double alt = TE.calcularAltura(a);
			perimetro.setText("Perímetro = " + peri);
			area.setText("Área = " + a);
			altura.setText("Altura = " + alt);
		}
		
		if (evento.getSource() == limpiar) {
			campo_lado.setText("");
			perimetro.setText("");
			altura.setText("");
			area.setText("");
		}
	}
}