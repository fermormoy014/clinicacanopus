package clinicacanopus_BBDD;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import BBDD.ConexionMySQL;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Panel;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Clinica extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
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
		
		JLabel lblNewLabel_2 = new JLabel("Usuario");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(10, 38, 66, 16);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Iniciar sesión");
		lblNewLabel_1.setBounds(56, 11, 87, 16);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		panel.add(lblNewLabel_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Consolas", Font.PLAIN, 10));
		editorPane.setBounds(20, 62, 155, 14);
		panel.add(editorPane);
		
		JLabel lblNewLabel_3 = new JLabel("Contraseña");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(10, 87, 95, 14);
		panel.add(lblNewLabel_3);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Consolas", Font.PLAIN, 10));
		passwordField.setBounds(20, 112, 155, 14);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setBackground(new Color(60, 179, 113));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 10));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Principal_cliente vPrincipal = new Principal_cliente();
				vPrincipal.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(104, 137, 71, 16);
		panel.add(btnNewButton);
		
		
	}
}
