package memberInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class LoginController {
	String id,password;
	public LoginController( String id,String password) {
		super();
		this.id = id;
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	
	public boolean login()  throws Exception
	{
		Boolean isLogin=false;
		Scanner x;
		int i=0;
		try {
			x = new  Scanner(new FileReader("D:\\eclipse-workspace\\Project\\Records\\Member\\Member's User_Password.txt"));
			String s;
			System.out.println("input id ="+this.id);
			System.out.println("input password ="+this.password);
			while(x.hasNext())
			{
				s=x.nextLine();
				System.out.println(s);
				if(s.trim().equalsIgnoreCase(id) || s.trim().equalsIgnoreCase(password) ) {
					i++;
					if(i==2)
					{
						System.out.println("record Found");
						break;
					}
				}
				else i=0;
			}
			if(i==2)
			{
				isLogin=true;
			}
			else System.out.println("Not found");
		} catch (FileNotFoundException e1) {
		}
		System.out.println(i);
		return isLogin;

	}
}
