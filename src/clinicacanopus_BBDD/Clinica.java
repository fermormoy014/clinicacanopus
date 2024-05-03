package clinicacanopus_BBDD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import clinicacanopus_BBDD.ConexionMySQL;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Clinica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField Contrasena_ingresar;
	
	//CONEXION CON LA BASE DE DATOS
	ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");
	static String guardarUsuario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//ABRIR LA VENTANA 
					Clinica frame = new Clinica();
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
	public Clinica() {
		setResizable(false);
		
		//CONTENIDO DE LA VENTANA
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\Logo_clinica.png"));
		lblNewLabel.setBounds(203, 11, 248, 125);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(234, 153, 228, 192);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(20, 48, 66, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Iniciar sesión");
		lblNewLabel_1.setForeground(new Color(255, 128, 64));
		lblNewLabel_1.setBounds(63, 11, 105, 16);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		JEditorPane Usuario_ingresar = new JEditorPane();
		Usuario_ingresar.setFont(new Font("Consolas", Font.PLAIN, 10));
		Usuario_ingresar.setBounds(20, 75, 185, 17);
		panel.add(Usuario_ingresar);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(20, 103, 95, 14);
		panel.add(lblNewLabel_3);
		
		Contrasena_ingresar = new JPasswordField();
		Contrasena_ingresar.setFont(new Font("Consolas", Font.PLAIN, 10));
		Contrasena_ingresar.setBounds(20, 128, 185, 16);
		panel.add(Contrasena_ingresar);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings({ "deprecation" })
			public void actionPerformed(ActionEvent e) {
				
				
				
				try {
					conect.conectar();
					
					//NOS CONECTAMOS Y HACEMOS UNA BÚSQUEDA EN DOS TABLAS, PARA SABER SI EL USUARIO ES CLIENTE O ADMINISTRADOR
					String sentencia="SELECT * FROM Cliente WHERE NombreUsuario= '"+Usuario_ingresar.getText()+"'AND Contrasena = '"+Contrasena_ingresar.getText()+"'  ";
					
					String sentencia2="SELECT * FROM Administrador WHERE NombreAdministrador= '"+Usuario_ingresar.getText()+"'AND Contrasena = '"+Contrasena_ingresar.getText()+"'  ";
					
					 ResultSet resultado = conect.ejecutarSelect(sentencia) ;
					 ResultSet resultado2 = conect.ejecutarSelect(sentencia2) ;
					 String usuarioCorrecto=null;
					 String contrasenaCorrecta=null;
					
					if(resultado.next()) {
						
						//SI EL USUARIO ES CLIENTE
						 usuarioCorrecto=resultado.getString(1);
						 contrasenaCorrecta=resultado.getString(2);
						 
						 
						JOptionPane.showMessageDialog(null, "Login correcto");
						
						
						//ABRIMOS LA VENTANA PRINCIPAL DE CLIENTE
						Principal_cliente v1= new Principal_cliente();
						v1.setVisible(true);
						guardarUsuario=Usuario_ingresar.getText();
						dispose();
						
						
					}
					else if (resultado2.next()) {
						//SI EL USUARIO ES ADMINISTRADOR
						
						 usuarioCorrecto=resultado2.getString(1);
						 contrasenaCorrecta=resultado2.getString(2);
						JOptionPane.showMessageDialog(null, "Login correcto");
						
						
						//ABRIMOS LA VENTANA DE ADMINISTRADOR
						Principal_administrador v1= new Principal_administrador();
						v1.setVisible(true);
						guardarUsuario=Usuario_ingresar.getText();
						dispose();
						
						
					}
						
					
					
					else {
						
						//SI NINGÚN USUARIO Y CONTRASEÑA COINCIDE, DAMOS UN MENSAJE DE ERROR Y LE PEDIMOS QUE VUELVA A INTENTARLO
						JOptionPane.showMessageDialog(null, "error de login, vuelva a intentarlo");
					}
					
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		btnNewButton.setBounds(134, 165, 71, 16);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\gato.png"));
		lblNewLabel_4.setBounds(0, 0, 193, 406);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\perro.png"));
		lblNewLabel_5.setBounds(439, 0, 217, 406);
		contentPane.add(lblNewLabel_5);
		
		
		
	}
}
