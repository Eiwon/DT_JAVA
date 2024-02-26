package edu.java.gui03;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class GuiMain03 {

	public JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textContact;
	private JButton btnPrint;
	private JTextArea textArea;
	
	int lblWidth = 250, lblHeight = 100;
	Font lblFont = new Font("나눔고딕", Font.PLAIN, 45);
	private JScrollPane scrollPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain03 window = new GuiMain03();
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
	public GuiMain03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 540, 797);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("이름");
		lblName.setOpaque(true);
		lblName.setBackground(Color.PINK);
		lblName.setFont(lblFont);
		lblName.setHorizontalAlignment(SwingConstants.CENTER);
		lblName.setForeground(Color.BLACK);
		lblName.setBounds(10, 10, lblWidth, lblHeight);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setBackground(Color.ORANGE);
		lblPhone.setOpaque(true);
		lblPhone.setFont(lblFont);
		lblPhone.setHorizontalAlignment(SwingConstants.CENTER);
		lblPhone.setForeground(Color.BLACK);
		lblPhone.setBounds(10, 120, lblWidth, lblHeight);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setOpaque(true);
		lblEmail.setBackground(Color.CYAN);
		lblEmail.setFont(lblFont);
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(10, 230, lblWidth, lblHeight);
		frame.getContentPane().add(lblEmail);
		
		textName = new JTextField();
		textName.setFont(lblFont);
		textName.setHorizontalAlignment(SwingConstants.CENTER);
		textName.setBounds(270, 10, lblWidth, lblHeight);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(lblFont);
		textPhone.setHorizontalAlignment(SwingConstants.CENTER);
		textPhone.setBounds(270, 120, lblWidth, lblHeight);
		frame.getContentPane().add(textPhone);
		textPhone.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setFont(lblFont);
		textEmail.setHorizontalAlignment(SwingConstants.CENTER);
		textEmail.setBounds(270, 230, lblWidth, lblHeight);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		textContact = new JTextField();
		textContact.setFont(lblFont);
		textContact.setHorizontalAlignment(SwingConstants.CENTER);
		textContact.setBounds(10, 436, 502, 100);
		frame.getContentPane().add(textContact);
		textContact.setColumns(10);
		
		btnPrint = new JButton("정보 출력");
		btnPrint.setFont(lblFont);
		btnPrint.setBounds(10, 340, 502, 86);
		frame.getContentPane().add(btnPrint);
		btnPrint.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String info = "이름 : " + textName.getText() + " \n전화번호 : " + 
						textPhone.getText() + " \n이메일 : " + textEmail.getText() + "\n";
				textContact.setText(info);
				textArea.append(info); // 문자열 연결해서 출력
			}
		});
		
		scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 546, 502, 202);
		frame.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
		
	}
}
