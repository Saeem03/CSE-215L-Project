package meal;

import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.*;

public class DailyMeal {
	JRadioButton mNormal;
	JRadioButton mRich;
	JRadioButton lNormal;
	JRadioButton lRich;
	JRadioButton dNormal;
	JRadioButton dRich;
	Color back;
	public Color getBack() {
		return back;
	}
	public void setBack(Color back) {
		this.back = back;
	}
	static int days=0;
 DailyMeal(JFrame f,int x,int y,int width,int hight){
	 this.days++;
	 
		JLabel d = new JLabel(""+this.date(days));
		d.setBounds(x,y,width,hight);
		d.setFont(new Font("Serif", Font.PLAIN, 21));
		f.add(d);
		
		JLabel a = new JLabel("      Morning");
		a.setFont(new Font("Serif", Font.BOLD, 18));
		a.setBounds(x+170,y-5,width+30,25);
		a.setForeground(Color.yellow);
		a.setBackground(Color.decode("#336699"));
		a.setOpaque(true);
		f.add(a);
		
		a = new JLabel("     Lunch");
		a.setBounds(x+350,y-5,width+30,25);
		a.setOpaque(true);
		a.setBackground(Color.decode("#1FBED6"));
		a.setForeground(Color.yellow);
		a.setFont(new Font("Serif", Font.BOLD, 22));
		f.add(a);

		a = new JLabel("     Dinner");
		a.setBounds(x+530,y-5,width+30,25);
		a.setOpaque(true);
		a.setBackground(Color.ORANGE);
		a.setForeground(Color.yellow);
		a.setFont(new Font("Serif", Font.BOLD, 22));
		f.add(a);
		
		mNormal = new JRadioButton("N");
		mNormal.setBackground(back);
		mNormal.setOpaque(true);
		mNormal.setBounds(x+180,y+30,width-40,20);
		f.add(mNormal);
		
		mRich = new JRadioButton("R");
		mRich.setBackground(back);
		mRich.setOpaque(true);
		mRich.setBounds(x+260,y+20,width-40,40);
		f.add(mRich);
		
		ButtonGroup g1 = new ButtonGroup();
		g1.add(mNormal);
		g1.add(mRich);
		
		lNormal = new JRadioButton("N");
		lNormal.setBackground(back);
		lNormal.setOpaque(true);
		lNormal.setBounds(x+370,y+30,width-40,20);
		f.add(lNormal);
		
		lRich = new JRadioButton("R");
		lRich.setBackground(back);
		lRich.setOpaque(true);
		lRich.setBounds(x+440,y+20,width-40,40);
		f.add(lRich);
		
		ButtonGroup g2 = new ButtonGroup();
		g2.add(lNormal);
		g2.add(lRich);
		
		dNormal = new JRadioButton("N");
		dNormal.setBackground(back);
		dNormal.setOpaque(true);

		dNormal.setBounds(x+550,y+30,width-40,20);
		f.add(dNormal);
		
		dRich = new JRadioButton("R");
		dRich.setOpaque(true);
		dRich.setBackground(back);
		dRich.setBounds(x+620,y+20,width-40,40);
		f.add(dRich);
		
		ButtonGroup g3 = new ButtonGroup();
		g3.add(dNormal);
		g3.add(dRich);
		
//		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
//		f.setLayout(null);
//		f.setSize(800,800);
//		f.setVisible(true);
	 
 }
// public static void main(String [] args)
// {
//	 DailyMeal p = new DailyMeal(new JFrame(),10,10,100,100);
// }
 public String date(int i) {
	 LocalDate x = LocalDate.now();
	 x=x.plusDays(i);
	 DateTimeFormatter formatters = DateTimeFormatter.ofPattern("d/MM/uuuu");
	 String text = x.format(formatters);
	return text;
 }
}
