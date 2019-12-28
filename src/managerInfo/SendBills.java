package managerInfo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JFrame;

public class SendBills {
		HashMap<String,String> list = new HashMap<>();;
		HashMap<String,String> readedlist = new HashMap<>();
		 SendBills()
		{
			 readBills();
			 makeList();
			 writeBills();
			
		}
		public void readBills()
		{
			try {
				
				Scanner scan = new Scanner(new FileReader("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\TotalBills.txt"));
				System.out.println("Scanning complete");
				list.put(scan.nextLine(),scan.nextLine());
				while(scan.hasNext())
				{
					try
					{
						list.put(scan.nextLine(),scan.nextLine());
					}
					catch(Exception p)
					{
						System.out.println("readBills not working");
					}
				}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		public void makeList()
		{
			try{
				
				readedlist.put("per_head_gas_Bill", list.get("per_head_gas_Bill"));
				readedlist.put("per_head_water_Bill", list.get("per_head_water_Bill"));
				readedlist.put("per_head_electricity_Bill", list.get("per_head_electricity_Bill"));
				readedlist.put("per_head_houseKeeper_Charge", list.get("per_head_houseKeeper_Charge"));
				readedlist.put("per_head_internet_Bill", list.get("per_head_internet_Bill"));
			}
			catch(Exception p1)
			{
				System.out.println(p1);
			}
		}
		public void writeBills()
		{
			//FileWriter x = new FileWriter(".\\Text.txt");
			String s="";
			  for(String m:readedlist.keySet()){ 
				  s+=m+"\n"+readedlist.get(m)+"\n";
//			       System.out.println(m+"\n "+readedlist.get(m));    
			
				
			  }
			  System.out.println(s);
			
		}

	public static void main(String[] args) throws InterruptedException {
		new SendBills();

	}
	
}
