package edu.java.gui10;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class GuiMain10 {

	private JFrame frame;
	private JMenu mnFile;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain10 window = new GuiMain10();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiMain10() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 23);
		frame.getContentPane().add(menuBar);
		
		mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mntmOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JFileChooser : 파일을 선택할 수 있는 팝업창
				JFileChooser chooser = new JFileChooser();
				int result = chooser.showOpenDialog(null);
				if(result == JFileChooser.APPROVE_OPTION) { // 확인 버튼 클릭시
					System.out.println("파일 선택");
					File selected = chooser.getSelectedFile();
					System.out.println(selected.getAbsolutePath());
				}else { // 취소 버튼 클릭시
					System.out.println("취소");
				}
			}
		});
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JSeparator separator = new JSeparator();
		mnFile.add(separator);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// ConfirmDialog : 
				// Yes(확인) - No(아니오)  - Cancel(취소) 버튼을 갖는 다이얼로그
				int result = JOptionPane.showConfirmDialog(frame.getContentPane(), "종료하시겠습니까?"); 
				// 다이얼로그를 종속시킬(부모) 컴포넌트(해당 컴포넌트 중앙에 위치)
				System.out.println("선택 결과 : " + result);
				
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);
					// 프로그램 종료 : System.exit(0); 정상 종료
					// 				System.exit(0 이외의 숫자); 비정상 종료
				}else {
					System.out.println("취소");
				}
				
			}
		});
		mnFile.add(mntmExit);
		
		JMenu mnhelp = new JMenu("Help");
		menuBar.add(mnhelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 메시지와 OK 버튼만 있는 다이얼로그 : MessageDialog
				JOptionPane.showMessageDialog(frame.getContentPane(), "버전 1.0");
			}
		});
		mnhelp.add(mntmAbout);
	}
}
