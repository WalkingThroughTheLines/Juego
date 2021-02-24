package juegoPruebas;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {


	public Ventana(){
		setSize(500,500);
		setTitle("Walking Through The Lines");
		setLocationRelativeTo(null);
		setMinimumSize(new Dimension(200,200));
		iniciarPaneles();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void iniciarPaneles() {
		JPanel panel1= new JPanel();
		this.getContentPane().add(panel1);
		JLabel etiqueta1 = new JLabel("Bienvenidos al juegardo ");
		JLabel etiqueta2 = new JLabel("Walking Through The Lines");
		etiqueta2.setForeground(Color.darkGray);
		
		panel1.add(etiqueta1);
		panel1.add(etiqueta2);
	}
	
	
}
