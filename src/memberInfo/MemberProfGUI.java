package memberInfo;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import managerInfo.Set_Bills_GUI;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Font;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;
import java.awt.Color;
import java.awt.SystemColor;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class MemberProfGUI extends JFrame implements Runnable {
  	private JPanel contentPane;
	private JLabel Time;
	private JLabel CurrentMonth;
	JLabel Gas;
	JLabel Water;
	JLabel ElectricityBill;
	JLabel HouseKeeperBill;
	public Thread x = new Thread(this);
	private JTextField txtField;
	private JTextField txtField_1;
	private JTextField txtField_2;
	private JTextField txtField_3;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	
	private JButton Edit1,Save1,Cancel1;
	private HashMap<String ,String> shortlist = new HashMap<>();
	private HashMap<String,String> 	readList = new HashMap<>();
	String user;
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
	public MemberProfGUI(String UserName) {
		
		this.user=UserName;
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 102, 102));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 204));
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
		lblName_1.setBackground(new Color(51, 204, 255));
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
		
		txtField_3 = new JTextField();
		txtField_3.setText("21");
		txtField_3.setColumns(10);
		txtField_3.setBounds(387, 148, 289, 38);
		panel.add(txtField_3);
		
		JLabel Name = new JLabel("Saeem");
		Name.setBounds(387, 12, 289, 35);
		panel.add(Name);
		
		JLabel userName = new JLabel("Saeem03");
		userName.setBounds(387, 55, 289, 35);
		panel.add(userName);
		
		JLabel mass_Name = new JLabel("King's Kingdom");
		mass_Name.setBounds(387, 101, 289, 35);
		panel.add(mass_Name);
		
		JLabel seat = new JLabel("");
		seat.setBounds(387, 147, 289, 35);
		panel.add(seat);
		
		 Edit1 = new JButton("Edit");
		 if(LoginGUI.status.equals("Member"))
			 Edit1.setVisible(false);
		 
		Edit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				hidingTextFields1(true);
				
				
			}
		});
		Edit1.setBounds(799, 12, 100, 25);
		panel.add(Edit1);
		
		 Save1 = new JButton("Save");
		 Save1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent arg0) {
		 		hidingTextFields1(false);
		 	}
		 });
		Save1.setBounds(911, 12, 100, 25);
		panel.add(Save1);
		
		 Cancel1 = new JButton("Cancel");
		 Cancel1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		hidingTextFields1(false);
		 		
		 	}
		 });
		Cancel1.setBounds(911, 55, 100, 25);
		panel.add(Cancel1);
		
		
		
		
		Time = new JLabel("Time & Date :");
		Time.setBackground(new Color(238, 238, 238));
		Time.setBounds(333, 251, 419, 36);
		Time.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(Time);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 255, 153));
		panel_1.setBounds(27, 300, 1086, 269);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		
		 JLabel lblCurrentmonth = new JLabel("  Current_Month          :");
		lblCurrentmonth.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCurrentmonth.setBounds(98, 36, 268, 35);
		panel_1.add(lblCurrentmonth);
		
		JLabel lblGasBill = new JLabel(" Gas Bill                             :");
		lblGasBill.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGasBill.setBounds(101, 74, 265, 35);
		panel_1.add(lblGasBill);
		
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
		lblHousekeeperCharge.setBounds(88, 183, 278, 38);
		panel_1.add(lblHousekeeperCharge);
		
		CurrentMonth = new JLabel("");
		CurrentMonth.setBounds(378, 35, 298, 39);
		panel_1.add(CurrentMonth);
		
		Gas = new JLabel("9000");
		Gas.setBounds(378, 73, 298, 39);
		panel_1.add(Gas);
		
		Water = new JLabel("500");
		Water.setBounds(378, 115, 298, 35);
		panel_1.add(Water);
		
		ElectricityBill = new JLabel("500");
		ElectricityBill.setBounds(378, 151, 298, 39);
		panel_1.add(ElectricityBill);
		
		HouseKeeperBill = new JLabel("700");
		HouseKeeperBill.setBounds(378, 184, 298, 38);
		panel_1.add(HouseKeeperBill);
		
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
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		menu.setBackground(new Color(255, 255, 51));
		JMenuItem i1 = new JMenuItem("Set Bills");
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i1.setVisible(true);
			}
		});
		i1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				 try {
					 Set_Bills_GUI x= new Set_Bills_GUI();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		menu.add(i1);
		menu.setBounds(0, 0, 192, 28);
		
		menuBar.add(menu);
		setJMenuBar(menuBar);
		if(LoginGUI.status.equals("Member"))
			menuBar.setVisible(false);
		x.start();
		
		hidingTextFields1(false);
		hidingTextFields3(false);
		MakeList(UserName);
		readData();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1150, 875);
		setVisible(true);
	}
	
	public void hidingTextFields1(boolean x)
	{
		txtField.setVisible(x);
		txtField_1.setVisible(x);
		txtField_2.setVisible(x);
		txtField_3.setVisible(x);
		Edit1.setVisible(!x);
		Save1.setVisible(x);
		Cancel1.setVisible(x);
	}
	
	
	public void hidingTextFields3(boolean x)
	{
		textField.setVisible(x);
		textField_1.setVisible(x);
		textField_2.setVisible(x);
	}
public void run(){
		do {
			
			Time.setText("Date : "+ LocalDate.now()+"           "+LocalTime.now());
			Calendar c = Calendar.getInstance();
			CurrentMonth.setText(""+ c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH ));
		}
		while(x.isAlive());

	}
public static void main(String [] args )
{
	new MemberProfGUI("Saeem");
}
public void readData()
{
	Water.setText(shortlist.get("per_head_water_Bill")) ;
	ElectricityBill.setText(shortlist.get("per_head_electricity_Bill"));
	HouseKeeperBill.setText(shortlist.get("per_head_houseKeeper_Charge"));
	Gas.setText(shortlist.get("per_head_gas_Bill"));
	
}
public void MakeList(String user)
{   
	try {
		Scanner scan = new Scanner( new FileReader("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\TotalBills.txt"));
		while(scan.hasNextLine())
		{
			
			shortlist.put(scan.nextLine().trim(),scan.nextLine().trim());
		}
 	} catch (IOException e) {
		e.printStackTrace();
	}
}
}
