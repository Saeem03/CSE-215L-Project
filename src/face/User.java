package face;

public class User {
	private int age;
	private String Id;
	private String name;
	private String password;
	private String gender;
	private String address;
	private String country;
	private Status[] userStatus;
	public User() {};
	public User(String Id,String name,String password,String gender,String country) {
		this.Id=Id;
		this.name=name;
		this.password= password;
		this.gender = gender;
		this.country=country;
	}
	public User( String id, String name, String password, String gender,int age, String address,String country) {
		this.age = age;
		Id = id;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.address = address;
		this.country=country;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

}
