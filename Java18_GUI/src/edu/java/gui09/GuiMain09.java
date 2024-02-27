package edu.java.gui09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain09 {

	private JFrame frame;
	private JButton btnOutput;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain09 window = new GuiMain09();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiMain09() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 635, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JCheckBox chckbxMusic = new JCheckBox("음악");
		chckbxMusic.setBounds(8, 6, 89, 35);
		frame.getContentPane().add(chckbxMusic);
		
		JCheckBox chckbxMovie = new JCheckBox("영화");
		chckbxMovie.setBounds(101, 9, 89, 29);
		frame.getContentPane().add(chckbxMovie);
		
		JCheckBox chckbxReading = new JCheckBox("독서");
		chckbxReading.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxReading.isSelected())
					btnOutput.setEnabled(true);
				else btnOutput.setEnabled(false);
			}
		});
		chckbxReading.setBounds(194, 6, 89, 35);
		frame.getContentPane().add(chckbxReading);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(18, 47, 573, 356);
		frame.getContentPane().add(textArea);
		
		btnOutput = new JButton("출력");
		btnOutput.setEnabled(false);
		btnOutput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = "음악 : " + chckbxMusic.isSelected() + "\n"
						+ "영화 : " + chckbxMovie.isSelected() + "\n"
						+ "독서 : " + chckbxReading.isSelected() + "\n";
				textArea.setText(result);
			}
		});
		btnOutput.setBounds(476, 12, 97, 23);
		frame.getContentPane().add(btnOutput);
	}
}
