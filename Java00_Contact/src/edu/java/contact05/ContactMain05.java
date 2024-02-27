package edu.java.contact05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.event.MouseInputAdapter;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ContactMain05 {

	private JFrame frame;
	private JTextField textName;
	private JTextField textPhone;
	private JTextField textEmail;
	private JTextField textIndex;
	private JScrollPane scrollPane;
	private JTextArea textAreaInfo;
	private JTextArea textAreaLog;
	private JScrollPane scrollPane_1;
	private JTable table;
	
	public static ContactDAO dao;
	
	
	public static void main(String[] args) {
		dao = ContactDAOImple.getInstance();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain05 window = new ContactMain05();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public ContactMain05() {
		initialize();
		printScroll(dao.selectAll());
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 952, 823);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("연락처 프로그램 Version 0.5");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(12, 10, 631, 97);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblName = new JLabel("이름");
		lblName.setFont(new Font("굴림", Font.PLAIN, 25));
		lblName.setBounds(12, 117, 234, 76);
		frame.getContentPane().add(lblName);
		
		JLabel lblPhone = new JLabel("전화번호");
		lblPhone.setFont(new Font("굴림", Font.PLAIN, 25));
		lblPhone.setBounds(12, 203, 234, 76);
		frame.getContentPane().add(lblPhone);
		
		JLabel lblEmail = new JLabel("이메일");
		lblEmail.setFont(new Font("굴림", Font.PLAIN, 25));
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setBounds(12, 294, 234, 76);
		frame.getContentPane().add(lblEmail);
		
		textName = new JTextField();
		textName.setFont(new Font("굴림", Font.PLAIN, 25));
		textName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textName.setText(null);
			}
		});
		textName.setBounds(258, 117, 325, 76);
		frame.getContentPane().add(textName);
		textName.setColumns(10);
		
		textPhone = new JTextField();
		textPhone.setFont(new Font("굴림", Font.PLAIN, 25));
		textPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textPhone.setText(null);
			}
		});
		textPhone.setColumns(10);
		textPhone.setBounds(258, 203, 325, 76);
		frame.getContentPane().add(textPhone);
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("굴림", Font.PLAIN, 25));
		textEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textEmail.setText(null);
			}
		});
		textEmail.setColumns(10);
		textEmail.setBounds(258, 294, 325, 76);
		frame.getContentPane().add(textEmail);
		
		JButton btnInsert = new JButton("등록");
		btnInsert.setFont(new Font("굴림", Font.PLAIN, 25));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertContact();
				textName.setText(null);
				textPhone.setText(null);
				textEmail.setText(null);
			}
		});
		btnInsert.setBounds(22, 380, 134, 51);
		frame.getContentPane().add(btnInsert);
		
		JButton btnSearch = new JButton("검색");
		btnSearch.setFont(new Font("굴림", Font.PLAIN, 25));
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectByIndex();
			}
		});
		btnSearch.setBounds(374, 380, 134, 51);
		frame.getContentPane().add(btnSearch);
		
		JButton btnUpdate = new JButton("수정");
		btnUpdate.setFont(new Font("굴림", Font.PLAIN, 25));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateContact();
			}
		});
		btnUpdate.setBounds(22, 452, 134, 51);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.setFont(new Font("굴림", Font.PLAIN, 25));
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				deleteContact();
			}
		});
		btnDelete.setBounds(195, 452, 134, 51);
		frame.getContentPane().add(btnDelete);
		
		JButton btnAllSearch = new JButton("전체검색");
		btnAllSearch.setFont(new Font("굴림", Font.PLAIN, 25));
		btnAllSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selectAll();
			}
		});
		btnAllSearch.setBounds(374, 452, 134, 51);
		frame.getContentPane().add(btnAllSearch);
		
		textIndex = new JTextField();
		textIndex.setFont(new Font("굴림", Font.PLAIN, 20));
		textIndex.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				textIndex.setText(null);
			}
		});
		textIndex.setText("번호 입력");
		textIndex.setBounds(195, 380, 134, 51);
		frame.getContentPane().add(textIndex);
		textIndex.setColumns(10);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 511, 565, 123);
		frame.getContentPane().add(scrollPane);
		
		textAreaInfo = new JTextArea();
		textAreaInfo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(textAreaInfo);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(605, 368, 319, 354);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(22, 644, 565, 76);
		frame.getContentPane().add(scrollPane_2);
		
		textAreaLog = new JTextArea();
		textAreaLog.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane_2.setViewportView(textAreaLog);
		
	}
	
	private void insertContact() {
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		
		if(name.length() * phone.length() * email.length() == 0) {
			textAreaLog.append("이름, 전화번호, 이메일 모두 입력 필요\n");
			System.out.println("이름, 전화번호, 이메일 모두 입력 필요");
			return;
		}
			
		int result = dao.insert(new ContactVO(name, phone, email));
		
		if(result == 1) {
			textAreaLog.append("등록된 연락처 개수 : " + dao.getContactNum() + "\n" + "연락처 등록 완료! \n");
			System.out.println("연락처 등록 성공");
		}else {
			textAreaLog.append("연락처 등록 실패\n");
			System.out.println("연락처 등록 실패");
		}
		
		printScroll(dao.selectAll());
			
	} // end insertContact
	
	private void selectAll() {
		ArrayList<ContactVO> list = dao.selectAll();
		textAreaInfo.setText("연락처 개수 : " + list.size() + "\n");
		
		for(int i = 0; i < list.size(); i++) {
			textAreaInfo.append("----------------연락처 " + i + "--------------\n");
			textAreaInfo.append(list.get(i).toString() + "\n");
		}
		printScroll(list);
		
	} // end selectAll
	
	private void selectByIndex() {
		int index = getIdxToInt();
		if(index == -1)
			return;
		
		ContactVO contact = dao.selectByIndex(index);
		textAreaInfo.setText(contact.toString());
		
		return;
		
	} // end selectByIndex
	
