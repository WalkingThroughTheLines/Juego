package juegoPruebas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	private JPanel panel1, panel2, panel3;
	private JLabel etiqueta1, imaggen1, imaggen2, nombre, texto1, texto2, texto3, texto4;
	private JButton jugar, creditos, salida, ataque, defensa, cambiar, objetos, volver;
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
		ActionListener combate = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel1.setVisible(false);
				panel2.setVisible(true);
				panelCombate();
			}
		};
		
		ActionListener credito = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel1.setVisible(false);
				panel3.setVisible(true);
				panelCreditos();
			}
		};
		
		ActionListener salir = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(WIDTH);
			}
		};
		
		panel1 =new JPanel();
		panel1.setVisible(true);
		panel1.setLayout(null);
		panel1.setBackground(Color.gray);
		this.getContentPane().add(panel1);
		
		
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.gray);
		this.getContentPane().add(panel2);
		panel2.setVisible(false);
		
		panel3 = new JPanel();
		this.getContentPane().add(panel3);
		panel3.setLayout(null);
		panel3.setBackground(Color.gray);
		this.getContentPane().add(panel3);
		panel3.setVisible(false);
		
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
		jugar.addActionListener(combate);
		panel1.add(jugar);
		
		creditos = new JButton();
		creditos.setBounds(180, 220, 100, 40);
		creditos.setText("Creditos");
		creditos.addActionListener(credito);
		panel1.add(creditos);
		
		salida=new JButton();
		salida.setBounds(300, 220, 100, 40);
		salida.setText("Salir");
		salida.addActionListener(salir);
		panel1.add(salida);

	}
	
	private void panelCombate() {
		ActionListener atacar = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		
		ActionListener defenderse = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		
		ActionListener cambiarpj = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		
		ActionListener utilobj = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
			}
		};
		
		ActionListener huir = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel2.setVisible(false);
				panel1.setVisible(true);
				panelInicio();
			}
		};
	
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
		salida.addActionListener(atacar);
		panel2.add(ataque);
		
		defensa= new JButton();
		defensa.setBounds(120, 250, 100, 40);
		defensa.setText("Defenderse");
		salida.addActionListener(defenderse);
		panel2.add(defensa);
		
		cambiar= new JButton();
		cambiar.setBounds(120, 300, 100, 40);
		cambiar.setText("Cambiar personaje");
		cambiar.addActionListener(cambiarpj);
		panel2.add(cambiar);
		
		objetos= new JButton();
		objetos.setBounds(120, 350, 100, 40);
		objetos.setText("Utilizar objetos");
		objetos.addActionListener(utilobj);
		panel2.add(objetos);
		
		salida=new JButton();
		salida.setBounds(120, 400, 100, 40);
		salida.setText("Huir");
		salida.addActionListener(huir);
		panel2.add(salida);
	}

	private void panelCreditos() {
		ActionListener inicio = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel3.setVisible(false);
				panel1.setVisible(true);
				panelInicio();
			}
		};
		
		texto1 = new JLabel();
		texto1.setText("-> Juego hecho por:");
		texto1.setBounds(60, 30, 250, 100);
		panel3.add(texto1);
		
		texto2 = new JLabel();
		texto2.setText("- Antoñin as Antoñin");
		texto2.setBounds(60, 60, 200, 100);
		panel3.add(texto2);
		
		texto3 = new JLabel();
		texto3.setText("- Alex as Aguacate");
		texto3.setBounds(60, 90, 200, 100);
		panel3.add(texto3);
		
		texto4 = new JLabel();
		texto4.setText("- Jesús as El Admin");
		texto4.setBounds(60, 120, 200, 100);
		panel3.add(texto4);
		
		imagen1 = new ImageIcon("Logo.png");
		imaggen1= new JLabel();
		imaggen1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(250, 140, Image.SCALE_SMOOTH)));
		imaggen1.setBounds(200, 60, 250, 140);
		panel3.add(imaggen1);
		
		volver = new JButton();
		volver.setBounds(60, 200, 140, 40);
		volver.setText("Volver al Inicio");
		volver.addActionListener(inicio);
		panel3.add(volver);
	}

}
