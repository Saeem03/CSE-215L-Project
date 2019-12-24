package memberInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Controller {
	public Controller(String name, String id, String address, String gender, String password,int age, String fName, String mName) throws Exception
	{
		Member m = new Member(name, id, address, gender,password, age,fName,mName);
		m.name=name;
		m.id = id; 
		m.address = address;
		m.gender = gender;
		m.password = password;
		m.fName = fName;
		m.mName = mName;
		m.age = age;
		new SignUp(m);
	}
	public Controller( String id,String password) throws Exception {
		
		tryLogin(id,password);
	}
	public void tryLogin( String id,String password) throws Exception {
		if(id!=null && password!= null)
		{ 
			new Login(id,password);
		}
	}

	
}
