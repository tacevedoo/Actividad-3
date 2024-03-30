package ClasesSobreFigurasGeometricas;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JButton circulo, cuadrado, rectangulo, triangulorectangulo;
		
	public VentanaPrincipal(){
			inicio();
			setTitle("Figuras Geométricas");
			setSize(600,200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		
	private void inicio() {
			contenedor = getContentPane();
			contenedor.setLayout(null);
			
			circulo = new JButton();
			circulo.setText("Círculo");
			circulo.setBounds(10, 50, 100, 23);
			circulo.addActionListener(this);
			
			cuadrado = new JButton();
			cuadrado.setText("Cuadrado");
			cuadrado.setBounds(150, 50, 100, 23);
			cuadrado.addActionListener(this);
			
			rectangulo = new JButton();
			rectangulo.setText("Rectángulo");
			rectangulo.setBounds(290, 50, 100, 23); 
			rectangulo.addActionListener(this);
			
			triangulorectangulo = new JButton();
			triangulorectangulo.setText("Triángulo Rectángulo");
			triangulorectangulo.setBounds(420, 50, 156, 23); 
			triangulorectangulo.addActionListener(this);
			
			contenedor.add(circulo);
			contenedor.add(cuadrado);
			contenedor.add(rectangulo);
			contenedor.add(triangulorectangulo);
		}
		
	public void actionPerformed(ActionEvent evento) {
			if (evento.getSource() == circulo) {
				VentanaCirculo circulo = new VentanaCirculo();
				circulo.setVisible(true);
			}
			if (evento.getSource() == cuadrado) {
				VentanaCuadrado cuadrado = new VentanaCuadrado();
				cuadrado.setVisible(true);
				}
			if (evento.getSource() == rectangulo) {
				VentanaRectangulo rectangulo = new VentanaRectangulo();
				rectangulo.setVisible(true);
				}
			if (evento.getSource() == triangulorectangulo) {
				VentanaTrianguloRectangulo triangulorectangulo = new VentanaTrianguloRectangulo();
				triangulorectangulo.setVisible(true);
				}
		}
}
