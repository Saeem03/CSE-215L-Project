package managerInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Rent_And_Room {
	private static int total_Room;
	public static int total_Member;
	public static int total_Seats;
	
	
//	private static int vacant_Room;
//	private static int vacant_Member;
//	private static int vacant_Seats;
	HashMap <String,Integer> list;
	private HashMap<String,Integer> recordedList = new HashMap<>();
	Thread thread;
	Rent_And_Room() throws InterruptedException
	{
		readRecord();
		setTotal();
		this.MakeList();
	}
	public  synchronized  void MakeList() {
		list = new HashMap<>();
		list.put("total_Member", total_Member);
		
		}
	public String toString(HashMap<String,Integer> a)
	{
		String s="";
		for(String i : a.keySet())
		{
			s+=i+"\n"+a.get(i)+"\n";
		}
		return s;
		
	}
	public void saveRecord() throws IOException {
		
		FileWriter x=new FileWriter("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\Total_Members.txt");
		MakeList();
		x.write(this.toString(list));
		System.out.println("Writting Successful");
		x.close();

	}
	public void readRecord() 
	{  
		Scanner scan;
		try {
			scan = new Scanner(new FileReader("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\Total_Members.txt"));
			while(scan.hasNext())
				{
				recordedList.put(scan.nextLine(),Integer.parseInt(scan.nextLine().trim()));
				continue;
				}
			setTotal();
		} catch (FileNotFoundException e1) {
			System.out.println("Record listing was not complete");
		}
		catch(Exception e1)
		{
			System.out.println("Total Set Didn't Worked");
		}
	}
	
	public synchronized void  setTotal()
	{
		
		total_Member = recordedList.get("total_Member");
	}
	
	
	public  int getTotal_Room() {
		return total_Room;
	}
	public int getTotal_Member() {
		return total_Member;
	}
	public  void setTotal_Room(int total_Room) {
		Rent_And_Room.total_Room = total_Room;
	}
	public  void setTotal_Member(int total_Member) {
		Rent_And_Room.total_Member = total_Member;
	}

}
