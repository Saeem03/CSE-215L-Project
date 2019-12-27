package meal;

import java.awt.Color;
import java.time.LocalDate;

import javax.swing.*;

public class MonthMealChartGUI {
	MonthMealChartGUI(JFrame f,int x,int y,int width,int hight){
		LocalDate d =LocalDate.now();
		
		int end = LocalDate.now().lengthOfMonth();
		int i=1;
		DailyMeal a = new DailyMeal(f,x,y,width,hight);
		while(i  != LocalDate.now().lengthOfMonth())
		{
			a = new DailyMeal(f,x,y+=90,width,hight);
			
			i++;
		}
		a.setBack(Color.red);
	
	f.getContentPane().setBackground( Color.red );
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	f.setLayout(null);
	f.setSize(800,800);
	f.setVisible(true);
	}
	public static void main(String [] args)
	{
		new MonthMealChartGUI(new JFrame(),50,10,100,40);
	}
//	static void clean(JFrame f)
//	{
//		 f.getContentPane().removeAll();
//		 f.repaint();
//	}
}
