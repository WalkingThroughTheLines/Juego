package juegoPruebas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame {
	public JPanel panel1;
	public JPanel panel2;

	public Ventana(){
		setSize(900,500);
		setTitle("Walking Through The Lines");
		setLocationRelativeTo(null);		
		setMinimumSize(new Dimension(900,500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		colocarPaneles();
		colocarEtiquetas();
		colocarBotones();
	}
	
	public void colocarPaneles() {
		panel1= new JPanel();
		panel1.setLayout(null);
		this.getContentPane().add(panel1);
		panel2= new JPanel();
		panel2.setLayout(null);
		this.getContentPane().add(panel2);
		this.getContentPane().remove(panel1);
	}
	private void colocarEtiquetas() {
		ImageIcon imagen1 = new ImageIcon("Logo.png");
		ImageIcon imagen2 = new ImageIcon("Combate.png");
		JLabel etiqueta1= new JLabel("El juegardo");
		JLabel etiqueta2= new JLabel();
		JLabel etiqueta3= new JLabel();
		
		etiqueta1.setBounds(320,10,100,50);
		etiqueta1.setBackground(Color.black);
		etiqueta2.setBounds(240, 50, 250, 120);
		etiqueta3.setBounds(240, 200, 450, 220);
		etiqueta2.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(250, 120, Image.SCALE_SMOOTH)));
		etiqueta3.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		panel1.add(etiqueta1);
		panel1.add(etiqueta2);
		panel1.add(etiqueta3);
	}
	
	private void colocarBotones() {
		JButton boton1= new JButton();
		boton1.setBounds(120, 200, 100, 40);
		panel1.add(boton1);
		
		JButton boton2= new JButton();
		boton2.setBounds(120, 250, 100, 40);
		panel1.add(boton2);
		
		JButton boton3= new JButton();
		boton3.setBounds(120, 300, 100, 40);
		panel1.add(boton3);
		
		JButton boton4= new JButton();
		boton4.setBounds(120, 350, 100, 40);
		panel1.add(boton4);
	}
	
	
}
