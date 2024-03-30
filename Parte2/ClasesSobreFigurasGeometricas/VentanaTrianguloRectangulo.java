package ClasesSobreFigurasGeometricas;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaTrianguloRectangulo extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private JLabel base, altura, area, perimetro, hipotenusa, tipotriangulo;
	private JTextField campo_base, campo_altura;
	private JButton calcular;
	
	public VentanaTrianguloRectangulo() {
		inicio();
		setTitle("Triángulo Rectángulo");
		setSize(400,400); 
		setLocationRelativeTo(null);
		setResizable(false); 
	}
	
	private void inicio() {
		contenedor = getContentPane(); 
		contenedor.setLayout(null);
		
		base = new JLabel();
		base.setText("Base(cms): ");
		base.setBounds(20, 20, 135, 23);
		campo_base = new JTextField();
		campo_base.setBounds(120, 20, 135, 23);
		
		altura = new JLabel();
		altura.setText("Altura(cms): ");
		altura.setBounds(20, 50, 135, 23);
		campo_altura = new JTextField();
		campo_altura.setBounds(120, 50, 135, 23);
		
		area = new JLabel();
		area.setText("Área (cm2): ");
		area.setBounds(20, 140, 200, 23);
		
		perimetro = new JLabel();
		perimetro.setText("Perímetro (cm): ");
		perimetro.setBounds(20, 160, 200, 23);
		
		hipotenusa = new JLabel();
		hipotenusa.setText("Hipotenusa (cm): ");
		hipotenusa.setBounds(20, 180, 200, 23);
		
		tipotriangulo = new JLabel();
		tipotriangulo.setText("Tipo de triángulo: ");
		tipotriangulo.setBounds(20, 200, 400, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(120, 110, 135, 23);
		calcular.addActionListener(this);
		
		contenedor.add(base);
		contenedor.add(altura);
		contenedor.add(campo_base);
		contenedor.add(campo_altura);
		contenedor.add(area);
		contenedor.add(perimetro);
		contenedor.add(hipotenusa);
		contenedor.add(tipotriangulo);
		contenedor.add(calcular);
	}
	
	public void actionPerformed(ActionEvent event) {
		triangulorectangulo TrianguloRectangulo;
		boolean error = false;
		double a = 0;
		double p = 0;
		double h = 0;
		String tt = "";
		
		try {
			TrianguloRectangulo = new triangulorectangulo(Integer.parseInt(campo_base.getText()), Integer.parseInt(campo_altura.getText()));
			a = TrianguloRectangulo.calcularArea();
			p = TrianguloRectangulo.calcularPerimetro();
			h = TrianguloRectangulo.calcularHipotenusa();
			tt = TrianguloRectangulo.determinarTipoTriangulo();
			area.setText("Área (cm2): " + a);
			perimetro.setText("Perímetro (cm): " + p);
			hipotenusa.setText("Hipotenusa (cm): " + h);
			tipotriangulo.setText("Tipo de triángulo: " + tt);

		} catch (Exception e) {
			error = true; 
		} finally {
			if (error) { 
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de número", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
}