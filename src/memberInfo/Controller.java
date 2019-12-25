package memberInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Controller {
	public Controller() throws Exception
	{
		
	}
	public void tryLogin( String id,String password) throws Exception {
		if(id!=null && password!= null)
		{ 
			new Login(id,password);
		}
	}
	public void trySignUp( String name, String id, String address, String gender, String password,int age, String fName, String mName) throws Exception {
		if(id!=" " && password!= " ")
		{ 
			Member m = new Member();
			m.setName(name);
			m.setId(id); 
			m.setAddress( address);
			m.setGender (gender);
			m.setPassword (password);
			m.setfName(fName);
			m.setmName(mName);
			m.setAge(age);
			new SignUp(m);
		}
	}

	
}
