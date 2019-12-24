package memberInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class LoginGUI extends JFrame{
	JTextField uId;
	JPasswordField uPassword;
	LoginGUI (){
		super();
		JLabel a = new JLabel("UserName :");
		a.setBounds(50,10,200,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		add(a);
		uId = new JTextField("",150);
		uId.setBounds(200,10,200,30);
		add(uId);
		a = new JLabel("Password :");
		a.setBounds(50,50,200,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		add(a);
		uPassword = new JPasswordField(10);
		uPassword.setBounds(200,50,200,30);
		add(uPassword);
		JButton b1 = new JButton("Login");
		b1.setBounds(300,100,90,60);
		b1.setBackground(Color.RED);
		add(b1);
		b1.addActionListener(new LoginHandler());
		b1 = new JButton("SignUp");
		b1.setBackground(Color.GREEN);
		b1.setBounds(200, 100, 90, 60);
		add(b1);

		super.setBackground(Color.gray);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600,300);
	}
	public static void main(String[] args)
	{
		LoginGUI x = new LoginGUI();
	}
	public class LoginHandler  implements ActionListener  {
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("work");
			if(e.getActionCommand().equals("Login"))
			{
				try{
					if(!(uId.getText().isEmpty() || String.valueOf(uPassword.getPassword()).isEmpty()))
					{
						Controller x = new Controller(uId.getText(),String.valueOf(uPassword.getPassword()));
					}
					else throw  new NecessityMeetException();
					
				}
				catch(Exception e1)
				{
					System.out.println("eeeeeeeee");
				}

		}
	}
	}
}
