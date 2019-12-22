package memberInfo;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.security.SecureRandom;
import memberInfo.SignUpHandler;


public class SignUpGUI extends JFrame {
	JTextField uName;
	JTextField uId;
	JTextField uFatherName;
	JTextField uMotherName;
	JTextField uAddress;
	JTextField uAge;
	JTextField uPhone;
	JPasswordField uPassword;
	JRadioButton uMale;
	JRadioButton uFemale;
		SignUpGUI(){
			
			JLabel a = new JLabel("Name :");
			a.setBounds(50,10,100,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uName = new JTextField("",150);
			uName.setBounds(200,10,200,30);
			add(uName);
			a = new JLabel("User Name :");
			a.setBounds(50,50,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 18));
			add(a);
			uId = new JTextField("",150);
			uId.setBounds(200,50,200,30);
			add(uId);
			a = new JLabel("Father's Name :");
			a.setBounds(50,90,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 18));
			add(a);
			uFatherName = new JTextField("",150);
			uFatherName.setBounds(200,90,200,30);
			add(uFatherName);
			a = new JLabel("Mother's Name :");
			a.setBounds(50,130,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 18));
			add(a);
			uMotherName = new JTextField("",150);
			uMotherName.setBounds(200,130,200,30);
			add(uMotherName);
			a = new JLabel("Address :");
			a.setBounds(50,170,170,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uAddress = new JPasswordField(10);
			uAddress.setBounds(200, 170 , 200, 30);
			add(uAddress);
			a = new JLabel("Age :");
			a.setBounds(50,210,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uAge = new JPasswordField(10);
			uAge.setBounds(200, 210 , 200, 30);
			add(uAge);
			a = new JLabel("Password :");
			a.setBounds(50,360,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uPassword = new JPasswordField(10);
			uPassword.setBounds(200,360,200,30);
			add(uPassword);
			a = new JLabel("Phone No :");
			a.setBounds(50,300,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uPhone = new JTextField("",10);
			uPhone.setBounds(200,300,200,30);
			add(uPhone);
			ButtonGroup g1 = new ButtonGroup();
			g1.add(uMale);
			g1.add(uFemale);
			a = new JLabel("Gender :");
			a.setBounds(50,250,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uMale = new JRadioButton("Male");
			uMale.setBounds(200, 250 ,100,40);
			uMale.setFont(new Font("Serif", Font.BOLD, 20));
			add(uMale);
			uFemale = new JRadioButton("Female");
			uFemale.setBounds(300,250,120,40);
			uFemale.setFont(new Font("Serif", Font.BOLD, 20));
			add(uFemale);
			RobotCheck x = new RobotCheck( this,50,400,150,50);
			JButton b1 = new JButton("SignUp");
			if(b1.getModel().isPressed())
				System.out.println("Works");;
			b1.setBounds(150,520,150,30);
			add(b1);
			b1.addActionListener(new SignUpHandler());
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setLayout(null);
			setVisible(true);
			setSize(1400,1400);
		}

	public static void main(String[] args) {
		SignUpGUI x = new SignUpGUI();
	}

}
