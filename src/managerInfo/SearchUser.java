package managerInfo;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchUser {
	//private LinkedList<String> uList = new LinkedList<>();
	String s="11";
	SearchUser(String s)
	{
		this.s=s;

		try {
			String x;
			Scanner scan = new Scanner(new FileReader("D:\\eclipse-workspace\\Final Project\\Records\\Member\\Member's User_Password.txt"));
			while(scan.hasNext())
			{
				x=scan.nextLine().trim();
				System.out.println(this.s);
				System.out.println(x);
				int i=0;
				if(i==0);
				{
					System.out.println("Found you!");
					i=1;
					scan.close();
				}
				x=scan.nextLine();
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Reading was not complete");
		}
		read(s);
		
	}
	public void read(String s)
	{
	}
	
public static void main(String [] args)
{
	SearchUser x= new SearchUser("55555");
}
}
