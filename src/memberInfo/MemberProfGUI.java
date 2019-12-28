package memberInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollBar;
import java.time.LocalDate;
import java.time.LocalTime;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.AdjustmentListener;
import java.awt.event.AdjustmentEvent;

public class MemberProfGUI extends JFrame implements Runnable {
  	private JPanel contentPane;
	private JLabel lblTime;
	public Thread x = new Thread(this);
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MemberProfGUI frame = new MemberProfGUI();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public MemberProfGUI() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(27, 40, 1086, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblName = new JLabel("    Name                           :");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName.setBounds(10, 11, 289, 35);
		panel.add(lblName);
		
		JLabel lblUserName = new JLabel("    User Name                   :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserName.setBounds(10, 54, 289, 35);
		panel.add(lblUserName);
		
		JLabel lblHostelmassName = new JLabel("    Hostel/Mass Name      :");
		lblHostelmassName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHostelmassName.setBounds(10, 100, 289, 35);
		panel.add(lblHostelmassName);
		
		JLabel lblName_1 = new JLabel("    Seat/Room no              :");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_1.setBounds(10, 154, 289, 35);
		panel.add(lblName_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(309, 11, 655, 35);
		panel.add(lblNewLabel_1);
		
		JLabel label = new JLabel("New label");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(309, 54, 655, 35);
		panel.add(label);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(309, 100, 655, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setBounds(309, 146, 655, 35);
		panel.add(label_2);
		
		lblTime = new JLabel("Time");
		lblTime.setBounds(333, 251, 419, 36);
		lblTime.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTime);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(27, 300, 1086, 200);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrentmonth = new JLabel("  Current_Month          :");
		lblCurrentmonth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentmonth.setBounds(20, 36, 268, 35);
		panel_1.add(lblCurrentmonth);
		
		JLabel lblRent = new JLabel(" Rent                             :");
		lblRent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRent.setBounds(23, 74, 265, 35);
		panel_1.add(lblRent);
		
		JLabel lblWaterbill = new JLabel(" Water Bill                      :");
		lblWaterbill.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWaterbill.setBounds(20, 114, 268, 35);
		panel_1.add(lblWaterbill);
		
		JLabel lblElectricityBill = new JLabel("   Electricity Bill                 :");
		lblElectricityBill.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElectricityBill.setBounds(10, 151, 278, 35);
		panel_1.add(lblElectricityBill);
		
		JLabel lblHousekeeperCharge = new JLabel("   HouseKeeper Charge    :");
		lblHousekeeperCharge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHousekeeperCharge.setBounds(10, 197, 219, 35);
		panel_1.add(lblHousekeeperCharge);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(317, 36, 620, 35);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(317, 76, 620, 35);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("New label");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(317, 116, 620, 35);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("New label");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_6.setBounds(317, 151, 620, 35);
		panel_1.add(label_6);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(27, 558, 1086, 237);
		contentPane.add(panel_2);
		
		JLabel lblMealRemain = new JLabel("    Meal Remain                 :");
		lblMealRemain.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMealRemain.setBounds(10, 56, 249, 35);
		panel_2.add(lblMealRemain);
		
		JLabel lblMealOrdered = new JLabel("    Meal Ordered                :");
		lblMealOrdered.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMealOrdered.setBounds(10, 104, 249, 35);
		panel_2.add(lblMealOrdered);
		
		JLabel lblMealTaken = new JLabel("   Meal taken                      :");
		lblMealTaken.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMealTaken.setBounds(10, 150, 249, 35);
		panel_2.add(lblMealTaken);
		
		JLabel lblNewLabel = new JLabel("                           Meal per Month Info");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(235, 11, 389, 35);
		panel_2.add(lblNewLabel);
		
		JLabel label_7 = new JLabel("New label");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_7.setBounds(325, 56, 478, 35);
		panel_2.add(label_7);
		
		JLabel label_8 = new JLabel("New label");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_8.setBounds(325, 102, 478, 35);
		panel_2.add(label_8);
		
		JLabel label_9 = new JLabel("New label");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_9.setBounds(325, 148, 478, 35);
		panel_2.add(label_9);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 851);
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.addAdjustmentListener(new AdjustmentListener() {
			public void adjustmentValueChanged(AdjustmentEvent arg0) {
				
			}
		});
		scrollBar.setBounds(1123, 0, 17, 584);
		contentPane.add(scrollBar);
		scrollBar.setUnitIncrement(5);
		setVisible(true);
		x.start();
	}
	public void run(){
		do {
			
			lblTime.setText("Date : "+ LocalDate.now()+"           "+LocalTime.now());
		}
		while(x.isAlive());

	}
}
