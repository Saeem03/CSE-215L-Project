package memberInfo;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RobotCheck {
	int posi_x,posi_y,width,hight;
	JLabel b;
	JLabel e;
	JTextField r;
	JButton x;
	RobotCheck(JFrame f,int posi_x,int posi_y,int width,int hight)
	{
		this.posi_x=posi_x;
		this.posi_y=posi_y;
		this.width=width;
		this.hight=hight;
		JLabel a = new JLabel("RobotCheck :");
		a.setBounds(posi_x,posi_y,width+10,hight);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		b = new JLabel(" "+new SecureRandom().nextInt(20));
		b.setBounds(posi_x+150,posi_y,width-50,hight);
		b.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel c = new JLabel(" + ");
		c.setBounds(posi_x+180,posi_y,width-50,hight);
		c.setFont(new Font("Serif", Font.BOLD, 20));
		r = new JTextField("",100);
		r.setBounds(posi_x+210,posi_y+10,width-50,hight-20);
		r.setFont(new Font("Serif", Font.BOLD, 20));
		JLabel d = new JLabel(" = ");
		d.setBounds(posi_x+310,posi_y,width-50,hight);
		d.setFont(new Font("Serif", Font.BOLD, 20));
		e = new JLabel(""+new SecureRandom().nextInt(20));
		e.setBounds(posi_x+340,posi_y,width-50,hight);
		e.setFont(new Font("Serif", Font.BOLD, 20));
		x = new JButton("verify");
		x.setBounds(posi_x+250,posi_y+50,width-50,hight-15);
		x.addActionListener( new ButtonHandler());
		f.add(a);
		f.add(b);
		f.add(d);
		f.add(c);
		f.add(r);
		f.add(e);
		f.add(x);
	}
	public class ButtonHandler implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			Test();
		}
		
	} 
	public boolean Test()
	{
		int x=Integer.parseInt(b.getText().trim()),
				y=Integer.parseInt(e.getText().trim()),
				z=Integer.parseInt(r.getText().trim());
		if(x+y==z)
		{
			System.out.println("Robot Check verified");
			return true;
		}
		else 
			{
			System.out.println("Robot Check not verified");
			return false;
			}
	}
	
	}
