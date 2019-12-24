package memberInfo;

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
	
	MemberProfileGUI(){
		super("Profile");
		time = new JLabel();
		time.setFont(new Font("Serif", Font.CENTER_BASELINE, 18));
		time.setBounds(50,100,200,100);
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
			time.setText(""+ LocalDate.now()+"  "+LocalTime.now());
		}
		while(x.isAlive());

	}
	public static void main(String [] args)
	{
		MemberProfileGUI p = new MemberProfileGUI();
	}
	
}
