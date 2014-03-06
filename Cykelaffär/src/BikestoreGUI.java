import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;


public class BikestoreGUI extends JFrame {
	
	 Bikestore bikeInfo;

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikestoreGUI frame = new BikestoreGUI();
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
	public BikestoreGUI() {
		getContentPane().setLayout(null);
		bikeInfo = new Bikestore();
		bikeInfo.addBike( "blå", 9, 1000 );
		bikeInfo.addBike( "svart", 2, 3000 );
		bikeInfo.addBike( "gul", 15, 11000 );
		bikeInfo.addBike( "rosa", 22, 2000 );
		bikeInfo.addBike( "blå", 19, 5000 );
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
			
			
		
		textField_1 = new JTextField();
		textField_1.setBounds(47, 21, 75, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(47, 52, 75, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(47, 87, 75, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnLggTill = new JButton("L\u00E4gg till");
		btnLggTill.addActionListener(new ActionListener() {
		
		public void actionPerformed(ActionEvent arg0) {
			
			int price1 = Integer.parseInt(textField_1.getText());
			int size1 = Integer.parseInt(textField_2.getText());
			bikeInfo.addBike(textField_3.getText(),price1,size1);
			textArea.setText(bikeInfo.getAllBikes().toString());
	
		}
	});
	btnLggTill.setBounds(10, 164, 89, 23);
	contentPane.add(btnLggTill);
		
		JLabel lblFrg = new JLabel("F\u00E4rg:");
		lblFrg.setBounds(10, 24, 46, 14);
		contentPane.add(lblFrg);
		
		JLabel lblStorlek = new JLabel("Storlek:");
		lblStorlek.setBounds(10, 55, 46, 14);
		contentPane.add(lblStorlek);
		
		JLabel lblPris = new JLabel("Pris:");
		lblPris.setBounds(10, 90, 46, 14);
		contentPane.add(lblPris);
		
		textArea = new JTextArea();
		textArea.setBounds(169, 11, 243, 128);
		contentPane.add(textArea);
		textArea.append(bikeInfo.getAllBikes());
	}
}
