package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class Modificar_contraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtUsuario;
	private JPasswordField txtContrasena;
	private JPasswordField txtNewContrasena;
	ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar_contraseña frame = new Modificar_contraseña();
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
	public Modificar_contraseña() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\Logo_clinica.png"));
		lblNewLabel.setBounds(43, 11, 172, 80);		
		contentPane.add(lblNewLabel);
		
		Panel panelito = new Panel();
		panelito.setForeground(new Color(255, 128, 64));
		contentPane.add(panelito);
		panelito.setBackground(SystemColor.inactiveCaptionBorder);
		panelito.setBounds(10, 97, 633, 25);
		contentPane.add(panelito);
		panelito.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Modificar contraseña");
		lblNewLabel_8.setForeground(new Color(255, 128, 64));
		lblNewLabel_8.setBounds(30, 0, 217, 25);
		panelito.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		Panel panel = new Panel();
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(199, 157, 199, 205);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 11, 99, 14);
		panel.add(lblNewLabel_1);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 32, 128, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña actual");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 63, 117, 14);
		panel.add(lblNewLabel_2);
		
		txtContrasena = new JPasswordField();
		txtContrasena.setBounds(10, 88, 128, 20);
		panel.add(txtContrasena);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					conect.conectar();
					
					
					@SuppressWarnings("deprecation")
					String sentencia="SELECT * FROM Cliente WHERE NombreUsuario= '"+txtUsuario.getText()+"'AND Contrasena = '"+txtContrasena.getText()+"'  ";
					
					 ResultSet resultado = conect.ejecutarSelect(sentencia) ;
					 String usuarioCorrecto=null;
					 String contrasenaCorrecta=null;
					 
					 if(resultado.next()) {
							
							
						 usuarioCorrecto=resultado.getString(1);
						 contrasenaCorrecta=resultado.getString(2);
						 
						 
						
						
						
						try {
							@SuppressWarnings("deprecation")
							String sentencia1 = "UPDATE Cliente SET Contrasena ='"+txtNewContrasena.getText()+"' WHERE NombreUsuario = '"+txtUsuario.getText()+"'";
							conect.ejecutarInsertDeleteUpdate(sentencia1);
							JOptionPane.showMessageDialog(null, "Cambio de contraseña realizado");
						}
						catch(Exception e2) {
							
						}
				
						
					}
					 else {
						 JOptionPane.showMessageDialog(null, "Error, el usuario o la contraseña no coincide");
					 }
					
				}catch(Exception e1) {
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 171, 89, 23);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nueva contraseña");
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(10, 122, 117, 14);
		panel.add(lblNewLabel_2_1);
		
		txtNewContrasena = new JPasswordField();
		txtNewContrasena.setBounds(10, 140, 128, 20);
		panel.add(txtNewContrasena);
		
		
		
	}
}
