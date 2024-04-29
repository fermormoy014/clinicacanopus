package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.EventQueue;
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
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Principal_cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_cliente frame = new Principal_cliente();
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
	public Principal_cliente() {
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
		
		//VER INFORMACION DE LAS MASCOTAS
		
		JButton btnNewButton = new JButton("Mis mascotas");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conect.conectar();
					
					 String sentencia= "SELECT idPaciente, Nombre, Fecha_Nacimiento, Especie, Raza, Peso, Vacuna_rabia, Cliente_idCliente, Usuario_Paciente FROM Paciente  WHERE Usuario_Paciente = '"+Clinica.guardarUsuario+"'";
					
					ResultSet resultado = conect.ejecutarSelect(sentencia);
					
					while(resultado.next()) {
						try {
						String fecha=resultado.getString("Fecha_Nacimiento");
						String formatoSQL = "EEE MMM dd HH:mm:ss zzz yyyy";
						String formatoJava="dd/MM/yyyy";
						
						SimpleDateFormat formato1 = new SimpleDateFormat(formatoSQL, Locale.ENGLISH);
						SimpleDateFormat formato2 = new SimpleDateFormat(formatoJava);
						
						
							java.util.Date fecha1 = formato1.parse(fecha);
							String fechaformateada = formato2.format(fecha1);
							
							Mascotas.nuevaFechaAnimal=fechaformateada;
							Mascotas.nuevaraza=resultado.getString("Raza");
							Mascotas.nuevoEspecie=resultado.getString("Especie");
							Mascotas.nuevoidentificador=resultado.getString("idPaciente");
							Mascotas.nuevoPeso=resultado.getString("Peso");
							Mascotas.nuevoVacuna=resultado.getString("Vacuna_rabia");
							Mascotas.nuevoNombreMascota=resultado.getString("Nombre");
						
						}
						catch(Exception a){
							
						}
						
						
						
						
					}
					
					
					
					
				
				Datos a;
				Mascotas vMascotas = new Mascotas();
				vMascotas.setVisible(true);
				
				
				
				
				
				
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				finally {
					
				}
				
				
			}
		});
		btnNewButton.setBounds(21, 103, 122, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Datos personales");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
					
					
						try {
							
							
							conect.conectar();
							
							 String sentencia= "SELECT idCliente, Nombre, Apellidos, Fecha_Nacimiento, Email, Telefono, Seguro, NombreUsuario, Contrasena FROM Cliente  WHERE NombreUsuario = '"+Clinica.guardarUsuario+"'";
							
							ResultSet resultado = conect.ejecutarSelect(sentencia);
							
							while(resultado.next()) {
								String fecha=resultado.getString("Fecha_Nacimiento");
								String formatoSQL = "EEE MMM dd HH:mm:ss zzz yyyy";
								String formatoJava="dd/MM/yyyy";
								
								SimpleDateFormat formato1 = new SimpleDateFormat(formatoSQL, Locale.ENGLISH);
								SimpleDateFormat formato2 = new SimpleDateFormat(formatoJava);
								
								
									java.util.Date fecha1 = formato1.parse(fecha);
									String fechaformateada = formato2.format(fecha1);
									
								Datos.nuevaFecha=fechaformateada;
								Datos.nuevotelef=resultado.getString("Telefono");
							Datos.nuevoDNI=resultado.getString("idCliente");
								Datos.nuevoEmail=resultado.getString("Email");
								Datos.nuevonombre=resultado.getString("NombreUsuario");
								Datos.nuevoNombre=resultado.getString("Nombre");
								Datos.nuevoSeguro=resultado.getString("Seguro");
								Datos.nuevoApellidos=resultado.getString("Apellidos");
								
								
								
								
								
								
							}
							
							
							
							
						
						Datos a = new Datos();
						
						
						
						
						a.setVisible(true);
						
						}
						catch (Exception e3) {
							e3.printStackTrace();
						}
						
					
						
					 
					
					
					

				
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1.setBounds(286, 103, 122, 39);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Coger cita");
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Citas vCitas = new Citas();
				vCitas.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(153, 103, 122, 39);
		contentPane.add(btnNewButton_2);
		
		JTextPane txtpnRecomendacinSemanalTu = new JTextPane();
		txtpnRecomendacinSemanalTu.setForeground(SystemColor.windowBorder);
		txtpnRecomendacinSemanalTu.setBackground(SystemColor.info);
		txtpnRecomendacinSemanalTu.setFont(new Font("SansSerif", Font.BOLD, 13));
		txtpnRecomendacinSemanalTu.setText("Recomendación semanal: tu mascota debe estar protegida contra el mosquito ");
		txtpnRecomendacinSemanalTu.setBounds(77, 180, 272, 42);
		contentPane.add(txtpnRecomendacinSemanalTu);
		
		
		
		
		
		
		
	}
}
