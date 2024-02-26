package edu.java.gui07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuiMain07 {

	private JFrame frame;

	private static final String[] STRINGS = {
		"1. 김근수", "2. 김시훈", "3. 김주영",
		"4. 노성욱", "5. 박정민", "6. 신중비",
		"7. 양준혁", "8. 우제영", "9. 위승혁",
		"10. 이현우", "11. 조현", "12. 최정현",
		"13. 홍지안", "14. 김한빈", "15. 정의원",
		"16. 임창준", "17. 민예인", "18. 박혜준",
		"19. 권보성"
	};
	private int index = 0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiMain07 window = new GuiMain07();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public GuiMain07() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 687, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOutput = new JLabel();
		lblOutput.setText(STRINGS[index]);
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setFont(new Font("굴림", Font.BOLD, 46));
		lblOutput.setBounds(12, 10, 647, 271);
		frame.getContentPane().add(lblOutput);
		
		JButton btnPrev = new JButton("이전");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index--;
				if(index < 0) {
					index = STRINGS.length - 1;
				}
				lblOutput.setText(STRINGS[index]);
			}
		});
		
		btnPrev.setFont(new Font("굴림", Font.PLAIN, 36));
		btnPrev.setBounds(12, 291, 318, 288);
		frame.getContentPane().add(btnPrev);
		
		JButton btnNext = new JButton("다음");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				index++;
				if(index == STRINGS.length) {
					index = 0;
				}
				lblOutput.setText(STRINGS[index]);
			}
		});
		btnNext.setFont(new Font("굴림", Font.PLAIN, 36));
		btnNext.setBounds(342, 293, 317, 286);
		frame.getContentPane().add(btnNext);
	}

}
