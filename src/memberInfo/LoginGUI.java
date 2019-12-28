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
	private JButton b1_1;
	private JLabel a_1;
	LoginGUI (){
		super();
		getContentPane().setLayout(null);
		JLabel a = new JLabel("          UserName :");
		a.setBounds(50, 10, 200, 30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uId = new JTextField("Saeem",150);
		uId.setBounds(300, 10, 300, 30);
		getContentPane().add(uId);
		a_1 = new JLabel("          Password   :");
		a_1.setBounds(50, 50, 200, 30);
		a_1.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a_1);
		uPassword = new JPasswordField("123",10);
		uPassword.setBounds(300, 50, 300, 30);
		getContentPane().add(uPassword);
		JButton b1 = new JButton("Login");
		b1.setBounds(451, 109, 124, 60);
		b1.setBackground(Color.RED);
		getContentPane().add(b1);
		b1.addActionListener(new LoginHandler());
		b1_1 = new JButton("SignUp");
		b1_1.setBounds(115, 109, 300, 60);
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SignUpGUI();
			}
		});
		b1_1.setBackground(Color.GREEN);
		getContentPane().add(b1_1);

		super.setBackground(Color.gray);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(701,250);
		setLocation(400,250);
//		setExtendedState(JFrame.MAXIMIZED_BOTH);
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
						Login x = new Login();
						Boolean isLogin =x.login(uId.getText(),String.valueOf(uPassword.getPassword()));
						if(isLogin==true)
						{
							dispose();
							MemberProfGUI m = new MemberProfGUI();
							System.out.println("Working");
						}
						else
							System.out.println("New Frame fail");
					}
					else throw  new NecessityMeetException();
				}
				catch(Exception e1)
				{
					System.out.println("Login Button Not Working");
				}
				
		}
	}
	}
}
