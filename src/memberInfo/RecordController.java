package memberInfo;

import java.io.FileWriter;
import java.io.IOException;

public class RecordController {
	String name,id,address,gender,password,fName,mName;;
	public RecordController(String name, String id, String address, String gender, String password, String fName, String mName,
			int age) {
		super();
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

	int age;
	public RecordController(String name, String id, String address, String gender, String password, int age) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.gender = gender;
		this.password = password;
		this.age = age;
	}
	public RecordController(String name, String id, String gender, String password, int age) {
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
	
	public void Save()  throws Exception
	{
		
		String s = name+" ,"+id+" ,"+" ,"+password+" ,"+gender+" ,"+age+" ,"+address+"\n";
			FileWriter y = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\Member's User_Password.txt",true);
			y.write(name+"\n"+password+"\n");
			y.close();
			FileWriter x = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\"+id+".txt");
			x.write(s);
			x.close();
	}
}
