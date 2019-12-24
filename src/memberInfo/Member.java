package memberInfo;


public class Member {
	String name,id,address,gender,password,fName,mName;;

	int age;
	public Member(String name, String id, String address, String gender, String password, int age) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.age = age;
		
	}
	public Member(String name, String id, String address, String gender, String password,int age, String fName, String mName) {
		this.name = name;
		this.id = id; 
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.fName = fName;
		this.mName = mName;
		this.age = age;
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
	public Member(String name, String id, String gender, String password, int age) {
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.password = password;
		this.age = age;
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
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

