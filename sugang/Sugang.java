package sugang;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.Cursor;

public class Sugang {
	
	private JFrame frame;
	private JPasswordField passwordField;
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
					Sugang window = new Sugang();
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
	public Sugang() {
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
		lblNewLabel.setIcon(new ImageIcon("C:\\Java\\eclipse-workspace\\myJava\\sugang\\그림1.png"));
		lblNewLabel.setBounds(0, -160, 1980, 1446);
		frame.getContentPane().add(lblNewLabel);
		
		JButton bt;
		
		bt = new JButton(new ImageIcon("C:\\Java\\eclipse-workspace\\myJava\\sugang\\그림6.png"));
		bt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bt.setBounds(731, 707, 347, 100);
 
        bt.setBorderPainted(false);
        bt.setFocusPainted(false);
        bt.setContentAreaFilled(false);
        layeredPane.add(bt);
        
        JButton SIGNUPButton = new JButton("회원가입");
        SIGNUPButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        SIGNUPButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		try {
        			Hoiwon w = new Hoiwon();
					w.getFrame().setVisible(true);
				} catch (Exception err) {
					err.printStackTrace();
				}frame.dispose();
        	}
        });
        SIGNUPButton.setFont(new Font("굴림", Font.BOLD, 16));
        SIGNUPButton.setBounds(624, 649, 168, 33);
        layeredPane.add(SIGNUPButton);
        SIGNUPButton.setBorderPainted(false);
        SIGNUPButton.setFocusPainted(false);
        SIGNUPButton.setContentAreaFilled(false);
        
        
        JButton btnNewButton_1 = new JButton("비밀번호 찾기");
        btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
        			PWFind w = new PWFind();
					w.getFrame().setVisible(true);
				} catch (Exception err) {
					err.printStackTrace();
				}frame.dispose();
        	}
        });
        	
        
        btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 16));
        btnNewButton_1.setBounds(982, 649, 168, 33);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setFocusPainted(false);
        btnNewButton_1.setContentAreaFilled(false);
        layeredPane.add(btnNewButton_1);
        
        JFormattedTextField formattedTextField = new JFormattedTextField();
        formattedTextField.setFont(new Font("굴림", Font.PLAIN, 36));
        formattedTextField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        formattedTextField.setOpaque(false);
        formattedTextField.setBounds(687, 392, 412, 86);
        layeredPane.add(formattedTextField);
        
        passwordField = new JPasswordField();
        passwordField.setBorder(javax.swing.BorderFactory.createEmptyBorder());
        passwordField.setOpaque(false);
        passwordField.setBounds(687, 548, 412, 86);
        passwordField.setFont(new Font("굴림", Font.PLAIN, 36));
        layeredPane.add(passwordField);
	}
}
