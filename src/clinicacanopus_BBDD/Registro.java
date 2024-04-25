package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 391);
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
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(35, 99, 199, 218);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 13, 46, 14);
		panel.add(lblNewLabel_1);
		
		usuario_texto = new JTextField();
		
		usuario_texto.setBounds(78, 8, 115, 20);
		panel.add(usuario_texto);
		usuario_texto.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 38, 46, 14);
		panel.add(lblNewLabel_2);
		
		nombre_texto = new JTextField();
		
		//ESCRITURA SOLO TEXTO
		nombre_texto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				char c =e.getKeyChar();
				
				if ((c<'a' || c>'z')) e.consume();
				
			}
		});
		nombre_texto.setBounds(78, 33, 115, 20);
		panel.add(nombre_texto);
		nombre_texto.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 63, 61, 14);
		panel.add(lblNewLabel_3);
		
		apellidos_texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				apellidos_texto.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						char c =e.getKeyChar();
						
						if ((c<'a' || c>'z')) e.consume();
						
					}
				});
		apellidos_texto.setBounds(78, 58, 115, 20);
		panel.add(apellidos_texto);
		apellidos_texto.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DNI");
		lblNewLabel_4.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 88, 46, 14);
		panel.add(lblNewLabel_4);
		
		dni_texto = new JTextField();
		dni_texto.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				
				
		
				if(dni_texto.getText().length()>=9) {
					e.consume();
				}
				
			}
		});
		dni_texto.setBounds(78, 83, 115, 20);
		panel.add(dni_texto);
		dni_texto.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("T. Contacto");
		lblNewLabel_5.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 113, 99, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 138, 46, 14);
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
				
		telefono_texto.setBounds(78, 108, 115, 20);
		panel.add(telefono_texto);
		telefono_texto.setColumns(10);
		
		email_texto = new JTextField();
		email_texto.setBounds(78, 133, 115, 20);
		panel.add(email_texto);
		email_texto.setColumns(10);
		
		JLabel lblNewLabel_6_2 = new JLabel("Seguro médico");
		lblNewLabel_6_2.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_2.setBounds(10, 193, 99, 19);
		panel.add(lblNewLabel_6_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Sí");
		rdbtnNewRadioButton.setFont(new Font("Carlito", Font.PLAIN, 12));
		rdbtnNewRadioButton.setBackground(SystemColor.text);
		rdbtnNewRadioButton.setBounds(102, 191, 38, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		rdbtnNewRadioButton_1.setBackground(SystemColor.textHighlightText);
		rdbtnNewRadioButton_1.setBounds(142, 191, 44, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_6_3 = new JLabel("Contraseña");
		lblNewLabel_6_3.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_3.setBounds(10, 163, 130, 19);
		panel.add(lblNewLabel_6_3);
		
		contrasena_texto = new JTextField();
		contrasena_texto.setBounds(78, 160, 115, 19);
		panel.add(contrasena_texto);
		contrasena_texto.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(282, 99, 199, 198);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificador");
		lblNewLabel_1_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 13, 131, 14);
		panel_1.add(lblNewLabel_1_1);
		
		identificador_texto = new JTextField();
		identificador_texto.setColumns(10);
		identificador_texto.setBounds(90, 8, 99, 20);
		panel_1.add(identificador_texto);
		
		JLabel lblNewLabel_2_1 = new JLabel("Especie");
		lblNewLabel_2_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(10, 38, 46, 14);
		panel_1.add(lblNewLabel_2_1);
		
		especie_texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				especie_texto.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						char c =e.getKeyChar();
						
						if ((c<'a' || c>'z')) e.consume();
						
					}
				});
		especie_texto.setColumns(10);
		especie_texto.setBounds(90, 33, 99, 20);
		panel_1.add(especie_texto);
		
		JLabel lblNewLabel_3_1 = new JLabel("Raza");
		lblNewLabel_3_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(10, 63, 46, 14);
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
		raza_texto.setBounds(90, 58, 99, 20);
		panel_1.add(raza_texto);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nombre");
		lblNewLabel_4_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(10, 88, 46, 14);
		panel_1.add(lblNewLabel_4_1);
		
		nombremascota__texto = new JTextField();
		//ESCRITURA SOLO TEXTO
				nombremascota__texto.addKeyListener(new KeyAdapter() {
					@Override
					public void keyTyped(KeyEvent e) {
						
						
						char c =e.getKeyChar();
						
						if ((c<'a' || c>'z')) e.consume();
						
					}
				});
		nombremascota__texto.setColumns(10);
		nombremascota__texto.setBounds(90, 83, 99, 20);
		panel_1.add(nombremascota__texto);
		
		JLabel lblNewLabel_5_1 = new JLabel("F. Nacimiento");
		lblNewLabel_5_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(10, 113, 99, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Peso");
		lblNewLabel_6_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_1.setBounds(10, 138, 46, 14);
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
		peso_texto.setBounds(90, 133, 99, 20);
		panel_1.add(peso_texto);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Vacuna rabia");
		lblNewLabel_6_1_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_1_1.setBounds(10, 163, 72, 14);
		panel_1.add(lblNewLabel_6_1_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Sí");
		rdbtnNewRadioButton_2.setFont(new Font("Carlito", Font.PLAIN, 13));
		rdbtnNewRadioButton_2.setBackground(SystemColor.text);
		rdbtnNewRadioButton_2.setBounds(103, 159, 38, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("No");
		rdbtnNewRadioButton_1_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		rdbtnNewRadioButton_1_1.setBackground(SystemColor.textHighlightText);
		rdbtnNewRadioButton_1_1.setBounds(143, 159, 44, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("Datos cliente");
		lblNewLabel_7.setFont(new Font("Carlito", Font.BOLD, 16));
		lblNewLabel_7.setBounds(93, 85, 98, 18);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Datos mascota");
		lblNewLabel_7_1.setFont(new Font("Carlito", Font.BOLD, 16));
		lblNewLabel_7_1.setBounds(330, 85, 106, 18);
		contentPane.add(lblNewLabel_7_1);
		
		JButton btnGuardar = new JButton("Guardar datos");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(usuario_texto  != null && apellidos_texto != null && nombre_texto !=null && contrasena_texto !=null && dni_texto !=null && telefono_texto != null ) {
					
				}
				
				
			}
		});
		btnGuardar.setBounds(400, 318, 117, 23);
		contentPane.add(btnGuardar);
		
		JButton btnVisualizarLosDatos = new JButton("Visualizar los datos");
		btnVisualizarLosDatos.setBounds(265, 318, 117, 23);
		contentPane.add(btnVisualizarLosDatos);
	}
}
