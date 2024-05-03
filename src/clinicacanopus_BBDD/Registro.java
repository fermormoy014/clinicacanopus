package clinicacanopus_BBDD;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.toedter.calendar.JDateChooser;
import javax.swing.JCheckBox;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usuario_texto;
	private JTextField nombre_texto;
	private JTextField apellidos_texto;
	private JTextField dni_texto;
	private JTextField telefono_texto;
	private JTextField email_texto;
	private JTextField identificador_texto;
	private JTextField especie_texto;
	private JTextField raza_texto;
	private JTextField nombremascota__texto;
	private JTextField peso_texto;
	private JTextField contrasena_texto;
	private JTextField textField;
	static String fechaformateada;
	private JTextField textField_1;
	private Panel panelito;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Registro.class.getResource("/clinicacanopus_BBDD/icono3.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registro.class.getResource("/clinicacanopus_BBDD/Logo_clinica.png")));
		lblNewLabel.setBounds(23, 11, 172, 80);		
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(23, 152, 289, 243);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(25, 10, 46, 14);
		panel.add(lblNewLabel_1);
		
		usuario_texto = new JTextField();
		
		usuario_texto.setBounds(117, 8, 115, 20);
		panel.add(usuario_texto);
		usuario_texto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(25, 35, 46, 14);
		panel.add(lblNewLabel_2);
		
		nombre_texto = new JTextField();
		
		//ESCRITURA SOLO TEXTO
		nombre_texto.addKeyListener(new KeyAdapter() {
			
		});
		nombre_texto.setBounds(117, 33, 115, 20);
		panel.add(nombre_texto);
		nombre_texto.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(25, 60, 61, 14);
		panel.add(lblNewLabel_3);
		
		apellidos_texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				apellidos_texto.addKeyListener(new KeyAdapter() {
					
				});
		apellidos_texto.setBounds(117, 58, 115, 20);
		panel.add(apellidos_texto);
		apellidos_texto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DNI");
		lblNewLabel_4.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(25, 85, 46, 14);
		panel.add(lblNewLabel_4);
		
		dni_texto = new JTextField();
		
		dni_texto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				dni_texto.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						int c =e.getKeyChar();
						
						
						
						if ((c<'0' || c>'9')) e.consume();
						
					}
				});
		
				if(dni_texto.getText().length()>=9) {
					e.consume();
				}
				
			}
		});
		dni_texto.setBounds(117, 83, 115, 20);
		panel.add(dni_texto);
		dni_texto.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("T. Contacto");
		lblNewLabel_5.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(25, 110, 99, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(25, 135, 46, 14);
		panel.add(lblNewLabel_6);
		
		telefono_texto = new JTextField();
		//ESCRITURA SOLO NUMERO
				telefono_texto.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						int c =e.getKeyChar();
						
						
						
						if ((c<'0' || c>'9')) e.consume();
						
						if(telefono_texto.getText().length()>=9) {
							e.consume();
						}
						
					}
				});
				
		telefono_texto.setBounds(117, 108, 115, 20);
		panel.add(telefono_texto);
		telefono_texto.setColumns(10);
		
		email_texto = new JTextField();
		email_texto.setBounds(117, 135, 115, 20);
		panel.add(email_texto);
		email_texto.setColumns(10);
		
		JLabel lblNewLabel_6_3 = new JLabel("Contraseña");
		lblNewLabel_6_3.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_3.setBounds(25, 160, 71, 19);
		panel.add(lblNewLabel_6_3);
		
		contrasena_texto = new JTextField();
		contrasena_texto.setBounds(117, 160, 115, 19);
		panel.add(contrasena_texto);
		contrasena_texto.setColumns(10);
		
		JCheckBox Seguro_box = new JCheckBox("Seguro Médico");
		Seguro_box.setForeground(new Color(255, 128, 64));
		Seguro_box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Seguro_box.isSelected()) {
					
					
					textField.setText("1");
					
					
				}
				
				else {
					textField.setText("0");
				}
			}
		});
		Seguro_box.setBounds(22, 213, 99, 23);
		panel.add(Seguro_box);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Nacimiento");
		lblNewLabel_5_1_1.setFont(new Font("Dialog", Font.PLAIN, 13));
		lblNewLabel_5_1_1.setBounds(25, 190, 71, 14);
		panel.add(lblNewLabel_5_1_1);
		
		JDateChooser Fecha_nacimiento = new JDateChooser();
		Fecha_nacimiento.setBounds(117, 186, 115, 20);
		panel.add(Fecha_nacimiento);
		Fecha_nacimiento.setDateFormatString("yyyy-MM-dd");
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(364, 154, 266, 198);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificador");
		lblNewLabel_1_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(27, 13, 131, 14);
		panel_1.add(lblNewLabel_1_1);
		
		identificador_texto = new JTextField();
		identificador_texto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				int c =e.getKeyChar();
				
				
				
				if ((c<'0' || c>'9')) e.consume();
				
			}
		});
		
		identificador_texto.setColumns(10);
		identificador_texto.setBounds(127, 11, 99, 20);
		panel_1.add(identificador_texto);
		
		JLabel lblNewLabel_2_1 = new JLabel("Especie");
		lblNewLabel_2_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(27, 38, 80, 14);
		panel_1.add(lblNewLabel_2_1);
		
		especie_texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				especie_texto.addKeyListener(new KeyAdapter() {
					
				});
		especie_texto.setColumns(10);
		especie_texto.setBounds(127, 38, 99, 20);
		panel_1.add(especie_texto);
		
		JLabel lblNewLabel_3_1 = new JLabel("Raza");
		lblNewLabel_3_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(27, 63, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		raza_texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				raza_texto.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						char c =e.getKeyChar();
						
						if ((c<'a' || c>'z')) e.consume();
						
					}
				});
		raza_texto.setColumns(10);
		raza_texto.setBounds(127, 61, 99, 20);
		panel_1.add(raza_texto);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nombre");
		lblNewLabel_4_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(27, 88, 46, 14);
		panel_1.add(lblNewLabel_4_1);
		
		nombremascota__texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				nombremascota__texto.addKeyListener(new KeyAdapter() {
					
					
				});
		nombremascota__texto.setColumns(10);
		nombremascota__texto.setBounds(127, 86, 99, 20);
		panel_1.add(nombremascota__texto);
		
		JLabel lblNewLabel_5_1 = new JLabel("F. Nacimiento");
		lblNewLabel_5_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(27, 115, 99, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Peso");
		lblNewLabel_6_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_1.setBounds(27, 140, 46, 14);
		panel_1.add(lblNewLabel_6_1);
		
		peso_texto = new JTextField();
		//ESCRITURA SOLO NUMERO
		peso_texto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				int c =e.getKeyChar();
				
				
				
				if ((c<'0' || c>'9')) e.consume();
				
			}
		});
		peso_texto.setColumns(10);
		peso_texto.setBounds(127, 138, 46, 20);
		panel_1.add(peso_texto);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Vacuna Rabia");
		chckbxNewCheckBox_1.setForeground(new Color(255, 128, 64));
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_1.isSelected()) {
					
					
					textField_1.setText("1");
					
					
				}
				
				else {
					textField_1.setText("0");
				}
			}
		});
		chckbxNewCheckBox_1.setBounds(27, 168, 99, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JDateChooser fecha_nacimiento_A = new JDateChooser();
		fecha_nacimiento_A.setDateFormatString("yyyy-MM-dd");
		fecha_nacimiento_A.setBounds(127, 113, 99, 20);
		panel_1.add(fecha_nacimiento_A);
		
		JLabel lblNewLabel_7 = new JLabel("Datos cliente");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(23, 128, 125, 18);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Datos mascota");
		lblNewLabel_7_1.setText("Datos paciente");
		lblNewLabel_7_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_7_1.setBounds(416, 130, 106, 18);
		contentPane.add(lblNewLabel_7_1);
		
		JButton btnGuardar = new JButton("Guardar datos");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(usuario_texto  != null && apellidos_texto != null && nombre_texto !=null && contrasena_texto !=null && 
						dni_texto !=null && telefono_texto != null && email_texto !=null && contrasena_texto != null && identificador_texto !=null && 
						especie_texto!=null &&  raza_texto!= null && nombremascota__texto!=null && peso_texto!=null) {
					
					
					
					ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");
					
					try {
						
						
						conect.conectar();
						
						String sentencia1= "SELECT NombreUsuario, idCliente FROM Cliente WHERE idCliente= '"+dni_texto.getText()+"' OR '"+usuario_texto.getText()+"'";
						ResultSet resultado=conect.ejecutarSelect(sentencia1);
						
						if(resultado.next()) {
							
							
							
							
								JOptionPane.showMessageDialog(null, "error, usuario ya existente, vuelva a intentarlo");
						}
							else {
								String sentencia="INSERT INTO Cliente(idCliente, Nombre, Apellidos, Fecha_Nacimiento, Email, Telefono, Seguro, NombreUsuario, Contrasena)  VALUES ('"+dni_texto.getText()+"','"+nombre_texto.getText()+"','"+apellidos_texto.getText()+"','"
										+Fecha_nacimiento.getDate()+"','"+email_texto.getText()+"','"+telefono_texto.getText()+"','"+textField.getText()+"', '"+usuario_texto.getText()+"', '"+contrasena_texto.getText()+"')";
								
								String sentencia2="INSERT INTO Paciente (idPaciente, Nombre, Fecha_Nacimiento, Especie, Raza, Peso, Vacuna_rabia, Cliente_idCliente, Usuario_Paciente) VALUES ('"+identificador_texto.getText()+"', '"+nombremascota__texto.getText()+"', '"+fecha_nacimiento_A.getDate()+"', '"+especie_texto.getText()+"', '"+raza_texto.getText()+"', '"+peso_texto.getText()+"', '"
										+textField_1.getText()+"','"+dni_texto.getText()+"','"+usuario_texto.getText()+"')";
										
										
										conect.ejecutarInsertDeleteUpdate(sentencia);
										conect.ejecutarInsertDeleteUpdate(sentencia2);
										JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
							}
							
							
						}
						
						
						
						
						
						
						
						
						
						
					 catch (SQLException a) {
						// TODO Auto-generated catch block
						a.printStackTrace();
					}
					finally {
						try {
							conect.desconectar();
						} catch (SQLException a) {
							// TODO Auto-generated catch block
							a.printStackTrace();
						}
					} 
					
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Algún campo está vacio, inténtelo de nuevo");
				}
				
				
			}
				
					
					
				
				
			
		})
		;


		btnGuardar.setBounds(513, 372, 117, 23);
		contentPane.add(btnGuardar);
		
		textField = new JTextField();
		textField.addComponentListener(new ComponentAdapter() {
			
		});
	
		textField.setBounds(421, 43, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setVisible(false);

		
		textField_1 = new JTextField();
		textField_1.addComponentListener(new ComponentAdapter() {
			@Override
			public void componentHidden(ComponentEvent e) {
			}
		});
		
		textField_1.setVisible(false);
		textField_1.setBounds(522, 43, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		panelito = new Panel();
		panelito.setForeground(new Color(255, 128, 64));
		panelito.setBackground(SystemColor.inactiveCaptionBorder);
		panelito.setBounds(10, 97, 633, 25);
		contentPane.add(panelito);
		panelito.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Nuevo registro");
		lblNewLabel_8.setForeground(new Color(255, 128, 64));
		lblNewLabel_8.setBounds(30, 0, 141, 25);
		panelito.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		JButton atras = new JButton("Volver");
		atras.setForeground(new Color(255, 128, 64));
		atras.setBounds(534, 3, 89, 23);
		panelito.add(atras);
		
	
		atras.setName("volver");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				Principal_administrador a = new Principal_administrador();
				a.setVisible(true);
				dispose();
				
				}
				catch (Exception e3) {
					e3.printStackTrace();
	
			}
			}
		});
		atras.setBounds(556, 0, 77, 25);
		
		
		
		
		
		
		
	}
}

