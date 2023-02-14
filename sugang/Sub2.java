package sugang;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;

public class Sub2 {
	
	private JFrame frame;
	private JTable table;
	private JTable tb1;
	private JTable table_1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sub2 window = new Sub2();
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
	public Sub2() {
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
		topRadioPanel_1.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton = new JButton("강의시간표");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		topRadioPanel_1.add(btnNewButton, "name_277158566092900");
		
		JButton button = new JButton("New button");
		topRadioPanel_1.add(button, "name_281365249522899");
		
		JPanel topRadioPanel_2 = new JPanel();
		topRadioPanel_2.setBounds(323, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_2);
		topRadioPanel_2.setBackground(Color.GRAY);
		topRadioPanel_2.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_1 = new JButton("수강신청");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		topRadioPanel_2.add(btnNewButton_1, "name_277437554558200");
		
		JPanel topRadioPanel_3 = new JPanel();
		topRadioPanel_3.setBounds(636, 0, 310, 48);
		topRadioPanel_3.setBackground(Color.BLUE);
		cardAllPanel.add(topRadioPanel_3);
		topRadioPanel_3.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_2 = new JButton("수강확정대기내역");
		topRadioPanel_3.add(btnNewButton_2, "name_277469366700600");
		
		JPanel topRadioPanel_4 = new JPanel();
		topRadioPanel_4.setBounds(949, 0, 310, 48);
		topRadioPanel_4.setBackground(Color.BLUE);
		cardAllPanel.add(topRadioPanel_4);
		topRadioPanel_4.setLayout(new CardLayout(0, 0));
		
		JButton btnNewButton_3 = new JButton("내정보/수정");
		topRadioPanel_4.add(btnNewButton_3, "name_277473214836800");
		
		JPanel topRadioPanel_5 = new JPanel();
		topRadioPanel_5.setBounds(1262, 0, 310, 48);
		cardAllPanel.add(topRadioPanel_5);
		topRadioPanel_5.setLayout(null);
		topRadioPanel_5.setBackground(Color.BLUE);
		
		JButton btnNewButton_4 = new JButton("로그아웃");
		btnNewButton_4.setBounds(0, 0, 310, 48);
		topRadioPanel_5.add(btnNewButton_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 124, 1559, 668);
		allPagePanel.add(panel);
		panel.setLayout(null);
		
		JPanel sugangPanel = new JPanel();
		sugangPanel.setLayout(null);
		sugangPanel.setBackground(Color.YELLOW);
		sugangPanel.setBounds(0, 0, 1040, 469);
		panel.add(sugangPanel);
		
		JPanel bucketPanel = new JPanel();
		bucketPanel.setLayout(null);
		bucketPanel.setBackground(Color.PINK);
		bucketPanel.setBounds(0, 529, 1040, 139);
		panel.add(bucketPanel);
		
		JPanel timePanel = new JPanel();
		timePanel.setLayout(null);
		timePanel.setBackground(Color.ORANGE);
		timePanel.setBounds(1056, 0, 503, 667);
		panel.add(timePanel);
		
		table_1 = new JTable();
		table_1.setBounds(502, 668, -501, -667);
		timePanel.add(table_1);
		
		JLabel lblNewLabel = new JLabel("장바구니");
		lblNewLabel.setBounds(0, 495, 80, 24);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		

		
		String[] colNm01 = {

				"col1","col2","col3","col4","col5"
		};

// DATA Array 

		Object[][] data01 = {

				{"data1","data2","data3","data4","data5"},

				{"data1","data2","data3","data4","data5"},

				{"data1","data2","data3","data4","data5"},

				{"data1","data2","data3","data4","data5"},

				{"data1","data2","data3","data4","data5"},

				{"data1","data2","data3","data4","data5"}

		};

		JComboBox cb01 = new JComboBox();
		
		
		
		
		
	
		
	}
}
