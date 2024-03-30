package EjercicioPropuesto41;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Vector;

public class VentanaPrincipal extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private Container contenedor;
	private ListaNumeros lista;
	private JLabel numero, resultado;
	private JTextField campo_numero;
	private JButton calcular, limpiar, añadir, eliminar;
	private JList<Integer> ListaNumeros;
	private DefaultListModel<Integer> modelo;
	private JScrollPane scrollLista;
	
	public VentanaPrincipal() {
		lista = new ListaNumeros();
		inicio();
		setTitle("Calculadora");
		setSize(1000,1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		}
	
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		numero = new JLabel();
		numero.setText("Ingrese un número: ");
		numero.setBounds(20, 20, 135, 23);
		campo_numero = new JTextField();
		campo_numero.setBounds(140, 20, 135, 23);
		
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(20, 150, 80, 23);
		calcular.addActionListener(this);
		
		limpiar = new JButton();
		limpiar.setText("Limpiar");
		limpiar.setBounds(120, 150, 80, 23);
		limpiar.addActionListener(this);
		
		añadir = new JButton();
		añadir.setText("Añadir");
		añadir.setBounds(300, 20, 80, 23);
		añadir.addActionListener(this);
		
		eliminar = new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(220, 150, 80, 23);
		eliminar.addActionListener(this);
		
		resultado = new JLabel();
		resultado.setText("");
		resultado.setBounds(300, 200, 1000, 80);
		
		ListaNumeros = new JList<Integer>();
		ListaNumeros.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		modelo = new DefaultListModel<Integer>();
		scrollLista = new JScrollPane();
		scrollLista.setBounds(20, 190 ,220, 80);
		scrollLista.setViewportView(ListaNumeros);
	
		contenedor.add(numero);
		contenedor.add(campo_numero);
		contenedor.add(calcular);
		contenedor.add(limpiar);
		contenedor.add(añadir);
		contenedor.add(eliminar);
		contenedor.add(scrollLista);
		contenedor.add(resultado);
	}
	
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) { 
			calcularNumeros();
			}
		if (evento.getSource() == limpiar) { 
			limpiarNumeros();
			}
		if (evento.getSource() == añadir) { 
			añadirNumero();
			}
		if (evento.getSource() == eliminar) { 
			eliminarNumero(ListaNumeros.getSelectedIndex());
			}
	}
	
	
	private void calcularNumeros() {
		Vector<Integer> Numeros = new Vector<>();
		for (int i = 0; i < modelo.size(); i++) {
            Numeros.add(Integer.parseInt(modelo.getElementAt(i).toString()));
        }
		String resul = lista.calcularMayor(Numeros);
		resultado.setText(resul);
	}
	
	private void limpiarNumeros() {
		lista.borrarLista();
		modelo.clear();
		campo_numero.setText("");
	}
	
	private void añadirNumero() {
		 int num = Integer.parseInt(campo_numero.getText());
		 modelo.addElement(num);
		 ListaNumeros.setModel(modelo);
		 campo_numero.setText("");
	}
	
	private void eliminarNumero(int index) {
		if (index >= 0 && index < modelo.size() && modelo.size() > 0) {
			modelo.removeElementAt(index);
			lista.eliminarNumero(index);
		}else {
			JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}