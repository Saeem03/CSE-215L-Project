package managerInfo;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class Set_Bills_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_7;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private Total_Bills TB ;
	private Rent_And_Room RR ;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
				try {
					Set_Bills_GUI frame = new Set_Bills_GUI();
					frame.getContentPane().setLayout(null);
					frame.setVisible(true);
					frame.setLocation(300,300);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}
	});
	}

	/**
	 * Create the frame.
	 */
	public Set_Bills_GUI() {
		try {
			TB= new Total_Bills();
			RR = new Rent_And_Room();
		} catch (InterruptedException | IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Sorry");
		}
		
		
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel(" Show Bills  :");
		lblNewLabel.setBackground(SystemColor.inactiveCaption);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(33, 11, 132, 30);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.inactiveCaptionBorder);
		panel.setBounds(10, 64, 764, 200);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblElectricityBills = new JLabel("Total Electricity Bills           :");
		lblElectricityBills.setBounds(24, 11, 255, 20);
		lblElectricityBills.setOpaque(true);
		lblElectricityBills.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblElectricityBills.setBackground(SystemColor.inactiveCaptionBorder);
		panel.add(lblElectricityBills);
		
		JLabel lblGasBills = new JLabel("Total Gas Bills                   :");
		lblGasBills.setOpaque(true);
		lblGasBills.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGasBills.setBackground(SystemColor.inactiveCaptionBorder);
		lblGasBills.setBounds(24, 38, 255, 20);
		panel.add(lblGasBills);
		
		JLabel lblInternerBills = new JLabel("Total Internet Bills             :");
		lblInternerBills.setOpaque(true);
		lblInternerBills.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternerBills.setBackground(SystemColor.inactiveCaptionBorder);
		lblInternerBills.setBounds(24, 68, 255, 20);
		panel.add(lblInternerBills);
		
		JLabel lblWaterBills = new JLabel("Total Water Bill                  :");
		lblWaterBills.setOpaque(true);
		lblWaterBills.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblWaterBills.setBackground(SystemColor.inactiveCaptionBorder);
		lblWaterBills.setBounds(24, 99, 255, 20);
		panel.add(lblWaterBills);
		
		
		
		JLabel lblHousekeeperCharge = new JLabel("Total HouseKeeper Charge  :");
		lblHousekeeperCharge.setOpaque(true);
		lblHousekeeperCharge.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHousekeeperCharge.setBackground(SystemColor.inactiveCaptionBorder);
		lblHousekeeperCharge.setBounds(24, 137, 255, 20);
		panel.add(lblHousekeeperCharge);
		
		textField = new JTextField();
		textField.setText(""+TB.getElectricity_Bill());
		textField.setVisible(false);
		textField.setBounds(305, 11, 193, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText(""+TB.getGas_Bill());
		textField_1.setVisible(false);
		textField_1.setColumns(10);
		textField_1.setBounds(305, 38, 193, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText(""+TB.getInternet_Bill());
		textField_2.setVisible(false);
		textField_2.setColumns(10);
		textField_2.setBounds(305, 68, 193, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setVisible(false);
		textField_3.setText(""+TB.getWater_Bill());
		textField_3.setColumns(10);
		textField_3.setBounds(305, 99, 193, 20);
		panel.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setText(TB.getHouseKeeper_Charge()+"");
		textField_7.setVisible(false);
		textField_7.setColumns(10);
		textField_7.setBounds(305, 133, 193, 20);
		panel.add(textField_7);
		
		TB.setTotal();
		RR.setTotal();
		label = new JLabel();
		label.setBounds(305, 11, 191, 20);
		panel.add(label);

		label_1 = new JLabel();
		label_1.setText(""+TB.getGas_Bill());

		label.setText(""+TB.getElectricity_Bill());
		label_1.setBounds(305, 38, 193, 20);
		panel.add(label_1);

		label_2 = new JLabel();
		label_2.setText(""+TB.getInternet_Bill());
		label_2.setBounds(305, 70, 193, 20);
		panel.add(label_2);

		label_3 = new JLabel();
		label_3.setText(""+TB.getWater_Bill());
		label_3.setBounds(305, 99, 193, 19);
		panel.add(label_3);
		System.out.println(label_3.getText());
		
		label_4 = new JLabel();
		label_4.setText(""+TB.getHouseKeeper_Charge());
		label_4.setBounds(305, 130, 191, 23);
		panel.add(label_4);
		
		JButton Bills_Edit = new JButton("Edit");
		JButton Bills_Save = new JButton("Save");
		Bills_Save.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bills_Save.setBounds(633, 39, 89, 23);
		Bills_Save.setVisible(false);
		panel.add(Bills_Save);
		
		Bills_Edit.setFont(new Font("Tahoma", Font.BOLD, 13));
		Bills_Edit.setBounds(633, 12, 89, 23);
		panel.add(Bills_Edit);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(305, 147, -119, 10);
		panel.add(panel_2);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		horizontalStrut.setBounds(43, 44, 719, 9);
		contentPane.add(horizontalStrut);
		
		JLabel lblShowFlatInfo = new JLabel(" Show Flat Info  :");
		lblShowFlatInfo.setOpaque(true);
		lblShowFlatInfo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblShowFlatInfo.setBackground(SystemColor.inactiveCaption);
		lblShowFlatInfo.setBounds(33, 275, 215, 30);
		contentPane.add(lblShowFlatInfo);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		horizontalStrut_1.setBounds(43, 316, 719, 9);
		contentPane.add(horizontalStrut_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(SystemColor.inactiveCaptionBorder);
		panel_1.setBounds(10, 336, 764, 200);
		contentPane.add(panel_1);
		
		JLabel lblTotalMembers = new JLabel(" Total Members                     :");
		lblTotalMembers.setOpaque(true);
		lblTotalMembers.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTotalMembers.setBackground(SystemColor.inactiveCaptionBorder);
		lblTotalMembers.setBounds(24, 11, 255, 20);
		panel_1.add(lblTotalMembers);
		
		textField_4 = new JTextField();
//		textField_4.setText("0");
		textField_4.setText(""+RR.getTotal_Member());
		textField_4.setVisible(false);
		textField_4.setColumns(10);
		textField_4.setBounds(305, 11, 193, 20);
		panel_1.add(textField_4);
		
		JLabel label_5 = new JLabel();
		label_5.setText(""+RR.getTotal_Member());
		label_5.setBounds(305, 11, 193, 20);
		panel_1.add(label_5);
		JButton Flat_Save = new JButton("Save");
		JButton Flat_Edit = new JButton("Edit");
		Flat_Edit.setFont(new Font("Tahoma", Font.BOLD, 13));
		Flat_Edit.setBounds(633, 12, 89, 23);
		panel_1.add(Flat_Edit);
		Flat_Save.setVisible(false);
		Flat_Save.setFont(new Font("Tahoma", Font.BOLD, 13));
		Flat_Save.setBounds(633, 39, 89, 23);
		panel_1.add(Flat_Save);
		
		JLabel lblElectricityBillperHead = new JLabel("Electricity BILL (per head)       :");
		lblElectricityBillperHead.setOpaque(true);
		lblElectricityBillperHead.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblElectricityBillperHead.setBackground(SystemColor.inactiveCaptionBorder);
		lblElectricityBillperHead.setBounds(24, 42, 255, 20);
		panel_1.add(lblElectricityBillperHead);
		
		JLabel lblGasBillper = new JLabel("Gas BILL (per head)               :");
		lblGasBillper.setOpaque(true);
		lblGasBillper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblGasBillper.setBackground(SystemColor.inactiveCaptionBorder);
		lblGasBillper.setBounds(24, 73, 255, 20);
		panel_1.add(lblGasBillper);
		
		JLabel lblInternetBillper = new JLabel("Internet BILL (per head)         :");
		lblInternetBillper.setOpaque(true);
		lblInternetBillper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternetBillper.setBackground(SystemColor.inactiveCaptionBorder);
		lblInternetBillper.setBounds(24, 102, 255, 20);
		panel_1.add(lblInternetBillper);
		
		JLabel lblInternetBillper_1 = new JLabel("Internet BILL (per head)         :");
		lblInternetBillper_1.setOpaque(true);
		lblInternetBillper_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInternetBillper_1.setBackground(SystemColor.inactiveCaptionBorder);
		lblInternetBillper_1.setBounds(24, 133, 255, 20);
		panel_1.add(lblInternetBillper_1);
		
		JLabel lblHousekeeperBillper = new JLabel("HouseKeeper Bill (per head)    :");
		lblHousekeeperBillper.setOpaque(true);
		lblHousekeeperBillper.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblHousekeeperBillper.setBackground(SystemColor.inactiveCaptionBorder);
		lblHousekeeperBillper.setBounds(24, 169, 255, 20);
		panel_1.add(lblHousekeeperBillper);
		
		JLabel label_6 = new JLabel();
		label_6.setText("0");
		label_6.setBounds(305, 42, 193, 20);
		panel_1.add(label_6);
		
		JLabel label_7 = new JLabel();
		label_7.setEnabled(false);
		label_7.setText("0");
		label_7.setBounds(305, 78, 193, 20);
		panel_1.add(label_7);
		
		JLabel label_9 = new JLabel();
		label_9.setEnabled(false);
		label_9.setText("0");
		label_9.setBounds(305, 107, 193, 20);
		panel_1.add(label_9);
		
		JLabel label_10 = new JLabel();
		label_10.setEnabled(false);
		label_10.setText("0");
		label_10.setBounds(305, 138, 193, 20);
		panel_1.add(label_10);
		
		JLabel label_11 = new JLabel();
		label_11.setEnabled(false);
		label_11.setText("0");
		label_11.setBounds(305, 169, 193, 20);
		panel_1.add(label_11);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		

		Flat_Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Flat_Edit.setVisible(false);
				Flat_Save.setVisible(true);
				textField_4.setVisible(true);
				System.out.println("Flat Edit Working");
			}
		});
		Bills_Edit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setVisible(true);
				textField_1.setVisible(true);
				textField_2.setVisible(true);
				textField_3.setVisible(true);
				textField_7.setVisible(true);
				Bills_Edit.setVisible(false);
				Bills_Save.setVisible(true);
				System.out.println("Flat save Working");
				
			}
		});
		
	Bills_Save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			TB.setElectricity_Bill(Double.parseDouble(textField.getText()));
			TB.setGas_Bill(Double.parseDouble(textField_1.getText()));
			TB.setWater_Bill(Double.parseDouble(textField_2.getText()));
			TB.setInternet_Bill(Double.parseDouble(textField_3.getText()));
			TB.setHouseKeeper_Charge(Double.parseDouble(textField_7.getText()));
			textField.setVisible(false);
			textField_1.setVisible(false);
			textField_2.setVisible(false);
			textField_3.setVisible(false);
			textField_7.setVisible(false);
			Bills_Edit.setVisible(true);
			Bills_Save.setVisible(false);
			try{
				TB.setElectricity_Bill(Double.parseDouble(textField.getText()));
				TB.setGas_Bill(Double.parseDouble(textField_1.getText()));
				TB.setInternet_Bill(Double.parseDouble(textField_2.getText()));
				TB.setWater_Bill(Double.parseDouble(textField_3.getText()));
				TB.setHouseKeeper_Charge(Double.parseDouble(textField_7.getText()));
				TB.saveRecord();
				label.setText(""+TB.getElectricity_Bill());
				label_1.setText(""+TB.getGas_Bill());
				label_2.setText(""+TB.getInternet_Bill());
				label_3.setText(""+TB.getWater_Bill());
				label_4.setText(""+TB.getHouseKeeper_Charge());
				
			}
			catch(Exception e1 )
			{
				System.out.println(e1);
			}
			try {
				TB.saveRecord();
			} catch (IOException e2) {
				System.out.println("TextField didn't saved");
			}
