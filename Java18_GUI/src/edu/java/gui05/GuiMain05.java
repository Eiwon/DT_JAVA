package edu.java.gui05;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextArea;
import java.awt.Font;

public class GuiMain05 {

	private JFrame frame;
	JTextArea textArea;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain05 window = new GuiMain05();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GuiMain05() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		textArea = new JTextArea();
		frame.getContentPane().add(textArea);
		
		JRadioButton rdbtnAgree = new JRadioButton("동의");
		rdbtnAgree.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(rdbtnAgree.getText());
			}
		});
		rdbtnAgree.setSelected(true);
		buttonGroup.add(rdbtnAgree);
		rdbtnAgree.setBounds(8, 6, 158, 77);
		frame.getContentPane().add(rdbtnAgree);
		
		
		JRadioButton rdbtnReject = new JRadioButton("거절");
		rdbtnReject.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setText(rdbtnReject.getText());
			}
		});
		buttonGroup.add(rdbtnReject);
		rdbtnReject.setBounds(170, 6, 168, 77);
		frame.getContentPane().add(rdbtnReject);
		
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 85));
		textArea.setBounds(12, 105, 330, 123);
		
	}
}
