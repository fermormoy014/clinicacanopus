package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.SystemColor;
import javax.swing.JButton;

public class recomendaciones extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	static String recomendacion;
	//CONEXIÓN A LA BASE DE DATOS
	ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recomendaciones frame = new recomendaciones();
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
	public recomendaciones() {
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\Logo_clinica.png"));
		
		lblNewLabel.setBounds(43, 11, 172, 80);		
		contentPane.add(lblNewLabel);
		
	
		
		Panel panelito = new Panel();
		panelito.setForeground(new Color(255, 128, 64));
		contentPane.add(panelito);
		panelito.setBackground(SystemColor.inactiveCaptionBorder);
		panelito.setBounds(0, 97, 656, 25);
		contentPane.add(panelito);
		panelito.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Recomendaciones");
		lblNewLabel_8.setForeground(new Color(255, 128, 64));
		lblNewLabel_8.setBounds(30, 0, 217, 25);
		panelito.add(lblNewLabel_8);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		
		JButton atras = new JButton("Volver");
        atras.setForeground(new Color(255, 128, 64));
        atras.setBounds(559, 3, 89, 23);
        panelito.add(atras);
		
        //BOTÓN PARA VOLVER HACIA ATRÁS
		atras.setName("volver");
		atras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				Principal_administrador a = new Principal_administrador();
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
		
		Panel panel = new Panel();
        panel.setBackground(new Color(255, 204, 153));
        panel.setBounds(113, 178, 402, 158);
        contentPane.add(panel);
        panel.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("Generar recomendación");
        lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(36, 30, 171, 14);
        panel.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setFont(new Font("SansSerif", Font.PLAIN, 14));
        textField.setBounds(36, 55, 328, 49);
        panel.add(textField);
        textField.setColumns(10);
        
        //BOTÓN PARA GUARDAR
        JButton btnNewButton = new JButton("Guardar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		try {
        			conect.conectar();
        			//INSERTAR LA RECOMENDACIÓN EN LA BASE DE DATOS
        			String sentencia = "INSERT INTO Recomendaciones (Recomendacion) VALUES ( '"+textField.getText()+"')";
        			
        			conect.ejecutarInsertDeleteUpdate(sentencia);
        			
        			//MENSAJE DE CONFIRMACIÓN
        			JOptionPane.showMessageDialog(null, "Recomendación creada");
        			
        		}catch(Exception e3) {
        			System.out.println(e3);
        		}
        		
        		   		
        		
        	}
        });
        btnNewButton.setBounds(275, 115, 89, 23);
        panel.add(btnNewButton);
        
        		
		
		
		
		
		
		
	}
}
