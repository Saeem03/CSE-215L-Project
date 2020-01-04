package memberInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class LoginGUI extends JFrame {
	static  boolean isLogin;
	public static String status="Member";
	private JTextField uId;
	private JPasswordField uPassword;
	private JButton b1_1;
	private JLabel a_1;
	private JLabel lblIfYouAre;
	private JLabel lblIfYouAre_1;
	LoginGUI (){
		super();
		getContentPane().setBackground(new Color(102, 204, 255));
		getContentPane().setLayout(null);
		JLabel a = new JLabel("          UserName :");
		a.setBounds(203, 127, 200, 30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uId = new JTextField("Saeem",150);
		uId.setBounds(453, 127, 300, 30);
		getContentPane().add(uId);
		a_1 = new JLabel("          Password   :");
		a_1.setBounds(203, 167, 200, 30);
		a_1.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a_1);
		uPassword = new JPasswordField("123",10);
		uPassword.setBounds(453, 167, 300, 30);
		getContentPane().add(uPassword);
		JButton b1 = new JButton("Login");
		b1.setBounds(604, 226, 124, 60);
		b1.setBackground(Color.RED);
		getContentPane().add(b1);
		b1.addActionListener(new LoginHandler());
		b1_1 = new JButton("SignUp");
		b1_1.setBounds(268, 226, 300, 60);
		b1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new SignUpGUI();
			}
		});
		b1_1.setBackground(Color.GREEN);
		getContentPane().add(b1_1);
		
		lblIfYouAre = new JLabel("       If you are a manager");
		lblIfYouAre.setBackground(new Color(240, 128, 128));
		lblIfYouAre.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
				LoginGUI x = new LoginGUI();
				x.status="Manager";
				x.lblIfYouAre.setVisible(false);
				x.lblIfYouAre_1.setVisible(true);
				
			}
		});
		lblIfYouAre.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblIfYouAre.setBounds(585, 34, 213, 47);
		getContentPane().add(lblIfYouAre);
		
		lblIfYouAre_1 = new JLabel("       If you are a member");
		lblIfYouAre_1.setVisible(false);
		lblIfYouAre_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginGUI y = new LoginGUI();
				LoginGUI.status="Member";
				y.lblIfYouAre_1.setVisible(false);
				y.lblIfYouAre.setVisible(true);
			}
		});
		lblIfYouAre_1.setBackground(Color.GREEN);
		lblIfYouAre_1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
		lblIfYouAre_1.setBounds(585, 34, 213, 47);
		getContentPane().add(lblIfYouAre_1);

		super.setBackground(Color.gray);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1059,500);
		setLocation(400,250);
	}

	public class LoginHandler  implements ActionListener  {
		public void actionPerformed(ActionEvent e) 
		{
			String word =""+uId.getText().trim();
			char[] s = word.toCharArray();
			for(int i =0; i<s.length;i++)
				if((s[i]<'a' || s[i]>'z') && (s[i]<'A' || s[i]>'Z') && (s[i]<'0' ||s[i]>'9'))
					return;
			if(e.getActionCommand().equals("Login"))
			{
				forward();
			}
		}

	}
	public void forward()
	{
		try{
			if(!(uId.getText().isEmpty() || String.valueOf(uPassword.getPassword()).isEmpty()))
			{
				Login x = new Login();
				x.setStatus(status);
				System.out.println(status);
				 isLogin =x.login(uId.getText(),String.valueOf(uPassword.getPassword()));
				 
				System.out.println(isLogin);
				if(isLogin==true)
				{
						dispose();					
						MemberProfGUI y= new MemberProfGUI(uId.getText().trim());
					System.out.println("Working");
				}
				else
					System.out.println("New Frame fail");
			}
			else throw  new NecessityMeetException();
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
	}
	
	
	}
