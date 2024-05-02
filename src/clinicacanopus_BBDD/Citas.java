
package clinicacanopus_BBDD;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
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
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.Toolkit;

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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.awt.event.ItemEvent;
import com.toedter.calendar.JDateChooser;
import javax.swing.JEditorPane;
import java.awt.Button;

public class Citas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ConexionMySQL conect = new ConexionMySQL("freedb_clinica.canopus", "e*c@PPqX4bzdzfY", "freedb_clinica_canopus");
	private Panel panel_1;
	private Button atras;
	private JLabel lblNewLabel;

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
	 * @throws ParseException 
	 */
	public Citas() throws ParseException {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 445);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		Dimension screenSize= Toolkit.getDefaultToolkit().getScreenSize();//Obtiene el tamaño de la pantalla del dispositivo
        
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(10, 128, 633, 191);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Motivo");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_2.setBounds(72, 29, 52, 18);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_4 = new JLabel("*Si hace clic en aceptar, se comprobará si está disponible. Si está disponible el sistema reservará su cita automáticamente.");
		lblNewLabel_4.setForeground(Color.BLACK);
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 9));
		lblNewLabel_4.setBounds(52, 165, 522, 14);
		panel.add(lblNewLabel_4);
		
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
		comboBox.setBounds(72, 58, 175, 20);
		panel.add(comboBox);
		
		JLabel lblNewLabel_3 = new JLabel("Elegir mascota");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(72, 100, 127, 18);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_3.setBackground(SystemColor.inactiveCaption);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("dd/MM/yyyy");
		dateChooser.setBounds(319, 129, 100, 20);
		panel.add(dateChooser);
		
		
		
			
		
		
		JComboBox comboBox_1 = new JComboBox(); 
		comboBox_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
				
				

			}
		});
		comboBox_1.setBackground(SystemColor.control);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Elegir una opción:", "Perro", "Gato", "Otros"}));
		comboBox_1.setBounds(72, 129, 175, 20);
		panel.add(comboBox_1);
		
		JComboBox comboBox_hora = new JComboBox();
		comboBox_hora.setModel(new DefaultComboBoxModel(new String[] {"9:00", "9:30", "10:00", "10:30", "11:00", "11:30"}));
		comboBox_hora.setBounds(319, 59, 175, 18);
		panel.add(comboBox_hora);
		
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setForeground(new Color(0, 128, 0));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					conect.conectar();
					
					String sentencia = "SELECT * FROM Cita ";
					
					String fecha=dateChooser.getDate().toString();
					String formatoSQL = "EEE MMM dd HH:mm:ss zzz yyyy";
					String formatoJava="dd/MM/yyyy";
					
					SimpleDateFormat formato1 = new SimpleDateFormat(formatoSQL, Locale.ENGLISH);
					SimpleDateFormat formato2 = new SimpleDateFormat(formatoJava);
					
					
						java.util.Date fecha1 = formato1.parse(fecha);
						String fechaformateada = formato2.format(fecha1);
					
					
					
					ResultSet resultado = conect.ejecutarSelect(sentencia);
					
					boolean encontrado=false;
					
					while(resultado.next() && !encontrado) {
						
						String fecha2 =resultado.getString("Fecha_cita");
						String Hora = resultado.getString("Hora");
						
						if(fecha2.equals(fechaformateada) && Hora.equals(String.valueOf(comboBox_hora.getSelectedItem()))) {
							
							JOptionPane.showMessageDialog(null, "esa hora esta ocupada, por favor, elija otra hora");
							encontrado=true;
							
						}
					}
						
						if(!encontrado){
							try {
								
								
								
								
							
							String sentencia2 = "INSERT INTO Cita (Fecha_cita, Mascota, Motivo, Hora, NombreUsuario) VALUES  ('"+fechaformateada+"','"+String.valueOf(comboBox_1.getSelectedItem())+"','"
									+String.valueOf(comboBox.getSelectedItem())+"', '"+String.valueOf(comboBox_hora.getSelectedItem())+"','"+Clinica.guardarUsuario+"')";
												
												conect.ejecutarInsertDeleteUpdate(sentencia2);
												
												JOptionPane.showMessageDialog(null, "cita reservada");
												
							}catch(Exception e2) {
								System.out.print(e2);
							}
						}
					
					
				}
				catch(Exception e1) {
					System.out.print(e1);
					
				}
				
				
				
			}
				
				
		});
		
		
		btnNewButton_1.setBounds(462, 129, 134, 18);
		panel.add(btnNewButton_1);
		btnNewButton_1.setBackground(SystemColor.menu);
		
	
		
		JLabel lblNewLabel_3_1 = new JLabel("Elegir Hora");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_3_1.setBackground(SystemColor.inactiveCaption);
		lblNewLabel_3_1.setBounds(319, 29, 127, 18);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_1 = new JLabel("Elegir día ");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 13));
		lblNewLabel_1.setBounds(319, 102, 81, 15);
		panel.add(lblNewLabel_1);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Usuario 1\\Documents\\GitHub\\clinicacanopus\\src\\clinicacanopus_BBDD\\Logo_clinica.png"));
		lblNewLabel.setBounds(43, 11, 172, 80);
		contentPane.add(lblNewLabel);
		
		panel_1 = new Panel();
		panel_1.setForeground(new Color(255, 128, 64));
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(10, 97, 633, 25);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Coger cita");
		lblNewLabel_5.setForeground(new Color(255, 128, 64));
		lblNewLabel_5.setBounds(30, 0, 84, 25);
		panel_1.add(lblNewLabel_5);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		atras = new Button("Volver");
		atras.setName("volver");
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
		panel_1.add(atras);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(SystemColor.inactiveCaptionBorder);
		panel_2.setBounds(10, 325, 636, 70);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("Próximas citas");
		lblNewLabel_6.setForeground(Color.BLACK);
		lblNewLabel_6.setBounds(10, 11, 112, 18);
		lblNewLabel_6.setFont(new Font("SansSerif", Font.BOLD, 13));
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton = new JButton("Cancelar cita");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int respuesta=JOptionPane.showConfirmDialog(null, "¿Estas seguro que quieres borrar la cita?", "Confirmacion", JOptionPane.YES_NO_OPTION);
					if(respuesta==JOptionPane.YES_OPTION) {
						conect.conectar();
						try {
						String sentencia = "DELETE FROM Cita WHERE NombreUsuario = '"+Clinica.guardarUsuario+"'";
						
						conect.ejecutarInsertDeleteUpdate(sentencia);
						
						JOptionPane.showMessageDialog(null, "reserva de cita eliminada");
						}
						catch(Exception e2) {
							System.out.println(e2);
						}
						
					}
					else {
						JOptionPane.showMessageDialog(null, "error al eliminar la cita");
					}
					
				}
				catch(Exception e1){
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(255, 204, 153));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(514, 36, 112, 23);
		panel_2.add(btnNewButton);
		
		JLabel Fecha_prox = new JLabel("New label");
		try {
			conect.conectar();
			String sentencia = "SELECT Fecha_cita FROM Cita WHERE NombreUsuario = '"+Clinica.guardarUsuario+"' ";
			
			ResultSet resultado = conect.ejecutarSelect(sentencia);
			
			while(resultado.next()) {
			
			String fechacita = resultado.getString("Fecha_cita");
			Fecha_prox.setText(fechacita);
			}
		}
		catch (Exception e){
			
		}
		
		Fecha_prox.setBounds(42, 40, 100, 14);
		panel_2.add(Fecha_prox);
		
		JLabel Hora_prox = new JLabel("New label");
		try {
			conect.conectar();
			String sentencia = "SELECT Hora FROM Cita WHERE NombreUsuario = '"+Clinica.guardarUsuario+"' ";
			
			ResultSet resultado = conect.ejecutarSelect(sentencia);
			
			while(resultado.next()) {
			
			String hora = resultado.getString("Hora");
			Hora_prox.setText(hora);
			}
		}
		catch (Exception e){
			
		}
		
		
		Hora_prox.setBounds(170, 40, 79, 14);
		panel_2.add(Hora_prox);
		
		
	
	
}
}
