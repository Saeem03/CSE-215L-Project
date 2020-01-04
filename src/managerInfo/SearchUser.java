
package managerInfo;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.Scanner;

public class SearchUser {
	//private LinkedList<String> uList = new LinkedList<>();
	String s="";
	SearchUser(String s)
	{
		
		read(s);
	}
	
	public void read(String s)
	{
			this.s=s;
			
			try {
				String x;
				Scanner scan = new Scanner(new FileReader(".\\Records\\Member\\Member's User_Password.txt"));
				while(scan.hasNext())
				{
					x=scan.nextLine();
					if(s.equals(x))
					{
						System.out.println("Found you!");
						scan.close();
						break;
					}
					else
						x=scan.nextLine();
				}
				
			}
			catch(Exception e)
			{
				//System.out.println(e);
				System.out.println("Reading was not complete");
			}
		}
	
	
public static void main(String [] args)
{
	SearchUser x= new SearchUser("Saeem");
}
}
