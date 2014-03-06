import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import javax.xml.parsers.ParserConfigurationException;
import javax.swing.JLabel;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.swing.JComboBox;



public class Parsing extends JFrame {
	private Document doc;
	private JPanel contentPane;
	private JLabel label;
	Program Program;
	private int programsize;
	
	ArrayList<Program> programsList = new ArrayList<Program>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Parsing frame = new Parsing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private Document root;

	/**
	 * Create the frame.
	 */
	public Parsing() {
		doc = openXmlFile("ht2013_antagning.xml");		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
	
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel elementLabel = new JLabel("New label");
		elementLabel.setBounds(203, 11, 209, 43);
		contentPane.add(elementLabel);
       
		
	
		
		JLabel lblFrstaElementetrooten = new JLabel("F\u00F6rsta elementet (rooten):");
		lblFrstaElementetrooten.setBounds(27, 25, 166, 29);
		contentPane.add(lblFrstaElementetrooten);
		
		JLabel lblAntalProgram = new JLabel("Antal program:");
		lblAntalProgram.setBounds(39, 65, 88, 23);
		contentPane.add(lblAntalProgram);
		
		JLabel label_1 = new JLabel();
		label_1.setBounds(133, 69, 46, 14);
		
		
	
		contentPane.add(label_1);
		String name = doc.getDocumentElement().getNodeName();
		elementLabel.setText(name);
		
		programsList = loadAllPrograms();
		label_1.setText(Integer.toString(programsize));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(69, 99, 343, 23);
		contentPane.add(comboBox);
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
	}
	private Document openXmlFile(String fileName) {
		Document doc = null;
		try {
		File fXmlFile = new File(fileName);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		doc = dBuilder.parse(fXmlFile);
		doc.getDocumentElement().normalize();
		} catch (Exception e) {
		e.printStackTrace();
		}
		return doc;
		}
		
	


private ArrayList<Program> loadAllPrograms() {
	ArrayList<Program> output = new ArrayList<Program>();
	// Hämta alla program
	NodeList programs = doc.getElementsByTagName("Program");
	programsize = programs.getLength();
	System.out.println(programsize);
	for (int i = 0; i < programs.getLength(); i++) {
	// Gör om varje nod i listan till ett element
	Node node = programs.item(i);
	Element elm = (Element) node;
	// Hämta data från elementet
	String name = elm.getElementsByTagName("name").item(0).getTextContent();
	String code = elm.getElementsByTagName("code").item(0).getTextContent();
	int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
	int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
	// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män)
	// Skapa programmet och lägg till i listan
	Program program = new Program(name, code, women, men);
	output.add(program);
	}
	return output;
}
}
	
