package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mascotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	static String nuevoidentificador;
	 
	static String nuevaraza;
	static String nuevaFechaAnimal;
	static String nuevoPeso;
	static String nuevoEspecie;
	static String nuevoVacuna;
	static String nuevoNombreMascota;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mascotas frame = new Mascotas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Mascotas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\Logo_clinica.png"));
		lblNewLabel.setBounds(21, 11, 142, 53);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(21, 115, 220, 124);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Identificador:");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 11, 96, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Especie:");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 31, 79, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raza:");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 49, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso:");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_5.setBounds(10, 67, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 83, 114, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Vacuna rabia:");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 101, 96, 14);
		panel.add(lblNewLabel_7);
		
		JLabel Identificador_lbl = new JLabel("New label");
		Identificador_lbl.setText(nuevoidentificador);
		Identificador_lbl.setBounds(93, 12, 46, 14);
		panel.add(Identificador_lbl);
		
		JLabel Especie_lbl = new JLabel("New label");
		Especie_lbl.setText(nuevoEspecie);
		Especie_lbl.setBounds(64, 32, 46, 14);
		panel.add(Especie_lbl);
		
		JLabel Raza_lbl = new JLabel("New label");
		Raza_lbl.setText(nuevaraza);
		Raza_lbl.setBounds(46, 50, 46, 14);
		panel.add(Raza_lbl);
		
		JLabel Peso_lbl = new JLabel("New label");
		Peso_lbl.setText(nuevoPeso);
		Peso_lbl.setBounds(43, 68, 46, 14);
		panel.add(Peso_lbl);
		
		JLabel Fecha_lbl = new JLabel("New label");
		Fecha_lbl.setText(nuevaFechaAnimal);
		Fecha_lbl.setBounds(116, 84, 46, 14);
		panel.add(Fecha_lbl);
		
		JLabel Vacuna_lbl = new JLabel("New label");
		if(nuevoVacuna.equals("0")) {
			Vacuna_lbl.setText("esta vacunado");
		}
		else if (nuevoVacuna.equals("1")){
			Vacuna_lbl.setText("no esta vacunado");
		}
		else {
			Vacuna_lbl.setText("coña");
		}

		
		Vacuna_lbl.setBounds(93, 102, 46, 14);
		panel.add(Vacuna_lbl);
		
		JLabel lblNewLabel_1 = new JLabel("Perro 1");
		lblNewLabel_1.setText(nuevoNombreMascota);
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(21, 89, 68, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Carlito", Font.BOLD, 15));
	}
}
