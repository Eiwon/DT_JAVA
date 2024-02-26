package edu.java.gui08;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class GuiMain08 {

	private JFrame frame;
	private static final ImageIcon[] IMAGE_ICONS = {
			new ImageIcon("res" + File.separator + "dog1.jpg"),
			new ImageIcon("res" + File.separator + "dog2.jpg"),
			new ImageIcon("res" + File.separator + "dog3.jpg"),
			new ImageIcon("res" + File.separator + "dog4.jpg"),
	};
	private int index = 0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain08 window = new GuiMain08();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiMain08() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 687, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOutput = new JLabel();
		lblOutput.setIcon(IMAGE_ICONS[0]);
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("굴림", Font.BOLD, 46));
		lblOutput.setBounds(12, 10, 647, 271);
		frame.getContentPane().add(lblOutput);
		
		JButton btnPrev = new JButton("이전");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index--;
				if(index < 0) {
					index = IMAGE_ICONS.length - 1;
				}
				lblOutput.setIcon(IMAGE_ICONS[index]);
			}
		});
		
		btnPrev.setFont(new Font("굴림", Font.PLAIN, 36));
		btnPrev.setBounds(12, 291, 318, 288);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index++;
				if(index == IMAGE_ICONS.length) {
					index = 0;
				}
				lblOutput.setIcon(IMAGE_ICONS[index]);
			}
		});
		btnNext.setFont(new Font("굴림", Font.PLAIN, 36));
		btnNext.setBounds(342, 293, 317, 286);
		frame.getContentPane().add(btnNext);
		
		JButton btnNewButton = new JButton("랜덤");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double rx = Math.random();
				int x = (int)(IMAGE_ICONS.length * rx);
				lblOutput.setIcon(IMAGE_ICONS[x]);
			}
		});
		btnNewButton.setBounds(288, 281, 97, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
