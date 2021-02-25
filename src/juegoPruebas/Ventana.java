package juegoPruebas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingConstants;


public class Ventana extends JFrame {
	public JPanel panel1;

	public Ventana(){
		setSize(500,500);
		setTitle("Walking Through The Lines");
		setLocationRelativeTo(null);		
		setMinimumSize(new Dimension(200,200));
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
		
	}
	private void colocarEtiquetas() {
		ImageIcon imagen = new ImageIcon("Logo.png");
		JLabel etiqueta2= new JLabel();
		JLabel etiqueta1= new JLabel("El juegardo");
		etiqueta1.setBounds(50,10,100,50);
		etiqueta1.setBackground(Color.black);
		etiqueta2.setBounds(50, 50, 250, 120);
		etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(250, 120, Image.SCALE_SMOOTH)));
		panel1.add(etiqueta1);
		panel1.add(etiqueta2);
	}
	
	private void colocarBotones() {
		JButton boton1= new JButton();
		boton1.setBounds(120, 200, 100, 40);
		panel1.add(boton1);
		
		JButton boton2= new JButton();
		boton2.setBounds(240, 200, 100, 40);
		panel1.add(boton2);
		
		JButton boton3= new JButton();
		boton3.setBounds(360, 200, 100, 40);
		panel1.add(boton3);
		
		JButton boton4= new JButton();
		boton4.setBounds(480, 200, 100, 40);
		panel1.add(boton4);
	}
	
	
}
