package memberInfo;
public class Member {
	private String name,id,address,gender,password,fName,mName;;
	private int age;
	private double rent;
	private Bills mBills;
	private boolean isLogin;
	public Member()
	{
		managerInfo.Rent_And_Room.total_Member++;

	}
	public Member(String name, String id, String address, String gender, String password, String fName, String mName,
			int age, double rent, Bills mBills) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.fName = fName;
		this.mName = mName;
		this.age = age;
		this.rent = rent;
		this.mBills = mBills;
		managerInfo.Rent_And_Room.total_Member++;

	}
	public Member(String name, String id, String address, String gender, String password, String fName, String mName,int age, double rent, Bills mBills, boolean isLogin) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.fName = fName;
		this.mName = mName;
		this.age = age;
		this.rent = rent;
		this.mBills = mBills;
		this.isLogin = isLogin;
//		managerInfo.Rent_And_Room.total_Member++;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	public Bills getmBills() {
		return mBills;
	}
	public void setmBills(Bills mBills) {
		this.mBills = mBills;
	}
	public boolean isLogin() {
		return isLogin;
	}
	public void setLogin(boolean isLogin) {
		this.isLogin = isLogin;
	}
	
}

