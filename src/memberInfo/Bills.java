package memberInfo;

public class Bills {
	private double electricity_Bill;
	private double gas_Bill;
	private double water_Bill;
	private double internet_Bill;
	public Bills(double electricity_Bill, double gas_Bill, double water_Bill, double internet_Bill) {
		this.electricity_Bill = electricity_Bill;
		this.gas_Bill = gas_Bill;
		this.water_Bill = water_Bill;
		this.internet_Bill = internet_Bill;
	}
	public double getElectricity_Bill() {
		return electricity_Bill;
	}
	public void setElectricity_Bill(double electricity_Bill) {
		this.electricity_Bill = electricity_Bill;
	}
	public double getGas_Bill() {
		return gas_Bill;
	}
	public void setGas_Bill(double gas_Bill) {
		this.gas_Bill = gas_Bill;
	}
	public double getWater_Bill() {
		return water_Bill;
	}
	public void setWater_Bill(double water_Bill) {
		this.water_Bill = water_Bill;
	}
	public double getInternet_Bill() {
		return internet_Bill;
	}
	public void setInternet_Bill(double internet_Bill) {
		this.internet_Bill = internet_Bill;
	}
	
	

}
