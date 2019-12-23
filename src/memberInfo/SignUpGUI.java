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
			uAddress = new JTextField(10);
			uAddress.setBounds(200, 170 , 200, 30);
			add(uAddress);
			a = new JLabel("Age :");
			a.setBounds(50,210,200,30);
			a.setFont(new Font("Serif", Font.BOLD, 20));
			add(a);
			uAge = new JTextField(10);
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
			uGender.add(uMale);
			uGender.add(uFemale);
			JButton b1 = new JButton("SignUp");
			b1.setBounds(250,500,150,90);
			b1.setBackground(Color.RED);
			add(b1);
			super.setBackground(Color.gray);
			b1.addActionListener(new SignUpHandler());
			setLayout(null);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(800,700);
		}
		public class SignUpHandler implements ActionListener{

			public void actionPerformed(ActionEvent e) {
				
				if(e.getActionCommand().equals("SignUp"))
				{
					try{
						if(!(uName.getText().isEmpty() || uId.getText().isEmpty() || String.valueOf(uPassword.getPassword()).isEmpty() || uAge.getText().isEmpty() || uGender.getElements().nextElement().getText().isEmpty()))
						{
							Recording r = new Recording(uName.getText(),uId.getText(),uAddress.getText(),uGender.getElements().nextElement().getText(),String.valueOf(uPassword.getPassword()),Integer.parseInt(uAge.getText()));
							
							if(!uFatherName.getText().isEmpty())
								r.setfName(uFatherName.getText());
							if(!uMotherName.getText().isEmpty())
								r.setfName(uMotherName.getText());
							r.Save();
							System.out.println("File saved");
						}
						else throw  new NecessityMeetException();
						
					}
					catch(Exception e1)
					{
						e1.printStackTrace();
						System.out.println("eeeeeeeee");
					}
				}
			}

		}

	public static void main(String[] args) {
		SignUpGUI x = new SignUpGUI();
	}

}
