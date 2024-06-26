package clinicacanopus_BBDD;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Principal_cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	//CONEXIÓN A LA BASE DE DATOS
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal_cliente.class.getResource("/clinicacanopus_BBDD/icono3.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CONTENIDO DEL FRAME
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal_cliente.class.getResource("/clinicacanopus_BBDD/Logo_clinica.png")));
		lblNewLabel.setBounds(21, 11, 170, 81);
		contentPane.add(lblNewLabel);
		
		//VER INFORMACION DE LAS MASCOTAS
		
		JButton btnNewButton = new JButton("Mis mascotas");
		btnNewButton.setIcon(new ImageIcon(Principal_cliente.class.getResource("/clinicacanopus_BBDD/images.png")));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					
					conect.conectar();
					//BUSQUEDA DE LOS DATOS DE LA MASCOTA
					 String sentencia= "SELECT idPaciente, Nombre, Fecha_Nacimiento, Especie, Raza, Peso, Vacuna_rabia, Cliente_idCliente, Usuario_Paciente FROM Paciente  WHERE Usuario_Paciente = '"+Clinica.guardarUsuario+"'";
					
					ResultSet resultado = conect.ejecutarSelect(sentencia);
					
					while(resultado.next()) {
						try {
							//CAMBIO DE FORMATO DE LA FECHA A UN FORMATO MÁS COMÚN (DD/MM/YYYY)
						String fecha=resultado.getString("Fecha_Nacimiento");
						String formatoSQL = "EEE MMM dd HH:mm:ss zzz yyyy";
						String formatoJava="dd/MM/yyyy";
						
						SimpleDateFormat formato1 = new SimpleDateFormat(formatoSQL, Locale.ENGLISH);
						SimpleDateFormat formato2 = new SimpleDateFormat(formatoJava);
						
						
							java.util.Date fecha1 = formato1.parse(fecha);
							String fechaformateada = formato2.format(fecha1);
							
							//AÑADIMOS LOS DATOS DE LA MASCOTA A LOS ESTÁTICOS
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
					
					
					
					
				
				//ABRIR VENTANA MASCOTAS
				Mascotas vMascotas = new Mascotas();
				vMascotas.setVisible(true);
				dispose();
				
				
				
				
				
				
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				finally {
					
				}
				
				
			}
		});
		btnNewButton.setBounds(251, 196, 132, 118);
		contentPane.add(btnNewButton);
		
		//BOTÓN PARA ABRIR LA VENTANA DE LOS DATOS
		JButton btnNewButton_1 = new JButton("Datos personales");
		btnNewButton_1.setIcon(new ImageIcon(Principal_cliente.class.getResource("/clinicacanopus_BBDD/images.jpg")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
					
					
						try {
							
							
							conect.conectar();
							
							//BÚSQUEDA DE LOS DATOS EN LA TABLA DE CLIENTE
							 String sentencia= "SELECT idCliente, Nombre, Apellidos, Fecha_Nacimiento, Email, Telefono, Seguro, NombreUsuario, Contrasena FROM Cliente  WHERE NombreUsuario = '"+Clinica.guardarUsuario+"'";
							
							ResultSet resultado = conect.ejecutarSelect(sentencia);
							
							while(resultado.next()) {
								//CAMBIO DE FORMATO DE LA FECHA A UN FORMATO MÁS COMÚN (DD/MM/YYYY)
								String fecha=resultado.getString("Fecha_Nacimiento");
								String formatoSQL = "EEE MMM dd HH:mm:ss zzz yyyy";
								String formatoJava="dd/MM/yyyy";
								
								SimpleDateFormat formato1 = new SimpleDateFormat(formatoSQL, Locale.ENGLISH);
								SimpleDateFormat formato2 = new SimpleDateFormat(formatoJava);
								
								
									java.util.Date fecha1 = formato1.parse(fecha);
									String fechaformateada = formato2.format(fecha1);
									
									
									//AÑADIMOS LOS DATOS DEL CLIENTE A LOS ESTÁTICOS
									
								Datos.nuevaFecha=fechaformateada;
								Datos.nuevotelef=resultado.getString("Telefono");
							Datos.nuevoDNI=resultado.getString("idCliente");
								Datos.nuevoEmail=resultado.getString("Email");
								Datos.nuevonombre=resultado.getString("NombreUsuario");
								Datos.nuevoNombre=resultado.getString("Nombre");
								Datos.nuevoSeguro=resultado.getString("Seguro");
								Datos.nuevoApellidos=resultado.getString("Apellidos");
								
				
							}
				
						//ABRIR LA VENTANA DE DATOS
						Datos a = new Datos();
						a.setVisible(true);
						dispose();
						
						}
						catch (Exception e3) {
							e3.printStackTrace();
						}
		
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.PLAIN, 11));
		btnNewButton_1.setBackground(SystemColor.inactiveCaption);
		btnNewButton_1.setBounds(457, 196, 131, 118);
		contentPane.add(btnNewButton_1);
		
		//BOTON PARA COGER CITAS
		
		JButton btnNewButton_2 = new JButton("Coger cita");
		btnNewButton_2.setIcon(new ImageIcon(Principal_cliente.class.getResource("/clinicacanopus_BBDD/radiologia.jpg")));
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Citas vCitas;
				try {
					//ABRIR LA VENTANA DE CITAS
					vCitas = new Citas();
					vCitas.setVisible(true);
					dispose();
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setBounds(57, 193, 132, 124);
		contentPane.add(btnNewButton_2);
		
		Panel panelito = new Panel();
		
		panelito.setForeground(new Color(255, 128, 64));
		contentPane.add(panelito);
		panelito.setBackground(SystemColor.inactiveCaptionBorder);
		panelito.setBounds(0, 97, 656, 25);
		contentPane.add(panelito);
		panelito.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Bienvenid@");
		lblNewLabel_8.setForeground(new Color(255, 128, 64));
		lblNewLabel_8.setBounds(30, 0, 217, 25);
		panelito.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		JButton atras = new JButton("Cerrar");
		atras.setForeground(new Color(255, 128, 64));
		atras.setBounds(518, 0, 115, 25);
		panelito.add(atras);
		
		atras.setName("volver");
		//BOTÓN PARA VOLVER HACIA ATRÁS
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					//ABRIR LA VENTANA ANTERIOR
					Clinica a = new Clinica();
					a.setVisible(true);
					dispose();
					
					}
					catch (Exception e3) {
						e3.printStackTrace();
		
				}
			}
		});
		atras.setBounds(556, 0, 77, 25);
		panelito.add(atras);
		
		JLabel lblNewLabel_1 = new JLabel("Coger cita");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(95, 158, 160));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(45, 160, 153, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Datos personales");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_2.setBounds(457, 160, 141, 22);
		contentPane.add(lblNewLabel_2);
		
		
		
		JLabel lblNewLabel_3 = new JLabel("Mis mascotas");
		lblNewLabel_3.setForeground(new Color(0, 128, 128));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBackground(new Color(95, 158, 160));
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_3.setBounds(251, 160, 132, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel();
		try {
			//SELECCIONAR LA RECOMENDACIÓN 
			conect.conectar();
			String Sentencia = "SELECT Recomendacion FROM Recomendaciones";
			
			ResultSet resultado = conect.ejecutarSelect(Sentencia);
			
			while(resultado.next()) {
				String recomendacion = resultado.getString("Recomendacion");
				
				//MOSTRAR LA ULTIMA RECOMENDACIÓN ESCRITA POR EL ADMINISTRADOR
				lblNewLabel_4.setText(recomendacion);
				
			}
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
		lblNewLabel_4.setForeground(new Color(0, 128, 128));
		lblNewLabel_4.setBackground(new Color(211, 211, 211));
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 13));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(21, 362, 600, 33);
		contentPane.add(lblNewLabel_4);
		
		
		
		
		
		
	}
}
