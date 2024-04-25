package PROYECTO;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Principal_administrador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal_administrador frame = new Principal_administrador();
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
	public Principal_administrador() {
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
		
		
		
		JButton btnNewButton = new JButton("Registrar cliente");
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(SystemColor.inactiveCaption);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(229, 128, 156, 39);
		contentPane.add(btnNewButton);

		
		
		
		
		JButton btnNewButton_2 = new JButton("Modificar datos");
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(41, 128, 156, 39);
		contentPane.add(btnNewButton_2);
	}

}
