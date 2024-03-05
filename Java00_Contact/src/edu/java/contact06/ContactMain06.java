package edu.java.contact06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ContactMain06 {

	private JFrame frame;
	private JTextField txtName;
	private JTextField txtPhone;
	private JTextField txtEmail;
	private JTextField textIndex;
	private JScrollPane scrollPane;
	private JTextArea txtAreaInfo;
	private JTextArea txtAreaLog;
	private JScrollPane scrollPane_1;
	private JTable table;
	private DefaultTableModel tableModel;
	private static final String[] tableCol = {"No", "이름", "전화번호", "이메일"};
	private Object[] record = new Object[tableCol.length];
	
	private static ContactDAO dao;
	
	public static void main(String[] args) {
		dao = ContactDAOImple.getInstance();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactMain06 window = new ContactMain06();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ContactMain06() {
		initialize();
	}

	@SuppressWarnings("serial")
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 952, 823);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("연락처 프로그램 Version 0.6");
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
		
		txtName = new JTextField();
		txtName.setFont(new Font("굴림", Font.PLAIN, 25));
		txtName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtName.setText(null);
			}
		});
		txtName.setBounds(258, 117, 325, 76);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtPhone = new JTextField();
		txtPhone.setFont(new Font("굴림", Font.PLAIN, 25));
		txtPhone.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtPhone.setText(null);
			}
		});
		txtPhone.setColumns(10);
		txtPhone.setBounds(258, 203, 325, 76);
		frame.getContentPane().add(txtPhone);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("굴림", Font.PLAIN, 25));
		txtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				txtEmail.setText(null);
			}
		});
		txtEmail.setColumns(10);
		txtEmail.setBounds(258, 294, 325, 76);
		frame.getContentPane().add(txtEmail);
		
		JButton btnInsert = new JButton("등록");
		btnInsert.setFont(new Font("굴림", Font.PLAIN, 25));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				insertContact();
				txtName.setText(null);
				txtPhone.setText(null);
				txtEmail.setText(null);
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
		
		txtAreaInfo = new JTextArea();
		txtAreaInfo.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane.setViewportView(txtAreaInfo);
		
		scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(605, 368, 319, 354);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(22, 644, 565, 76);
		frame.getContentPane().add(scrollPane_2);
		
		txtAreaLog = new JTextArea();
		txtAreaLog.setFont(new Font("Monospaced", Font.PLAIN, 20));
		scrollPane_2.setViewportView(txtAreaLog);
		
		tableModel = new DefaultTableModel(tableCol, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(tableModel);
		table.setCellSelectionEnabled(true);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int col = table.getSelectedColumn();
				
				Object value = table.getValueAt(row, col);
				txtAreaLog.append(value.toString());
				
				switch (col) {
				case 0: textIndex.setText(value.toString());
					break;
				case 1 : txtName.setText(value.toString());
					break;
				case 2 : txtPhone.setText(value.toString());
					break;
				case 3 : txtEmail.setText(value.toString());
					break;
				default:
					break;
				}
			}
		});
		scrollPane_1.setViewportView(table);
	}
	
	private void insertContact() {
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		
		if(name.length() * phone.length() * email.length() == 0) {
			txtAreaLog.append("이름, 전화번호, 이메일 모두 입력 필요\n");
			System.out.println("이름, 전화번호, 이메일 모두 입력 필요");
			return;
		}
			
		int result = dao.insert(new ContactVO(name, phone, email));
		ArrayList<ContactVO> list = dao.selectAll();
		
		if(result == 1) {
			printTable(list);
			txtAreaLog.append("등록된 연락처 개수 : " + list.size() + "\n" + "연락처 등록 완료! \n");
			System.out.println("연락처 등록 성공");
		}else {
			txtAreaLog.append("연락처 등록 실패\n");
			System.out.println("연락처 등록 실패");
		}
	} // end insertContact
	
	private void selectAll() {
		ArrayList<ContactVO> list = dao.selectAll();
		txtAreaInfo.setText("연락처 개수 : " + list.size() + "\n");
		StringBuffer buffer = new StringBuffer();
		
		for(int i = 0; i < list.size(); i++) {
			buffer.append("----------------연락처 " + list.get(i).getContactId() + "--------------\n" + list.get(i).toString() + "\n");
		}
		txtAreaInfo.append(buffer.toString());
		
		printTable(list);
		
	} // end selectAll
	
	private void selectByIndex() {
		int index = getIdxToInt();
		if(index == -1)
			return;
		
		ContactVO contact = dao.selectByIndex(index);
		txtAreaInfo.setText(contact.toString());
		
		return;
	} // end selectByIndex
	
	private void updateContact() {
		int index = getIdxToInt();
		if(index == -1)
			return;
		
		String name = txtName.getText();
		String phone = txtPhone.getText();
		String email = txtEmail.getText();
		if(name.length() * phone.length() * email.length() == 0) {
			txtAreaLog.append("이름, 전화번호, 이메일 모두 입력 필요\n");
			System.out.println("이름, 전화번호, 이메일 모두 입력 필요");
			return;
		}
		ContactVO vo = new ContactVO(name, phone, email);
		
		int result = dao.update(index, vo);
		
		if(result == 1) {
			txtAreaLog.append("연락처 수정 성공\n");
			System.out.println("연락처 수정 성공");
		}else {
			txtAreaLog.append("연락처 수정 실패\n");
			System.out.println("연락처 수정 실패");
		}
		
		printTable(dao.selectAll());
		txtAreaInfo.setText(vo.toString());
		
	} // end updateContact

	private void deleteContact() {
		int index = getIdxToInt();
		
		if(index == -1) {
			return;
		}
	
		int result = dao.delete(index);
		
		if(result == 1) {
			txtAreaLog.append("연락처 삭제 완료!\n");
			System.out.println("연락처 삭제 완료!");
			printTable(dao.selectAll());
		}else {
			txtAreaLog.append("삭제에 실패했습니다.\n");
			System.err.println("삭제에 실패했습니다.");
		}
		
	} // end deleteContact

	private void printTable(ArrayList<ContactVO> list) {
		tableModel.setRowCount(0);
		
		for(int i = 0 ; i < list.size(); i++) {
			record[0] = list.get(i).getContactId();
			record[1] = list.get(i).getName();
			record[2] = list.get(i).getPhone();
			record[3] = list.get(i).getEmail();
			tableModel.addRow(record);
		}
		
	} // end printTable

	private int getIdxToInt() {
		int index;
		
		try {
			index = Integer.parseInt(textIndex.getText());
		} catch(Exception e){
			txtAreaLog.append("잘못된 입력입니다.\n");
			System.out.println("잘못된 입력입니다.");
			return -1;
		} finally {
			textIndex.setText(null);
		}
		
		if(index < 0 || index >= ((ContactDAOImple) dao).getContactNum()) {
			txtAreaLog.append("잘못된 인덱스입니다.\n");
			System.out.println("잘못된 인덱스입니다.");
			return -1;
		}
		
		return index;
	} // end getIdxToInt
}
