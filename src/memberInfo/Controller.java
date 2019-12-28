package memberInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class Controller {
	private String id;
	public  boolean isLogin=true;
	private Member m = new Member();
	public Controller() throws Exception
	{
		
		
	}
	public void tryLogin( String id,String password) throws Exception {
		
		Login x =new Login(id,password);
		if(x.allowLogin)
		{
			System.out.println("Login works");
			isLogin=true;
		}
		System.out.println(isLogin);
	}
	public void trySignUp( String name, String id, String address, String gender, String password,int age, String fName, String mName) throws Exception {
		if(id!=" " && password!= " ")
		{ 
			
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
