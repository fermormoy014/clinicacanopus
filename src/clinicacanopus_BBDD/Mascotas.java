package clinicacanopus_BBDD;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Panel;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mascotas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	//ESTÁTICOS PARA GUARDAR LOS DATOS TEMPORALES DE LA MASCOTA
	static String nuevoidentificador;
	static String nuevaraza;
	static String nuevaFechaAnimal;
	static String nuevoPeso;
	static String nuevoEspecie;
	static String nuevoVacuna;
	static String nuevoNombreMascota;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mascotas frame = new Mascotas();
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
	public Mascotas() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo
        
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//CONTENIDO DEL FRAME
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\Logo_clinica.png"));
		lblNewLabel.setBounds(21, 11, 161, 67);
		contentPane.add(lblNewLabel);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(248, 248, 255));
		panel.setBounds(168, 183, 294, 181);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Identificador:");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 23, 96, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Especie:");
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 48, 57, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Raza:");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 73, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso:");
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 98, 46, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_6.setBounds(10, 123, 128, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Vacuna rabia:");
		lblNewLabel_7.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_7.setBounds(10, 148, 96, 14);
		panel.add(lblNewLabel_7);
		
		JLabel Identificador_lbl = new JLabel("New label");
		Identificador_lbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		//USAMOS EL ESTÁTICO PARA DARLE VALOR DE LOS DATOS DE LA MASCOTA
		Identificador_lbl.setText(nuevoidentificador);
		Identificador_lbl.setBounds(164, 23, 120, 14);
		panel.add(Identificador_lbl);
		
		JLabel Especie_lbl = new JLabel("New label");
		Especie_lbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		//USAMOS EL ESTÁTICO PARA DARLE VALOR DE LOS DATOS DE LA MASCOTA
		Especie_lbl.setText(nuevoEspecie);
		Especie_lbl.setBounds(164, 48, 109, 25);
		panel.add(Especie_lbl);
		
		JLabel Raza_lbl = new JLabel("New label");
		Raza_lbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		//USAMOS EL ESTÁTICO PARA DARLE VALOR DE LOS DATOS DE LA MASCOTA
		Raza_lbl.setText(nuevaraza);
		Raza_lbl.setBounds(164, 73, 120, 14);
		panel.add(Raza_lbl);
		
		JLabel Peso_lbl = new JLabel("New label");
		Peso_lbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		//USAMOS EL ESTÁTICO PARA DARLE VALOR DE LOS DATOS DE LA MASCOTA
		Peso_lbl.setText(nuevoPeso);
		Peso_lbl.setBounds(164, 98, 96, 14);
		panel.add(Peso_lbl);
		
		JLabel Fecha_lbl = new JLabel("New label");
		Fecha_lbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		//USAMOS EL ESTÁTICO PARA DARLE VALOR DE LOS DATOS DE LA MASCOTA
		Fecha_lbl.setText(nuevaFechaAnimal);
		Fecha_lbl.setBounds(164, 123, 96, 14);
		panel.add(Fecha_lbl);
		
		JLabel Vacuna_lbl = new JLabel("New label");
		Vacuna_lbl.setFont(new Font("SansSerif", Font.PLAIN, 13));
		//SI EL VALOR DE VACUNA ES 0, NO ESTÁ VACUNADO, SI ES 1, SI LO ESTÁ
		if(nuevoVacuna.equals("1")) {
			Vacuna_lbl.setText("esta vacunado");
		}
		else if (nuevoVacuna.equals("0")){
			Vacuna_lbl.setText("no esta vacunado");
		}

		
		Vacuna_lbl.setBounds(164, 148, 120, 14);
		panel.add(Vacuna_lbl);
		
		JLabel lblNewLabel_1 = new JLabel("Perro 1");
		lblNewLabel_1.setText(nuevoNombreMascota);
		lblNewLabel_1.setForeground(new Color(255, 160, 122));
		lblNewLabel_1.setBounds(168, 155, 191, 20);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		Panel panelito = new Panel();
		panelito.setBounds(84, 89, 10, 10);
		contentPane.add(panelito);
	
        panelito.setForeground(new Color(255, 128, 64));
        panelito.setBackground(SystemColor.inactiveCaptionBorder);
        panelito.setBounds(0, 97, 658, 25);
        contentPane.add(panelito);
        panelito.setLayout(null);

        JLabel textoPanelito;
        textoPanelito = new JLabel("Mis mascotas");
        textoPanelito.setFont(new Font("SansSerif", Font.BOLD, 15));
        textoPanelito.setForeground(new Color(255, 128, 64));
        textoPanelito.setBounds(30, 0, 254, 25);
        panelito.add(textoPanelito);
        textoPanelito.setHorizontalAlignment(SwingConstants.LEFT);
        
        JButton atras = new JButton("Volver");
        atras.setForeground(new Color(255, 128, 64));
        atras.setBounds(559, 3, 89, 23);
        panelito.add(atras);
		
		atras.setName("volver");
		//BOTÓN DE VOLVER A LA VENTANA ANTERIOR
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
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\mascotas11.png"));
		lblNewLabel_8.setBounds(10, 122, 648, 284);
		contentPane.add(lblNewLabel_8);
		
		
	}
}
