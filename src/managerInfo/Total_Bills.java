package managerInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Total_Bills {
	Thread thread; 
	private  static double electricity_Bill;
	private  static double gas_Bill;
	private  static double water_Bill;
	private  static double internet_Bill;
	private  static double houseKeeper_Charge;
	HashMap <String,Double> list;
	private HashMap<String,Double> recordedList = new HashMap<>();
	
	Total_Bills() throws InterruptedException, IOException{
		readRecord();
		thread = new Thread(readRecord());
		Thread.sleep(1);
		run();
		thread.start();
		setTotal();
		this.MakeList();
	}
	
	public  void setElectricity_Bill(double electricity) {
		this.electricity_Bill = electricity;
	}
	public  void setGas_Bill(double gas_Bill) {
		this.gas_Bill = gas_Bill;
	}
	public  void setWater_Bill(double water_Bill) {
		this.water_Bill = water_Bill;
	}
	public  void setInternet_Bill(double internet_Bill) {
		this.internet_Bill = internet_Bill;
	}
	public  double getElectricity_Bill() {
		return electricity_Bill;
	}
	public  double getWater_Bill() {
		return water_Bill;
	}
	public  double getInternet_Bill() {
		return internet_Bill;
	}
	public  double getGas_Bill() {
		return gas_Bill;
	}
	public  double getHouseKeeper_Charge() {
		return houseKeeper_Charge;
	}
	
	public  void setHouseKeeper_Charge(double houseKeeper_Charge) {
		this.houseKeeper_Charge = houseKeeper_Charge;
	}
	
	public double perHeadElectricityBills(int x) throws ArithmeticException
	{
		return electricity_Bill/x;
	}
	public double perHeadGasBills(int x) throws ArithmeticException
	{
		return gas_Bill/x;
	}
	public double perHeadWaterBills(int x) throws ArithmeticException
	{
		return water_Bill/x;
	}
	public double perHeadInternetBills(int x) throws ArithmeticException
	{
		return internet_Bill/x;
	}
	public double perHeadHousekeeperCharge(int x) throws ArithmeticException
	{
		return houseKeeper_Charge/x;
	}
	public  synchronized  void MakeList() {
		list = new HashMap<>();
		list.put("electricity_Bill", electricity_Bill);
		list.put("gas_Bill", gas_Bill);
		list.put("water_Bill", water_Bill);
		list.put("internet_Bill", internet_Bill);
		list.put("houseKeeper_Charge", houseKeeper_Charge);
		
		}
	public String toString(HashMap<String,Double> a)
	{
		String s="";
		for(String i : a.keySet())
		{
			s+=i+"\n"+a.get(i)+"\n";
		}
		return s;
		
	}
	public void saveRecord() throws IOException {
		
		FileWriter x=new FileWriter("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\TotalBills.txt");
		MakeList();
		x.write(this.toString(list));
		System.out.println("Writting Successful");
		x.close();

	}
	public Runnable readRecord() 
	{  
		Scanner scan;
		try {
			scan = new Scanner(new FileReader("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\TotalBills.txt"));
			while(scan.hasNext())
				{
				
				recordedList.put(scan.nextLine(),Double.parseDouble(scan.nextLine().trim()));
				System.out.println(electricity_Bill+"  "+gas_Bill  +"  "+ water_Bill +"  "+internet_Bill+"  "+houseKeeper_Charge);

				
				continue;
				}
		} catch (FileNotFoundException e1) {
			System.out.println("Record listing was not complete");
		}
		try{
			setTotal();
		}
		catch(Exception e1)
		{
			System.out.println("Total Set Didn't Worked");
		}
		return null;
	}
	public void run(){
		do
		{
//			System.out.println(electricity_Bill+"  "+gas_Bill  +"  "+ water_Bill +"  "+internet_Bill+"  "+houseKeeper_Charge);
			this.MakeList();
			this.readRecord();
			System.out.println(this.toString(recordedList));
			
		}
		while(thread.isAlive());
	}
	public synchronized void  setTotal()
	{
		
		electricity_Bill = recordedList.get("electricity_Bill");
		gas_Bill = recordedList.get("gas_Bill");
		water_Bill = recordedList.get("water_Bill");
		internet_Bill = recordedList.get("internet_Bill");
		houseKeeper_Charge = recordedList.get("houseKeeper_Charge");
	}
}