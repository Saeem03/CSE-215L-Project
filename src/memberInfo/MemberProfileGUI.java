package memberInfo;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.*;

public class MemberProfileGUI extends JFrame implements Runnable{
	Thread x ;
	JLabel time;
	JLabel name;
	JLabel id;
	JLabel hostel;
	JLabel bed;
	JLabel age;
	JLabel rent;
	JLabel deposite_Rent;
	JLabel current_Month;
	JLabel electricity_Bill;
	JLabel water_Bill;
	JLabel gas_Bill;
	JLabel security_Bill;
	JLabel internet_Bill;
	JLabel houseKeeper_Bill;
	JLabel meal_Ordered;
	JLabel meal_Remain;
	JLabel meal_Taken;
	JLabel deposite_Meal;
	
	MemberProfileGUI(){
		super("Profile");
		
		time = new JLabel();
		time.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));
		time.setBounds(65,380,300,40);
		time.setBackground(Color.green);
		time.setForeground(Color.red);
		time.setOpaque(true);
		time.setBounds(50,135,300,30);
		add(time);		
		
		JLabel name = new JLabel("Name :");
		name.setBounds(50,25,100,30);
		name.setFont(new Font("Serif", Font.PLAIN, 20));
		add(name);
		
		id = new JLabel("User Name :");
		id.setFont(new Font("Serif", Font.PLAIN, 18));
		id.setBounds(50,53,200,30);
		add(id);
		
		hostel = new JLabel("Hostel/Mass Name : ");
		hostel.setFont(new Font("Serif", Font.PLAIN, 18));
		hostel.setBounds(50,80,200,30);
		add(hostel);
		
		bed= new JLabel("Room/Bed No. ");
		bed.setFont(new Font("Serif", Font.PLAIN, 18));
		bed.setBounds(50,105,200,30);
		add(bed);
		
		current_Month= new JLabel("Current_Month : ");
		current_Month.setFont(new Font("Serif", Font.PLAIN, 18));
		current_Month.setBounds(50,170,200,30);
		add(current_Month);
		
		rent= new JLabel("Rent : ");
		rent.setFont(new Font("Serif", Font.PLAIN, 18));
		rent.setBounds(50,205,200,30);
		add(rent);
		
		water_Bill= new JLabel("Water_Bill : ");
		water_Bill.setFont(new Font("Serif", Font.PLAIN, 18));
		water_Bill.setBounds(50,240,200,30);
		add(water_Bill);

		gas_Bill= new JLabel("Gas_Bill : ");
		gas_Bill.setFont(new Font("Serif", Font.PLAIN, 18));
		gas_Bill.setBounds(50,275,200,30);
		add(gas_Bill);

		houseKeeper_Bill= new JLabel("HouseKeeper_Bill : ");
		houseKeeper_Bill.setFont(new Font("Serif", Font.PLAIN, 18));
		houseKeeper_Bill.setBounds(50,310,200,30);
		add(houseKeeper_Bill);

		electricity_Bill= new JLabel("Electricity_Bill : ");
		electricity_Bill.setFont(new Font("Serif", Font.PLAIN, 18));
		electricity_Bill.setBounds(50,350,200,30);
		add(electricity_Bill);
		
		JLabel l = new JLabel("       Meal per Month info: ");
		l.setFont(new Font("Serif", Font.PLAIN, 18));
		l.setBounds(65,380,300,40);
		l.setForeground(Color.red);
		l.setOpaque(true);
		l.setBackground(Color.DARK_GRAY);
		add(l);
		
		meal_Remain= new JLabel("Meal Remain : ");
		meal_Remain.setFont(new Font("Serif", Font.PLAIN, 18));
		meal_Remain.setBounds(50,430,200,30);
		add(meal_Remain);
		
		meal_Taken= new JLabel("Meal Taken : ");
		meal_Taken.setFont(new Font("Serif", Font.PLAIN, 18));
		meal_Taken.setBounds(50,470,200,30);
		add(meal_Taken);
		meal_Ordered= new JLabel("Meal Ordered : ");
		meal_Ordered.setFont(new Font("Serif", Font.PLAIN, 18));
		meal_Ordered.setBounds(50,510,200,30);
		add(meal_Ordered);

		deposite_Meal= new JLabel("Meal Deposite : ");
		deposite_Meal.setFont(new Font("Serif", Font.PLAIN, 18));
		deposite_Meal.setBounds(400,430,200,30);
		add(deposite_Meal);
		
		deposite_Rent= new JLabel("Rent Deposite: ");
		deposite_Rent.setFont(new Font("Serif", Font.PLAIN, 18));
		deposite_Rent.setBounds(400,170,200,30);
		add(deposite_Rent);
		
		
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,700);
		setLocation(300,300);
		x = new Thread(this);
		x.start();
	}
	public void run(){
		do {
			time.setText("      "+ LocalDate.now()+"           "+LocalTime.now());
		}
		while(x.isAlive());

	}
	public static void main(String [] args)
	{
		MemberProfileGUI p = new MemberProfileGUI();
	}
	
}