private void updateContact() {
		int index = getIdxToInt();
		if(index == -1)
			return;
		
		String name = textName.getText();
		String phone = textPhone.getText();
		String email = textEmail.getText();
		if(name.length() * phone.length() * email.length() == 0) {
			textAreaLog.append("이름, 전화번호, 이메일 모두 입력 필요\n");
			System.out.println("이름, 전화번호, 이메일 모두 입력 필요");
			return;
		}
		ContactVO vo = new ContactVO(name, phone, email);
		
		int result = dao.update(index, vo);
		
		if(result == 1) {
			textAreaLog.append("연락처 수정 성공\n");
			System.out.println("연락처 수정 성공");
		}else {
			textAreaLog.append("연락처 수정 실패\n");
			System.out.println("연락처 수정 실패");
		}
		
		printScroll(dao.selectAll());
		textAreaInfo.setText(vo.toString());
		
	} // end updateContact


	private void deleteContact() {
		int index = getIdxToInt();
		
		if(index == -1) {
			return;
		}
	
		int result = dao.delete(index);
		
		if(result == 1) {
			textAreaLog.append("연락처 삭제 완료!\n");
			System.out.println("연락처 삭제 완료!");
			printScroll(dao.selectAll());
		}else {
			textAreaLog.append("삭제에 실패했습니다.\n");
			System.err.println("삭제에 실패했습니다.");
		}
	} // end deleteContact

	private void printScroll(ArrayList<ContactVO> list) {
		
		String[][] arr = new String[list.size()][4];
		
		for(int i = 0 ; i < list.size(); i++) {
			arr[i][0] = String.valueOf(i);
			arr[i][1] = list.get(i).getName();
			arr[i][2] = list.get(i).getPhone();
			arr[i][3] = list.get(i).getEmail();
		}
		
		table = new JTable(new DefaultTableModel(arr, new String[] {"No", "이름", "전화번호", "이메일"}));
		table.setCellSelectionEnabled(true);
		
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int x = table.rowAtPoint(e.getPoint());
				int y = table.columnAtPoint(e.getPoint());
				String pick = table.getValueAt(x, y).toString();
				textAreaLog.append(pick);
				
				switch (y) {
				case 0: textIndex.setText(pick);
					break;
				case 1 : textName.setText(pick);
					break;
				case 2 : textPhone.setText(pick);
					break;
				case 3 : textEmail.setText(pick);
					break;
				default:
					break;
				}
			}
		});
		
		scrollPane_1.setViewportView(table);
	}

	private int getIdxToInt() {
		int index;
		
		try {
			index = Integer.parseInt(textIndex.getText());
		} catch(Exception e){
			textAreaLog.append("잘못된 입력입니다.\n");
			System.out.println("잘못된 입력입니다.");
			return -1;
		} finally {
			textIndex.setText(null);
		}
		
		if(index < 0 || index >= dao.getContactNum()) {
			textAreaLog.append("잘못된 인덱스입니다.\n");
			System.out.println("잘못된 인덱스입니다.");
			return -1;
		}
		
		return index;
	}
}