//			try{
//
//				run();
//			}
//			catch(Exception K)
//			{
//				System.out.println("Point 3");
//			}
		}
	});
	Flat_Save.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			Flat_Edit.setVisible(true);
			Flat_Save.setVisible(false);
			textField_4.setVisible(false);
			
			try{
				RR.setTotal_Member(Integer.parseInt(textField_4.getText()));
				
			}
			catch(Exception p)
			{
				System.out.println("Point 1");
			}

			try{
				RR.setTotal_Member(Integer.parseInt(textField_4.getText()));
				RR.saveRecord();
				RR.readRecord();
				label_5.setText(""+RR.getTotal_Member());
				textField_4.setText(""+RR.getTotal_Member());
				
			}
			catch(Exception e1 )
			{
				System.out.println("POint 2");
			}
			try {
				TB.saveRecord();
				
			int x=Integer.parseInt(textField_4.getText());
			label_6.setText(""+TB.perHeadElectricityBills(x));
			label_7.setText(""+TB.perHeadGasBills(x));
			label_9.setText(""+TB.perHeadInternetBills(x));
			label_10.setText(""+TB.perHeadWaterBills(x));
			label_11.setText(""+TB.perHeadHousekeeperCharge(x));

			} catch (IOException e2) {
				System.out.println("TextField didn't saved");
			}

//			try{
//				
//				run();
//			}
//			catch(Exception K)
//			{
//				System.out.println("Point 3");
//			}

		}
	});
	
	}
}
