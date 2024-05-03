package clinicacanopus_BBDD;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Toolkit;

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
import javax.swing.SwingConstants;

public class Datos extends JFrame  {

	private static final long serialVersionUID = 1L;
	public JPanel contentPane;
	JTextField recibe;
	
	//METODOS ESTÁTICOS PARA GUARDAR LOS DATOS
	static String nuevonombre;
	 
	static String nuevoDNI;
	static String nuevaFecha;
	static String nuevoEmail;
	static String nuevotelef;
	static String nuevoSeguro;
	static String nuevoNombre;
	static String nuevoApellidos;
	private JLabel lblNewLabel_8;

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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Datos.class.getResource("/clinicacanopus_BBDD/icono3.png")));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo
		
		//CONEXION CON LA BASE DE DATOS
		ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");

		//CONTENIDO DEL FRAME
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Datos.class.getResource("/clinicacanopus_BBDD/Logo_clinica.png")));
		lblNewLabel.setBounds(34, 25, 142, 53);
	
		contentPane.add(lblNewLabel);
	
		Panel panel = new Panel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(21, 162, 322, 222);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre y apellido");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		//AÑADIMOS LOS DATOS DEL USUARIO COMO CONTENIDO DEL LABEL
		lblNewLabel_1.setText(nuevoNombre);
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(21, 136, 124, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		
		
		JLabel lblNewLabel_2 = new JLabel("Usuario:");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 11, 68, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono contacto:");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_6.setBounds(10, 152, 113, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Seguro:");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 12));
		lblNewLabel_7.setBounds(10, 192, 68, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_5 = new JLabel("Email:");
		lblNewLabel_5.setBounds(10, 116, 46, 14);
		panel.add(lblNewLabel_5);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		JLabel lblNewLabel_4 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_4.setBounds(10, 78, 140, 14);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		JLabel lblNewLabel_3 = new JLabel("DNI:");
		lblNewLabel_3.setBounds(10, 42, 46, 14);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 12));
		
		JLabel Usuario_nombre = new JLabel("New label");
		Usuario_nombre.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//AÑADIMOS LOS DATOS DEL USUARIO COMO CONTENIDO DEL LABEL
		Usuario_nombre.setText(nuevonombre);
		Usuario_nombre.setBounds(152, 11, 160, 14);
		panel.add(Usuario_nombre);
		
		JLabel Dni_text = new JLabel("New label");
		Dni_text.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//AÑADIMOS LOS DATOS DEL USUARIO COMO CONTENIDO DEL LABEL
		Dni_text.setText(nuevoDNI);
		Dni_text.setBounds(152, 42, 150, 14);
		panel.add(Dni_text);
		
		
		
		
		JLabel Fechanacimiento = new JLabel("New label");
		Fechanacimiento.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//AÑADIMOS LOS DATOS DEL USUARIO COMO CONTENIDO DEL LABEL
		Fechanacimiento.setText(nuevaFecha);
		Fechanacimiento.setBounds(152, 78, 140, 14);
		panel.add(Fechanacimiento);
		
		JLabel Email = new JLabel("New label");
		Email.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//AÑADIMOS LOS DATOS DEL USUARIO COMO CONTENIDO DEL LABEL
		Email.setText(nuevoEmail);
		Email.setBounds(152, 116, 160, 14);
		panel.add(Email);
		
		JLabel Telefono = new JLabel("New label");
		Telefono.setFont(new Font("SansSerif", Font.PLAIN, 12));
		//AÑADIMOS LOS DATOS DEL USUARIO COMO CONTENIDO DEL LABEL
		Telefono.setText(nuevotelef);
		Telefono.setBounds(152, 152, 160, 14);
		panel.add(Telefono);
		
		JLabel Seguro = new JLabel("New label");
		Seguro.setFont(new Font("SansSerif", Font.PLAIN, 12));
		
		
		
		//SI LA VARIABLE DEL SEGURO ES 0, NO TIENE SEGURO, SI ES 1, TIENE SEGURO
		
		if(nuevoSeguro.equals("0")) {
			Seguro.setText("No tiene seguro");
		}
		
		else if (nuevoSeguro.equals("1")){
			Seguro.setText("tiene seguro");
		}
		else {
			Seguro.setText("coña");
		}
		
		
		
	
		
		
		
	
		
		
		Seguro.setBounds(152, 193, 160, 14);
		panel.add(Seguro);
			
			JLabel lblNewLabel_1_1 = new JLabel((String) null);
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_1.setText(nuevoApellidos);
			lblNewLabel_1_1.setForeground(new Color(255, 160, 122));
			lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 14));
			lblNewLabel_1_1.setBounds(122, 136, 142, 20);
			contentPane.add(lblNewLabel_1_1);
			
			

			Panel panelito = new Panel();
            panelito.setBounds(44, 77, 27, 20);
            contentPane.add(panelito);
            
            panelito.setForeground(new Color(255, 128, 64));
            panelito.setBackground(SystemColor.inactiveCaptionBorder);
            panelito.setBounds(0, 97, 658, 25);
            contentPane.add(panelito);
            panelito.setLayout(null);

            JLabel textoPanelito;
            textoPanelito = new JLabel("Datos personales");
            textoPanelito.setForeground(new Color(255, 128, 64));
            textoPanelito.setBounds(30, 0, 254, 25);
            panelito.add(textoPanelito);
            textoPanelito.setHorizontalAlignment(SwingConstants.LEFT);
            textoPanelito.setFont(new Font("SansSerif", Font.BOLD, 15));
            
            JButton atras = new JButton("Volver");
            atras.setForeground(new Color(255, 128, 64));
            
            //BOTÓN DE VOLVER PARA LA ANTERIOR VENTANA
    		atras.setName("volver");
    		atras.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				
    				try {
    				Principal_cliente a = new Principal_cliente();
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

            
            
            
            JButton btnNewButton = new JButton("¿Desea modificar la contraseña?");
            
            //BOTÓN PARA ABRIR LA VENTANA DE MODIFICAR CONTRASEÑA
            btnNewButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                    try {
    
                    Modificar_contraseña a = new Modificar_contraseña();
                    a.setVisible(true);
                    
                    }
                    catch (Exception e3) {
                        e3.printStackTrace();
                    }
                }
            });
            btnNewButton.setBackground(new Color(255, 204, 153));
            btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 12));
            btnNewButton.setBounds(389, 363, 227, 21);
            contentPane.add(btnNewButton);
            
            lblNewLabel_8 = new JLabel("");
            lblNewLabel_8.setIcon(new ImageIcon(Datos.class.getResource("/clinicacanopus_BBDD/gatito22.png")));
            lblNewLabel_8.setBounds(355, 115, 279, 269);
            contentPane.add(lblNewLabel_8);



		
	
	}
}
