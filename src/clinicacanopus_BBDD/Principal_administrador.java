package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;

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
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo

		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\Logo_clinica.png"));
		lblNewLabel.setBounds(21, 11, 176, 80);
		contentPane.add(lblNewLabel);
		
		
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\3534139.png"));
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Registro a = new Registro();
					a.setVisible(true);
					dispose();
					
					}
					catch (Exception e3) {
						e3.printStackTrace();
		
				}
			}
		});
		btnNewButton.setBounds(129, 203, 147, 147);
		contentPane.add(btnNewButton);

		
		
		
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\personales1.png"));
		btnNewButton_2.setFont(new Font("SansSerif", Font.PLAIN, 13));
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					recomendaciones a = new recomendaciones();
					a.setVisible(true);
					dispose();
					
					}
					catch (Exception e3) {
						e3.printStackTrace();
		
				}
			}
		});
		btnNewButton_2.setBounds(378, 203, 147, 147);
		contentPane.add(btnNewButton_2);
		
		Panel panelito = new Panel();
		panelito.setForeground(new Color(255, 128, 64));
		panelito.setBackground(SystemColor.inactiveCaptionBorder);
		panelito.setBounds(0, 97, 656, 25);
		contentPane.add(panelito);
		panelito.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Bienvenid@ administrador");
		lblNewLabel_8.setForeground(new Color(255, 128, 64));
		lblNewLabel_8.setBounds(30, 0, 571, 25);
		panelito.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		JLabel lblNewLabel_1 = new JLabel("Generar recomendación");
		lblNewLabel_1.setForeground(new Color(0, 128, 128));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBackground(new Color(95, 158, 160));
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_1.setBounds(365, 158, 172, 22);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Registrar cliente");
		lblNewLabel_2.setForeground(new Color(0, 128, 128));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBackground(new Color(95, 158, 160));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 15));
		lblNewLabel_2.setBounds(141, 158, 132, 22);
		contentPane.add(lblNewLabel_2);
		
	
		
	}

}
