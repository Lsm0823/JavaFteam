package sugang;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;

public class Hoiwon {

	private JFrame frame;
	
	public JFrame getFrame() {
		return frame;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Hoiwon window = new Hoiwon();
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
	public Hoiwon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1800, 1000);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1800, 1000);
		layeredPane.setLayout(null);
		frame.getContentPane().add(layeredPane);
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Java\\eclipse-workspace\\myJava\\sugang\\그림10.png"));
		lblNewLabel.setBounds(0, -160, 1980, 1446);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bt;
		
		bt = new JButton(new ImageIcon("C:\\Java\\eclipse-workspace\\myJava\\sugang\\SIGNUP.png"));
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
        bt.setBounds(728, 806, 300, 70);
 
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setContentAreaFilled(false);
        layeredPane.add(bt);
		
        
        
        JFormattedTextField formattedTextField = new JFormattedTextField();
        formattedTextField.setFont(new Font("굴림", Font.PLAIN, 14));
        formattedTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        formattedTextField.setOpaque(false);
        formattedTextField.setBounds(650, 271, 412, 34);
        layeredPane.add(formattedTextField);
        
        JFormattedTextField formattedTextField2 = new JFormattedTextField();
        formattedTextField2.setFont(new Font("굴림", Font.PLAIN, 14));
        formattedTextField2.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        formattedTextField2.setOpaque(false);
        formattedTextField2.setBounds(650, 193, 412, 34);
        layeredPane.add(formattedTextField2);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        passwordField.setOpaque(false);
        passwordField.setBounds(650, 504, 412, 34);
        passwordField.setFont(new Font("굴림", Font.PLAIN, 14));
        layeredPane.add(passwordField);
        
        JPasswordField passwordField1 = new JPasswordField();
        passwordField1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        passwordField1.setOpaque(false);
        passwordField1.setBounds(650, 439, 412, 34);
        passwordField1.setFont(new Font("굴림", Font.PLAIN, 14));
        layeredPane.add(passwordField1);
        
        JComboBox comboBox = new JComboBox();
        //comboBox.BackColor = Color.Yellow;
        comboBox.setBackground(Color.GRAY);
        comboBox.setToolTipText("");
        comboBox.addItem("e-비즈니스");
        comboBox.addItem("컴퓨터 공학");
        comboBox.addItem("정보경영학");
        comboBox.addItem("산업ICT기술공학");
        comboBox.setBounds(640, 598, 491, 57);
        comboBox.setBorder(new EmptyBorder(0, 0, 0, 0));
        comboBox.setOpaque(false);
        layeredPane.add(comboBox);
        
        JLabel lblNewLabel_1 = new JLabel("이름");
        lblNewLabel_1.setFont(new Font("휴먼모음T", Font.BOLD, 20));
        lblNewLabel_1.setBounds(582, 195, 33, 25);
        layeredPane.add(lblNewLabel_1);
        
        
        JLabel lblNewLabel_1_1 = new JLabel("학번");
        lblNewLabel_1_1.setFont(new Font("휴먼모음T", Font.BOLD, 20));
        lblNewLabel_1_1.setBounds(582, 273, 33, 25);
        layeredPane.add(lblNewLabel_1_1);
        
        JLabel lblNewLabel_1_1_1 = new JLabel("비밀번호");
        lblNewLabel_1_1_1.setFont(new Font("휴먼모음T", Font.BOLD, 20));
        lblNewLabel_1_1_1.setBounds(548, 441, 67, 25);
        layeredPane.add(lblNewLabel_1_1_1);
        
        JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호 확인");
        lblNewLabel_1_1_1_1.setFont(new Font("휴먼모음T", Font.BOLD, 20));
        lblNewLabel_1_1_1_1.setBounds(504, 513, 124, 25);
        layeredPane.add(lblNewLabel_1_1_1_1);
        
        JLabel lblNewLabel_1_1_1_2 = new JLabel("전화번호");
        lblNewLabel_1_1_1_2.setFont(new Font("휴먼모음T", Font.BOLD, 20));
        lblNewLabel_1_1_1_2.setBounds(548, 705, 67, 25);
        layeredPane.add(lblNewLabel_1_1_1_2);
        
        JLabel lblNewLabel_1_1_2 = new JLabel("학과");
        lblNewLabel_1_1_2.setFont(new Font("휴먼모음T", Font.BOLD, 20));
        lblNewLabel_1_1_2.setBounds(582, 612, 33, 25);
        layeredPane.add(lblNewLabel_1_1_2);
        
        JButton btnNewButton = new JButton("비밀번호 찾기");
        btnNewButton.setFont(new Font("굴림", Font.BOLD, 16));
        btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
 
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			PWFind w = new PWFind();
					w.getFrame().setVisible(true);
				} catch (Exception err) {
					err.printStackTrace();
				}frame.dispose();
        	}
        });
        
        
        btnNewButton.setBounds(548, 827, 138, 23);
        layeredPane.add(btnNewButton);
        btnNewButton.setBorderPainted(false);
        btnNewButton.setFocusPainted(false);
        btnNewButton.setContentAreaFilled(false);
        
        JButton btnNewButton_1 = new JButton("로그인");
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 16));
        btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			Sugang w = new Sugang();
					w.getFrame().setVisible(true);
				} catch (Exception err) {
					err.printStackTrace();
					
				}frame.dispose();
        	}
        });
        btnNewButton_1.setBounds(1094, 827, 97, 23);
        layeredPane.add(btnNewButton_1);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setFocusPainted(false);
        btnNewButton_1.setContentAreaFilled(false);
        
        
	}
}
