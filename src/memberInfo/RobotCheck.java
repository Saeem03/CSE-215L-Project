package memberInfo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.SecureRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RobotCheck implements Runnable {
	int posi_x,posi_y,width,hight;
	JLabel b;
	JLabel e;
	JTextField r;
	JButton x;
	JButton B;
	Boolean pass;
	RobotCheck(JFrame f,int posi_x,int posi_y,int width,int hight,JButton B)
	{
		this.posi_x=posi_x;
		this.posi_y=posi_y;
		this.width=width;
		this.hight=hight;
		this.B=B;
		JLabel a = new JLabel("Robot Check :");
		System.out.println(posi_x+"  "+posi_y+"  "+width+"  "+hight);
		a.setBounds(this.posi_x,posi_y,width+10,hight);
		a.setFont(new Font("Serif", Font.BOLD, 20));
		f.add(a);
		b = new JLabel(" "+new SecureRandom().nextInt(20));
		b.setBounds(posi_x+150,posi_y,width-50,hight);
		b.setFont(new Font("Serif", Font.BOLD, 20));
		f.add(b);
		JLabel c = new JLabel(" + ");
		c.setBounds(posi_x+180,posi_y,width-50,hight);
		c.setFont(new Font("Serif", Font.BOLD, 20));
		f.add(c);
		r = new JTextField("");
		r.setBounds(posi_x+210,posi_y+10,width-100,hight-20);
		r.setFont(new Font("Serif", Font.BOLD, 20));
		r.setBackground(Color.green);
		f.add(r);
		JLabel d = new JLabel(" = ");
		d.setBounds(posi_x+300,posi_y,width-140,hight);
		d.setFont(new Font("Serif", Font.BOLD, 20));
		d.setOpaque(true);
		f.add(d);
		
		e = new JLabel(""+new SecureRandom().nextInt(20));
		e.setBounds(posi_x+340,posi_y+5,width-100,hight-10);
		e.setFont(new Font("Serif", Font.BOLD, 20));
		e.setBackground(Color.green);
		f.add(e);
		JButton x = new JButton(" Java ");
		x.setBounds(50,700,150,100);
		x.setBackground(Color.RED);
		f.add(x);
		System.out.println("Hello");
	}
	
	public boolean Test()
	{
		try{
			int x=Integer.parseInt(b.getText().trim()),
					y=Integer.parseInt(e.getText().trim()),
					z=Integer.parseInt(r.getText().trim());
			if(x+z==y)
			{
				System.out.println("Robot Check verified");
				pass=true;
				return true;
			}
			else 
			{
				System.out.println("Robot Check not verified");
				pass=false;
				return false;
			}
		}
		catch(Exception e)
		{
			
			return false;
		}
	}

	@Override
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(50);
				Test();
				if(Test())
				{
					this.Test();
					this.B.addActionListener(new SignUpHandler());
					if(!Test())
						this.B.addActionListener(null);
					
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		
	}
	
	}
