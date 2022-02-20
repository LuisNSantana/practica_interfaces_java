package examenInterfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JProgressBar;
import java.awt.TextArea;
import javax.swing.JSpinner;
import java.awt.Font;

public class EmisoraRadio extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUser;
	private JTextField textFieldPWD;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EmisoraRadio frame = new EmisoraRadio();
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
	public EmisoraRadio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 530, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblFrecuencia = new JLabel("FRECUENCIA");
		lblFrecuencia.setBounds(6, 132, 98, 16);
		panel.add(lblFrecuencia);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(6, 6, 222, 114);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblUsuario = new JLabel("USUARIO");
		lblUsuario.setBounds(6, 6, 61, 16);
		panel_1.add(lblUsuario);
		
		JLabel lblPwd = new JLabel("PWD");
		lblPwd.setBounds(6, 34, 61, 16);
		panel_1.add(lblPwd);
		
		textFieldUser = new JTextField();
		textFieldUser.setBounds(79, 1, 130, 26);
		panel_1.add(textFieldUser);
		textFieldUser.setColumns(10);
		textFieldUser.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//creamos una variabe para coger el String
					String old = textFieldUser.getText();
					//Pasamos el String a upperCase
					old = old.toUpperCase();
					//Añadimos el nuevo String
					textFieldUser.setText(old);
				
			}
		});
		
		textFieldPWD = new JTextField();
		textFieldPWD.setBounds(79, 41, 130, 26);
		panel_1.add(textFieldPWD);
		textFieldPWD.setColumns(10);
		textFieldPWD.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//creamos una variabe para coger el String
					String older = textFieldPWD.getText();
					//Pasamos el String a upperCase
					older = older.toUpperCase();
					//Añadimos el nuevo String
					textFieldPWD.setText(older);
				
			}
		});
		
		JButton btnConectar = new JButton("CONECTAR");
		btnConectar.setBounds(6, 79, 214, 29);
		panel_1.add(btnConectar);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 154, 191, 122);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton button = new JButton("<");
		button.setBounds(0, 61, 82, 29);
		panel_2.add(button);
		
		JButton btnNewButton = new JButton(">");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(97, 61, 88, 29);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.setBounds(10, 87, 175, 29);
		panel_2.add(btnNewButton_1);
		
		JLabel label = new JLabel("92.6");
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 25));
		label.setBounds(65, 27, 71, 29);
		panel_2.add(label);
		
		
		JRadioButton rdbtnFm = new JRadioButton("FM");
		buttonGroup.add(rdbtnFm);
		rdbtnFm.setBounds(202, 187, 55, 23);
		panel.add(rdbtnFm);
		
		JRadioButton rdbtnAm = new JRadioButton("AM");
		buttonGroup.add(rdbtnAm);
		rdbtnAm.setBounds(201, 211, 55, 23);
		panel.add(rdbtnAm);
		
		int lvldos = 33;
		int lvltres = 50;
		
		JLabel lblVolumen = new JLabel("VOLUMEN");
		lblVolumen.setBounds(6, 288, 90, 16);
		panel.add(lblVolumen);
		
		Jprogress progressBar = new Jprogress();
		progressBar.setBounds(6, 309, 243, 20);
		progressBar.setMaximum(100);
		progressBar.setStringPainted(true);
		panel.add(progressBar);
		
		
		JButton volumenMenos = new JButton("-");
		volumenMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valueolddeerrrr= progressBar.getValue();
				if (volumenMenos.isSelected()) {
					valueolddeerrrr-=lvldos;
				} else {
					valueolddeerrrr-=lvldos;
				}
				progressBar.setValue(valueolddeerrrr);
				
			}
		});
		volumenMenos.setBounds(-2, 334, 117, 28);
		panel.add(volumenMenos);
		
		JLabel lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setBounds(302, 6, 61, 16);
		panel.add(lblRegistro);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(263, 28, 257, 294);
		panel.add(textArea);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(380, 328, 117, 34);
		panel.add(btnBorrar);
		
		JButton volumenMas = new JButton("+");
		volumenMas.setBounds(127, 334, 117, 29);
		panel.add(volumenMas);
		volumenMas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valueolddeerrrr= progressBar.getValue();
				if (volumenMas.isSelected()) {
					valueolddeerrrr+=lvldos;
				} else {
					valueolddeerrrr+=lvldos;
				}
				progressBar.setValue(valueolddeerrrr);
				
			}
				
				
				
			
			
		});
	}
}
