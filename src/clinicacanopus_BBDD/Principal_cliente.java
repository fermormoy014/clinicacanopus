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
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Principal_cliente extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
		
		JButton btnNewButton = new JButton("Mis mascotas");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 12));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Mascotas vMascotas = new Mascotas();
				vMascotas.setVisible(true);
			}
		});
		btnNewButton.setBounds(21, 103, 122, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Datos personales");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Datos vDatos = new Datos();
				vDatos.setVisible(true);
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
