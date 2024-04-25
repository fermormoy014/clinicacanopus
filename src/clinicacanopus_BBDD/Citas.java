package PROYECTO;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Panel;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import java.awt.List;
import javax.swing.JDesktopPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JProgressBar;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Citas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Citas frame = new Citas();
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
	public Citas() {
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
		panel.setBounds(37, 91, 216, 160);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Motivo");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 11, 52, 18);
		panel.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.menu);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setSelectedIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\4403531 (1).png"));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\4403531 (1).png"));
		btnNewButton.setBounds(10, 121, 26, 28);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_4 = new JLabel("Ver disponibilidad");
		lblNewLabel_4.setForeground(new Color(34, 139, 34));
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 10));
		lblNewLabel_4.setBounds(78, 135, 95, 14);
		panel.add(lblNewLabel_4);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\calendario2 (1).png"));
		btnNewButton_1.setBounds(181, 126, 26, 23);
		panel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
								
			}
		});
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		comboBox.setBackground(SystemColor.control);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir una opción:", "Peluquería", "Revisión", "Vacunas", "Otros"}));
		comboBox.setBounds(20, 40, 175, 18);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Elegir mascota");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 69, 127, 18);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_3.setBackground(SystemColor.inactiveCaption);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				

			}
		});
		comboBox_1.setBackground(SystemColor.control);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Elegir una opción:", "Perro", "Gato", "Otros"}));
		comboBox_1.setBounds(20, 92, 175, 18);
		panel.add(comboBox_1);
		
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Desktop\\PROGRAMACION USUARIO 1\\INTERFACES\\src\\PROYECTO\\calendario (1).png"));
		lblNewLabel_1.setBounds(290, 98, 100, 103);
		contentPane.add(lblNewLabel_1);
		
		
	}
	

}
