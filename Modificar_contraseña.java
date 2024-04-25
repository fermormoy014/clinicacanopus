package PROYECTO;

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
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Modificar_contraseña extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNuevaContrasea;
	private JPasswordField passwordField;

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
		panel.setBackground(new Color(245, 245, 245));
		panel.setBounds(120, 87, 199, 164);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(10, 11, 99, 14);
		panel.add(lblNewLabel_1);
		
		txtNuevaContrasea = new JTextField();
		txtNuevaContrasea.setBounds(10, 32, 128, 20);
		panel.add(txtNuevaContrasea);
		txtNuevaContrasea.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nueva contraseña");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 63, 117, 14);
		panel.add(lblNewLabel_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(10, 88, 128, 20);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnNewButton.setBounds(10, 130, 89, 23);
		panel.add(btnNewButton);
		
		
		
	}
}
