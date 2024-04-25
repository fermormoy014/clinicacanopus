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

public class Registro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

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
		
		textField = new JTextField();
		textField.setBounds(78, 8, 115, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(10, 38, 46, 14);
		panel.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setBounds(78, 33, 115, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellidos");
		lblNewLabel_3.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_3.setBounds(10, 63, 61, 14);
		panel.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBounds(78, 58, 115, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("DNI");
		lblNewLabel_4.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_4.setBounds(10, 88, 46, 14);
		panel.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(78, 83, 115, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("T. Contacto");
		lblNewLabel_5.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_5.setBounds(10, 113, 99, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6.setBounds(10, 138, 46, 14);
		panel.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.setBounds(78, 108, 115, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(78, 133, 115, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
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
		
		textField_12 = new JTextField();
		textField_12.setBounds(78, 160, 115, 19);
		panel.add(textField_12);
		textField_12.setColumns(10);
		
		Panel panel_1 = new Panel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(282, 99, 199, 198);
		contentPane.add(panel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Identificador");
		lblNewLabel_1_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 13, 131, 14);
		panel_1.add(lblNewLabel_1_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(90, 8, 99, 20);
		panel_1.add(textField_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Especie");
		lblNewLabel_2_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(10, 38, 46, 14);
		panel_1.add(lblNewLabel_2_1);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(90, 33, 99, 20);
		panel_1.add(textField_7);
		
		JLabel lblNewLabel_3_1 = new JLabel("Raza");
		lblNewLabel_3_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_3_1.setBounds(10, 63, 46, 14);
		panel_1.add(lblNewLabel_3_1);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(90, 58, 99, 20);
		panel_1.add(textField_8);
		
		JLabel lblNewLabel_4_1 = new JLabel("Nombre");
		lblNewLabel_4_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_4_1.setBounds(10, 88, 46, 14);
		panel_1.add(lblNewLabel_4_1);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(90, 83, 99, 20);
		panel_1.add(textField_9);
		
		JLabel lblNewLabel_5_1 = new JLabel("F. Nacimiento");
		lblNewLabel_5_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_5_1.setBounds(10, 113, 99, 14);
		panel_1.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Peso");
		lblNewLabel_6_1.setFont(new Font("Carlito", Font.PLAIN, 13));
		lblNewLabel_6_1.setBounds(10, 138, 46, 14);
		panel_1.add(lblNewLabel_6_1);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(90, 108, 99, 20);
		panel_1.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(90, 133, 99, 20);
		panel_1.add(textField_11);
		
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
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Guardar datos");
		tglbtnNewToggleButton.setBounds(389, 318, 116, 23);
		contentPane.add(tglbtnNewToggleButton);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("Visualizar los datos");
		tglbtnNewToggleButton_1.setBounds(256, 318, 123, 23);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Datos cliente");
		lblNewLabel_7.setFont(new Font("Carlito", Font.BOLD, 16));
		lblNewLabel_7.setBounds(93, 85, 98, 18);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_7_1 = new JLabel("Datos mascota");
		lblNewLabel_7_1.setFont(new Font("Carlito", Font.BOLD, 16));
		lblNewLabel_7_1.setBounds(330, 85, 106, 18);
		contentPane.add(lblNewLabel_7_1);
	}
}
