package edu.java.gui11;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	JButton btnNewButton;
	public MyFrame() {
		
		// JFrame.EXIT_ON_CLOSE : 프로그램 전체 종료
		// JFrame.DISPOSE_ON_CLOSE : 현재 창만 종료
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 299);
		contentPane = new JPanel(); // frame.getContentPane()과 같은 역할
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("New button");
		btnNewButton.setBounds(78, 29, 249, 88);
		contentPane.add(btnNewButton);
	}

}
