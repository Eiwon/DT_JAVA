package edu.java.gui04;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GuiMain04 {

   private JFrame frame;
   private JTextField textNumber1;
   private JTextField textNumber2;
   private JTextArea textArea;

   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               GuiMain04 window = new GuiMain04();
               window.frame.setVisible(true);
            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });
   }

   public GuiMain04() {
      initialize();
   }

   private void initialize() {
      frame = new JFrame();
      frame.setBounds(100, 100, 700, 550);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().setLayout(null);

      Font frameFont = new Font("굴림", Font.BOLD | Font.ITALIC, 48);
      JLabel lblNumber1 = new JLabel("Number 1");
      lblNumber1.setBounds(12, 10, 280, 70);
      lblNumber1.setFont(frameFont);
      frame.getContentPane().add(lblNumber1);

      JLabel lblNumber2 = new JLabel("Number 2");
      lblNumber2.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
      lblNumber2.setBounds(12, 90, 280, 70);
      frame.getContentPane().add(lblNumber2);

      textNumber1 = new JTextField();
      textNumber1.setBounds(304, 10, 368, 70);
      textNumber1.setFont(frameFont);
      frame.getContentPane().add(textNumber1);
      textNumber1.setColumns(10);

      textNumber2 = new JTextField();
      textNumber2.setColumns(10);
      textNumber2.setFont(frameFont);
      textNumber2.setBounds(304, 90, 368, 70);
      frame.getContentPane().add(textNumber2);

      JButton btnPlus = new JButton("+");
      btnPlus.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		System.out.println("btnPlus : mouseClicked()");
      		double t1 = Double.parseDouble(textNumber1.getText());
      		double t2 = Double.parseDouble(textNumber2.getText());
      		double res = t1 + t2;
      		textArea.append(t1 + " + " + t2 + " = " + res + "\n");
      	}
      });
      
      
      btnPlus.setBounds(12, 170, 100, 100);
      btnPlus.setFont(frameFont);
      frame.getContentPane().add(btnPlus);

      JButton btnMinus = new JButton("-");
      btnMinus.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("btnMinus : actionPerformed()");
			
			double t1 = Double.parseDouble(textNumber1.getText());
      		double t2 = Double.parseDouble(textNumber2.getText());
      		double res = t1 - t2;
      		textArea.append(t1 + " - " + t2 + " = " + res + "\n");
			
		}
	});
      
      btnMinus.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
      btnMinus.setBounds(192, 170, 100, 100);
      frame.getContentPane().add(btnMinus);

      JButton btnMultiple = new JButton("*");
      btnMultiple.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		System.out.println("btnMultiple : keyPressed()");
      		
      		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
      			double t1 = Double.parseDouble(textNumber1.getText());
      			double t2 = Double.parseDouble(textNumber2.getText());
      			double res = t1 * t2;
      			textArea.append(t1 + " * " + t2 + " = " + res + "\n");
      		}
      	}
      });
      
      
      btnMultiple.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
      btnMultiple.setBounds(386, 170, 100, 100);
      frame.getContentPane().add(btnMultiple);

      JButton btnDivide = new JButton("/");
      btnDivide.addKeyListener(new KeyAdapter() {
      	@Override
      	public void keyPressed(KeyEvent e) {
      		System.out.println("btnDivide : keyPressed()");
      		double t1 = Double.parseDouble(textNumber1.getText());
  			double t2 = Double.parseDouble(textNumber2.getText());
  			double res = t1 / t2;
  			textArea.append(t1 + " / " + t2 + " = " + res + "\n");
      	}
      });
      btnDivide.addMouseListener(new MouseAdapter() {
      	@Override
      	public void mouseClicked(MouseEvent e) {
      		System.out.println("btnDivide : mouseClicked()");
      		double t1 = Double.parseDouble(textNumber1.getText());
  			double t2 = Double.parseDouble(textNumber2.getText());
  			double res = t1 / t2;
  			textArea.append(t1 + " / " + t2 + " = " + res + "\n");
      	}
      });
      
      
      
      btnDivide.setFont(new Font("굴림", Font.BOLD | Font.ITALIC, 48));
      btnDivide.setBounds(572, 170, 100, 100);
      frame.getContentPane().add(btnDivide);

      JScrollPane scrollPane = new JScrollPane();
      scrollPane.setBounds(12, 280, 660, 221);
      frame.getContentPane().add(scrollPane);

      textArea = new JTextArea();
      textArea.setFont(new Font("Monospaced", Font.PLAIN, 48));
      textArea.setEditable(false);
      scrollPane.setViewportView(textArea);

   }
}