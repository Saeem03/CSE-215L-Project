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
import javax.swing.JTextField;

public class MemberProfGUI extends JFrame implements Runnable {
  	private JPanel contentPane;
	private JLabel Time;
	public Thread x = new Thread(this);
	private JTextField txtField;
	private JTextField txtField_1;
	private JTextField txtField_2;
	private JTextField textField_3;
	private JTextField txtJanuary;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
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
		lblName.setBounds(88, 12, 289, 35);
		panel.add(lblName);
		
		JLabel lblUserName = new JLabel("    User Name                   :");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUserName.setBounds(88, 55, 289, 35);
		panel.add(lblUserName);
		
		JLabel lblHostelmassName = new JLabel("    Hostel/Mass Name      :");
		lblHostelmassName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHostelmassName.setBounds(88, 101, 289, 35);
		panel.add(lblHostelmassName);
		
		JLabel lblName_1 = new JLabel("    Seat/Room no             :");
		lblName_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblName_1.setBounds(88, 148, 289, 34);
		panel.add(lblName_1);
		
		txtField = new JTextField();
		txtField.setText("Saeem");
		txtField.setBounds(387, 12, 289, 38);
		panel.add(txtField);
		txtField.setColumns(10);
		
		txtField_1 = new JTextField();
		txtField_1.setText("Blackdot");
		txtField_1.setColumns(10);
		txtField_1.setBounds(387, 55, 289, 38);
		panel.add(txtField_1);
		
		txtField_2 = new JTextField();
		txtField_2.setText("Kings Kingdom");
		txtField_2.setColumns(10);
		txtField_2.setBounds(387, 100, 289, 38);
		panel.add(txtField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("21");
		textField_3.setColumns(10);
		textField_3.setBounds(387, 148, 289, 38);
		panel.add(textField_3);
		
		JLabel lblSaeem = new JLabel("Saeem");
		lblSaeem.setBounds(387, 12, 289, 35);
		panel.add(lblSaeem);
		
		JLabel label = new JLabel("Saeem");
		label.setBounds(387, 55, 289, 35);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Saeem");
		label_1.setBounds(387, 101, 289, 35);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Saeem");
		label_2.setBounds(387, 147, 289, 35);
		panel.add(label_2);
		
		Time = new JLabel("Time & Date :");
		Time.setBounds(333, 251, 419, 36);
		Time.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(Time);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(27, 300, 1086, 247);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCurrentmonth = new JLabel("  Current_Month          :");
		lblCurrentmonth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentmonth.setBounds(98, 36, 268, 35);
		panel_1.add(lblCurrentmonth);
		
		JLabel lblRent = new JLabel(" Rent                             :");
		lblRent.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRent.setBounds(101, 74, 265, 35);
		panel_1.add(lblRent);
		
		JLabel lblWaterbill = new JLabel(" Water Bill                      :");
		lblWaterbill.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblWaterbill.setBounds(98, 114, 268, 35);
		panel_1.add(lblWaterbill);
		
		JLabel lblElectricityBill = new JLabel("   Electricity Bill                 :");
		lblElectricityBill.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblElectricityBill.setBounds(88, 151, 278, 35);
		panel_1.add(lblElectricityBill);
		
		JLabel lblHousekeeperCharge = new JLabel("   HouseKeeper Charge   :");
		lblHousekeeperCharge.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblHousekeeperCharge.setBounds(88, 197, 278, 38);
		panel_1.add(lblHousekeeperCharge);
		
		JLabel lblDecember = new JLabel("December");
		lblDecember.setBounds(378, 35, 298, 39);
		panel_1.add(lblDecember);
		
		JLabel label_3 = new JLabel("9000");
		label_3.setBounds(378, 73, 298, 39);
		panel_1.add(label_3);
		
		JLabel label_4 = new JLabel("500");
		label_4.setBounds(378, 115, 298, 35);
		panel_1.add(label_4);
		
		JLabel label_5 = new JLabel("500");
		label_5.setBounds(378, 151, 298, 39);
		panel_1.add(label_5);
		
		JLabel label_6 = new JLabel("700");
		label_6.setBounds(378, 197, 298, 38);
		panel_1.add(label_6);
		
		txtJanuary = new JTextField();
		txtJanuary.setText("January");
		txtJanuary.setBounds(378, 35, 298, 39);
		panel_1.add(txtJanuary);
		txtJanuary.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setText("January");
		textField_4.setColumns(10);
		textField_4.setBounds(378, 73, 298, 39);
		panel_1.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("January");
		textField_5.setColumns(10);
		textField_5.setBounds(378, 115, 298, 39);
		panel_1.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("January");
		textField_6.setColumns(10);
		textField_6.setBounds(378, 151, 298, 39);
		panel_1.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("January");
		textField_7.setColumns(10);
		textField_7.setBounds(378, 196, 298, 39);
		panel_1.add(textField_7);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.LIGHT_GRAY);
		panel_2.setLayout(null);
		panel_2.setBounds(27, 575, 1086, 237);
		contentPane.add(panel_2);
		
		JLabel lblMealRemain = new JLabel("    Meal Remain                 :");
		lblMealRemain.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMealRemain.setBounds(90, 83, 249, 35);
		panel_2.add(lblMealRemain);
		
		JLabel lblMealOrdered = new JLabel("    Meal Ordered                :");
		lblMealOrdered.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMealOrdered.setBounds(90, 131, 249, 35);
		panel_2.add(lblMealOrdered);
		
		JLabel lblMealTaken = new JLabel("   Meal taken                      :");
		lblMealTaken.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMealTaken.setBounds(90, 177, 249, 35);
		panel_2.add(lblMealTaken);
		
		JLabel lblNewLabel = new JLabel("                           Meal per Month Info");
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(SystemColor.textHighlight);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(280, 7, 389, 35);
		panel_2.add(lblNewLabel);
		
		JLabel label_11 = new JLabel("1000");
		label_11.setBounds(335, 81, 389, 40);
		panel_2.add(label_11);
		
		JLabel label_12 = new JLabel("1000");
		label_12.setBounds(335, 130, 389, 40);
		panel_2.add(label_12);
		
		JLabel label_13 = new JLabel("1000");
		label_13.setBounds(335, 172, 389, 40);
		panel_2.add(label_13);
		
		textField = new JTextField();
		textField.setBounds(335, 172, 389, 40);
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(335, 126, 389, 40);
		panel_2.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(335, 78, 389, 40);
		panel_2.add(textField_2);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 875);
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
			
			Time.setText("Date : "+ LocalDate.now()+"           "+LocalTime.now());
		}
		while(x.isAlive());

	}
}
