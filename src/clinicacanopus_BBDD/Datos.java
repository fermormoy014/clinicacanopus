package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Datos extends JFrame  {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	JTextField recibe;
	
	static String nuevonombre;
	 
	static String nuevoDNI;
	static String nuevaFecha;
	static String nuevoEmail;
	static String nuevotelef;
	static String nuevoSeguro;
	static String nuevoNombre;
	static String nuevoApellidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Datos frame = new Datos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Datos() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 597, 421);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\Logo_clinica.png"));
		lblNewLabel.setBounds(34, 25, 142, 53);
	
		contentPane.add(lblNewLabel);
	
		Panel panel = new Panel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(21, 115, 322, 234);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre y apellido");
		
		lblNewLabel_1.setText(nuevoNombre);
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(21, 89, 142, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		
		JLabel lblNewLabel_2 = new JLabel("Usuario:");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 6, 68, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono contacto:");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_6.setBounds(10, 141, 113, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Seguro:");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 11));
		lblNewLabel_7.setBounds(10, 192, 68, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(10, 102, 46, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 11));
		
		JLabel lblNewLabel_4 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_4.setBounds(10, 67, 140, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Carlito", Font.BOLD, 12));
		
		JLabel lblNewLabel_3 = new JLabel("DNI:");
		lblNewLabel_3.setBounds(10, 32, 46, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 11));
		
		JLabel Usuario_nombre = new JLabel("New label");
		Usuario_nombre.setText(nuevonombre);
		Usuario_nombre.setBounds(60, 7, 160, 14);
		panel.add(Usuario_nombre);
		
		JLabel Dni_text = new JLabel("New label");
		Dni_text.setText(nuevoDNI);
		Dni_text.setBounds(32, 32, 118, 14);
		panel.add(Dni_text);
		
		
		
		
		JLabel Fechanacimiento = new JLabel("New label");
		Fechanacimiento.setText(nuevaFecha);
		Fechanacimiento.setBounds(118, 68, 160, 14);
		panel.add(Fechanacimiento);
		
		JLabel Email = new JLabel("New label");
		Email.setText(nuevoEmail);
		Email.setBounds(60, 103, 160, 14);
		panel.add(Email);
		
		JLabel Telefono = new JLabel("New label");
		Telefono.setText(nuevotelef);
		Telefono.setBounds(118, 142, 160, 14);
		panel.add(Telefono);
		
		JLabel Seguro = new JLabel("New label");
		
		
		
		
		
		if(nuevoSeguro.equals("0")) {
			Seguro.setText("No tiene seguro");
		}
		
		else if (nuevoSeguro.equals("1")){
			Seguro.setText("tiene seguro");
		}
		else {
			Seguro.setText("coña");
		}
		
		
		
		/*while(nuevoSeguro == "0") {
			Seguro.setText("No tiene seguro");
			
			
			if(nuevoSeguro == "1") {
				Seguro.setText("tiene seguro");
				
				
			}
			else {
				break;
			}
		}*/
		
		
		
	
		
		
		Seguro.setBounds(60, 192, 160, 14);
		panel.add(Seguro);
		
		
		
		
		
		
		
		
		
			
			
			
				
				
					 

			
			JLabel lblNewLabel_8 = new JLabel("¿Desea modificar la contraseña?");
			lblNewLabel_8.setForeground(new Color(95, 158, 160));
			lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 10));
			lblNewLabel_8.setBounds(381, 292, 167, 14);
			contentPane.add(lblNewLabel_8);
			
			JLabel lblNewLabel_9 = new JLabel("New label");
			lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\huella (1).png"));
			lblNewLabel_9.setBounds(272, 89, 109, 106);
			contentPane.add(lblNewLabel_9);
			
			JLabel lblNewLabel_1_1 = new JLabel((String) null);
			lblNewLabel_1_1.setText(nuevoApellidos);
			lblNewLabel_1_1.setForeground(new Color(255, 160, 122));
			lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(173, 89, 142, 20);
			contentPane.add(lblNewLabel_1_1);






		
	
	}
}
