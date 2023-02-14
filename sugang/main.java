package sugang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class main {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
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
	public main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel allPagePanel = new JPanel();
		allPagePanel.setBounds(0, 0, 1596, 871);
		frame.getContentPane().add(allPagePanel);
		allPagePanel.setLayout(null);
		
		JPanel cardAllPanel = new JPanel();
		cardAllPanel.setBackground(Color.CYAN);
		cardAllPanel.setBounds(0, 50, 1584, 48);
		allPagePanel.add(cardAllPanel);
		cardAllPanel.setLayout(null);
		
		JPanel topRadioPanel_1 = new JPanel();
		topRadioPanel_1.setBounds(11, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_1);
		topRadioPanel_1.setBackground(Color.BLUE);
		topRadioPanel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("강의시간표");
		btnNewButton.setBounds(0, 0, 310, 48);
		topRadioPanel_1.add(btnNewButton);
		
		JPanel topRadioPanel_2 = new JPanel();
		topRadioPanel_2.setBounds(323, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_2);
		topRadioPanel_2.setBackground(Color.GRAY);
		topRadioPanel_2.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("수강신청");
		topRadioPanel_2.add(btnNewButton_1, "name_277491997581399");
		
		JPanel topRadioPanel_3 = new JPanel();
		topRadioPanel_3.setBackground(Color.BLUE);
		topRadioPanel_3.setBounds(636, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_3);
		topRadioPanel_3.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("수강확정대기내역");
		topRadioPanel_3.add(btnNewButton_2, "name_277494022433299");
		
		JPanel topRadioPanel_4 = new JPanel();
		topRadioPanel_4.setBackground(Color.BLUE);
		topRadioPanel_4.setBounds(949, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_4);
		topRadioPanel_4.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("내정보/수정");
		topRadioPanel_4.add(btnNewButton_3, "name_277495782659800");
		
		JPanel topRadioPanel_5 = new JPanel();
		topRadioPanel_5.setBounds(1262, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_5);
		topRadioPanel_5.setBackground(Color.BLUE);
		topRadioPanel_5.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_4 = new JButton("로그아웃");
		topRadioPanel_5.add(btnNewButton_4, "name_277498214276400");
	}
}
