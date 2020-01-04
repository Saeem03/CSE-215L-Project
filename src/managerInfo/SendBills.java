package managerInfo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SendBills {
		HashMap<String,String> list = new HashMap<>();;
		HashMap<String,String> readedlist = new HashMap<>();
		String s=firstRead();
		 SendBills() throws IOException 
		{
			 readBills();							//taking  all the Bills from the file and putting them  in a list
			 makeList();							//only individual's Bills are been taken from the list
			 Runtime runtime = Runtime.getRuntime();
			 Process process = runtime.exec("Notepad.exe .\\Records\\Member\\Saeem.txt");
		}
		public void readBills()
		{
			try {
				
				Scanner scan = new Scanner(new FileReader(".\\Records\\Managers\\TotalBills.txt"));
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
				scan.close();
				//System.out.println(list);
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
			
			try {
			
				FileWriter x = new FileWriter(".\\Records\\Managers\\Text.txt",true);
				BufferedWriter y = new BufferedWriter(x);
				for(String m:readedlist.keySet()){ 
					y.write(m+"\n");
					y.write(readedlist.get(m)+"\n");
//					System.out.println(s);
					x.close();
			}
				x.close();
			}
				catch (IOException e) {
			}
		}
		public void writeBills_toAll()         	//Bills are being sent to all users' record file

		{
			try {
				Scanner scan = new Scanner(new FileReader(".\\Records\\Member\\Member's User_Password.txt"));
				String name;
				while(scan.hasNext())
				{
					name = scan.nextLine().trim();
					scan.nextLine();

					FileWriter x = new FileWriter(".\\Records\\Member\\"+name+".txt");
					BufferedWriter y = new BufferedWriter(x);
					y.flush();
					y.append(this.s);
					y.flush();
					for(String m:readedlist.keySet()){ 
						y.flush();
						y.append(m);
						y.flush();
						y.append("\n");
						y.flush();
						y.append(readedlist.get(m));
						y.flush();
						y.append("\n");
						y.flush();
					}
					y.close();
				}
				System.out.println("Bills were sent");
				scan.close();
			}
			catch (IOException e) {
				System.out.println("Bills sending interrupted");
			}
		}
		
		
		
		
		public String firstRead() 
		{
			try
			{
				
				File f = new File(".\\Records\\Member\\Saeem.txt");
				FileReader r = new FileReader(f);
				BufferedReader buff = new BufferedReader(r);
				String x="";
				int i;
				while((i= buff.read())!=-1)
				{
					if((char)i=='!')
					{
						x+="\n !  \n";
						break;
					}
					x+=(char)i;
				}
				buff.close();
				return x;
			}
			catch(Exception e)
			{
				
				return "";
			}
		}
		


}
