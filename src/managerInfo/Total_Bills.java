package managerInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Total_Bills {
	private  static double electricity_Bill;
	private  static double gas_Bill;
	private  static double water_Bill;
	private  static double internet_Bill;
	private  static double houseKeeper_Charge;
	private  static double per_head_electricity_Bill;
	private  static double per_head_gas_Bill;
	private  static double per_head_water_Bill;
	private  static double per_head_internet_Bill;
	private  static double per_head_houseKeeper_Charge;
	private HashMap <String,Double> list;
	private HashMap<String,Double> recordedList = new HashMap<>();
	Total_Bills() throws InterruptedException, IOException{
		readRecord();
		setTotal();
		this.readRecord();
		this.MakeList();
	}
	
	public  synchronized  void MakeList() {
		list = new HashMap<>();
		list.put("electricity_Bill", electricity_Bill);
		list.put("gas_Bill", gas_Bill);
		list.put("water_Bill", water_Bill);
		list.put("internet_Bill", internet_Bill);
		list.put("houseKeeper_Charge", houseKeeper_Charge);
		list.put("per_head_electricity_Bill", per_head_electricity_Bill);
		list.put("per_head_gas_Bill", per_head_gas_Bill);
		list.put("per_head_water_Bill",per_head_water_Bill);
		list.put("per_head_internet_Bill", per_head_internet_Bill);
		list.put("per_head_houseKeeper_Charge", per_head_houseKeeper_Charge);
		
		}

	public  synchronized void saveRecord() throws IOException {
		
		FileWriter x=new FileWriter("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\TotalBills.txt");
		MakeList();
		x.write(this.toString(list));
		//System.out.println("Writting Successful");
		x.close();

	}
	public synchronized void readRecord() 
	{  
		Scanner scan;
		try {
			scan = new Scanner(new FileReader("D:\\eclipse-workspace\\Final Project\\Records\\Managers\\TotalBills.txt"));
			while(scan.hasNext())
				{
				recordedList.put(scan.nextLine(),Double.parseDouble(scan.nextLine().trim()));
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
		
		electricity_Bill = recordedList.get("electricity_Bill");
		gas_Bill = recordedList.get("gas_Bill");
		water_Bill = recordedList.get("water_Bill");
		internet_Bill = recordedList.get("internet_Bill");
		houseKeeper_Charge = recordedList.get("houseKeeper_Charge");
		per_head_electricity_Bill = recordedList.get("per_head_electricity_Bill");
		per_head_gas_Bill = recordedList.get("per_head_gas_Bill");
		per_head_water_Bill = recordedList.get("per_head_water_Bill");
		per_head_internet_Bill = recordedList.get("per_head_internet_Bill");
		per_head_houseKeeper_Charge = recordedList.get("per_head_houseKeeper_Charge");
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
		Total_Bills.houseKeeper_Charge = houseKeeper_Charge;
	}
	
	public double perHeadElectricityBills(int x) throws ArithmeticException
	{
		return electricity_Bill/x;
	}
	public double perHeadGasBills(int x) throws ArithmeticException
	{
		return gas_Bill/x;
	}
	public static void setPer_head_electricity_Bill(double per_head_electricity_Bill) {
		Total_Bills.per_head_electricity_Bill = per_head_electricity_Bill;
	}

	public static void setPer_head_gas_Bill(double per_head_gas_Bill) {
		Total_Bills.per_head_gas_Bill = per_head_gas_Bill;
	}

	public static void setPer_head_water_Bill(double per_head_water_Bill) {
		Total_Bills.per_head_water_Bill = per_head_water_Bill;
	}

	public static void setPer_head_internet_Bill(double per_head_internet_Bill) {
		Total_Bills.per_head_internet_Bill = per_head_internet_Bill;
	}

	public static void setPer_head_houseKeeper_Charge(double per_head_houseKeeper_Charge) {
		Total_Bills.per_head_houseKeeper_Charge = per_head_houseKeeper_Charge;
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
	public HashMap<String, Double> getList() {
		return list;
	}


	public void setList(HashMap<String, Double> list) {
		this.list = list;
	}


	public HashMap<String, Double> getRecordedList() {
		return recordedList;
	}


	public void setRecordedList(HashMap<String, Double> recordedList) {
		this.recordedList = recordedList;
	}


	public  void setElectricity_Bill(double electricity_Bill) {
		Total_Bills.electricity_Bill = electricity_Bill;
	}


	public  void setGas_Bill(double gas_Bill) {
		Total_Bills.gas_Bill = gas_Bill;
	}


	public  void setWater_Bill(double water_Bill) {
		Total_Bills.water_Bill = water_Bill;
	}


	public  void setInternet_Bill(double internet_Bill) {
		Total_Bills.internet_Bill = internet_Bill;
	}

}