package memberInfo;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.security.SecureRandom;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;


public class SignUpGUI extends JFrame {
	Boolean isHuman=false;
	JTextField uName;
	JTextField uId;
	JTextField uFatherName;
	JTextField uMotherName;
	JTextField uAddress;
	JTextField uAge;
	JTextField uPhone;
	JPasswordField uPassword;
	ButtonGroup uGender = new ButtonGroup();
	JRadioButton uMale;
	JRadioButton uFemale;
	
	SignUpGUI(){
		

		JLabel a = new JLabel("Name :");
		a.setBounds(66,32,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uName = new JTextField("Saeem ",150);
		uName.setBounds(276,32,458,30);
		getContentPane().add(uName);
		a = new JLabel("User Name :");
		a.setBounds(66,72,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 18));
		getContentPane().add(a);
		uId = new JTextField("Saeem03",150);
		uId.setBounds(276,72,458,30);
		getContentPane().add(uId);
		a = new JLabel("Father's Name :");
		a.setBounds(66,112,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 18));
		getContentPane().add(a);
		uFatherName = new JTextField("A",150);
		uFatherName.setBounds(276,112,458,30);
		getContentPane().add(uFatherName);
		a = new JLabel("Mother's Name :");
		a.setBounds(66,152,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 18));
		getContentPane().add(a);
		uMotherName = new JTextField("B",150);
		uMotherName.setBounds(276,152,458,30);
		getContentPane().add(uMotherName);
		a = new JLabel("Address :");
		a.setBounds(66,278,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uAddress = new JTextField("Bashundhara");
		uAddress.setBounds(276, 192 , 458, 30);
		getContentPane().add(uAddress);
		a = new JLabel("Age :");
		a.setBounds(66,232,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uAge = new JTextField("10");
		uAge.setBounds(276, 232 , 458, 30);
		getContentPane().add(uAge);

		a = new JLabel("Phone No :");
		a.setBounds(66,322,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uPhone = new JTextField("01793382937",10);
		uPhone.setBounds(276,322,458,30);
		getContentPane().add(uPhone);
		a = new JLabel("Gender :");
		a.setBounds(79,196,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uMale = new JRadioButton("Male");
		uMale.setBounds(340, 272 ,148,40);
		uMale.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(uMale);
		uFemale = new JRadioButton("Female");
		uFemale.setBounds(517,272,160,40);
		uFemale.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(uFemale);
		uGender.add(uMale);
		uGender.add(uFemale);
		a = new JLabel("Password :");
		a.setBounds(66,382,148,30);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		getContentPane().add(a);
		uPassword = new JPasswordField("55555");
		uPassword.setBounds(276,382,458,30);
		getContentPane().add(uPassword);
		JButton b1 = new JButton("SignUp");
		b1.setBounds(474,496,265,70);
		b1.setBackground(Color.RED);
		getContentPane().add(b1);
		b1.addActionListener(new SignUpHandler());
		JButton b2 = new JButton("Login");
		b2.setBounds(216,496,217,70);
		b2.setBackground(Color.RED);
		getContentPane().add(b2);
		b1.addActionListener(new SignUpHandler());
		super.setBackground(Color.gray);
		getContentPane().setLayout(null);

		setVisible(true);
		setSize(800,700);
		setLocation(400,250);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				LoginGUI y=new LoginGUI(); 
			}
		});
	}
	public class SignUpHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {

			if(e.getActionCommand().equals("SignUp"))
			{
				try{
					if(!(uName.getText().isEmpty() || uId.getText().isEmpty() || String.valueOf(uPassword.getPassword()).isEmpty() || uAge.getText().isEmpty() || uGender.getElements().nextElement().getText().isEmpty()))
					{
						Controller r = new Controller();
						r.trySignUp(uName.getText(),uId.getText(),uAddress.getText(),uGender.getElements().nextElement().getText(),String.valueOf(uPassword.getPassword()),Integer.parseInt(uAge.getText()),uFatherName.getText(),uMotherName.getText());
						System.out.println("File saved");
					}
					else throw  new NecessityMeetException();
				}
				catch(Exception e1)
				{
					System.err.println("SomeThing Went Wrong");
				}
			}
		}

	}
	public void Hide()
	{
		this.setVisible(false);
	}

}
