package juegoPruebas;

import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Ventana extends JFrame {
	private JPanel panel1, panel2, panel3;
	private JLabel etiqueta1, imaggen1, imaggen2, nombre;
	private JButton jugar, creditos, salida, ataque, defensa, cambiar, objetos;
	private ImageIcon imagen1, imagen2;

	public Ventana(){
		setSize(800,600);
		setTitle("Walking Through The Lines");
		setLocationRelativeTo(null);		
		setMinimumSize(new Dimension(700,500));
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		panelInicio();
	}

	
	private void panelInicio() {
		panel1 =new JPanel();
		panel1.setLayout(null);
		this.getContentPane().add(panel1);
		
		nombre = new JLabel ("El juegardo");
		nombre.setBounds(200,10,100,50);
		panel1.add(nombre);
		
		imagen1 = new ImageIcon("Logo.png");
		imaggen1= new JLabel();
		imaggen1.setBounds(110, 50, 250, 140);
		imaggen1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(250, 140, Image.SCALE_SMOOTH)));
		panel1.add(imaggen1);
		
		jugar=new JButton();
		jugar.setBounds(60, 220, 100, 40);
		jugar.setText("Jugar");
		
		panel1.add(jugar);
		
		creditos=new JButton();
		creditos.setBounds(180, 220, 100, 40);
		creditos.setText("Creditos");
		panel1.add(creditos);
		
		salida=new JButton();
		salida.setBounds(300, 220, 100, 40);
		salida.setText("Salir");
		panel1.add(salida);
	}
	
	private void panelCombate() {
		panel2 = new JPanel();
		panel2.setLayout(null);

		this.getContentPane().add(panel2);
		imagen1 = new ImageIcon("Logo.png");
		imagen2 = new ImageIcon("Combate.png");
		etiqueta1= new JLabel("El juegardo");
		imaggen1= new JLabel();
		imaggen2= new JLabel();
		
		etiqueta1.setBounds(420,10,100,50);
		imaggen1.setBounds(320, 50, 250, 140);
		imaggen2.setBounds(240, 200, 450, 220);
		imaggen1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(250, 140, Image.SCALE_SMOOTH)));
		imaggen2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(400, 300, Image.SCALE_SMOOTH)));
		panel2.add(etiqueta1);
		panel2.add(imaggen1);
		panel2.add(imaggen2);
		
		ataque= new JButton();
		ataque.setBounds(120, 200, 100, 40);
		ataque.setText("Atacar");
		
		panel2.add(ataque);
		
		defensa= new JButton();
		defensa.setBounds(120, 250, 100, 40);
		defensa.setText("Defenderse");
		panel2.add(defensa);
		
		cambiar= new JButton();
		cambiar.setBounds(120, 300, 100, 40);
		cambiar.setText("Cambiar personaje");
		panel2.add(cambiar);
		
		objetos= new JButton();
		objetos.setBounds(120, 350, 100, 40);
		objetos.setText("Utilizar objetos");
		panel2.add(objetos);
		
		salida=new JButton();
		salida.setBounds(120, 400, 100, 40);
		salida.setText("Huir");
		panel2.add(salida);
	}

	private void creditos() {
		panel3 = new JPanel();
		panel3.setLayout(null);
		this.getContentPane().add(panel3);
	}
	
}
