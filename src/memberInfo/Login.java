package memberInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {
	boolean isLogin=false;
	boolean allowLogin=false;
	Login(){};
	Login(boolean x)
	{
		allowLogin=x;
	}
	Login(String id , String password) throws Exception{
		login(id,password);
		if(allowLogin)
			JOptionPane.showMessageDialog(null, "Login Successfull");


	}

	public boolean login(String id,String password)  throws Exception
	{
		Boolean isLogin=false;
		Scanner x;
		int i=0;
		try {
			x = new  Scanner(new FileReader("D:\\eclipse-workspace\\Project\\Records\\Member\\Member's User_Password.txt"));
			String s;
			System.out.println("input id ="+id);
			System.out.println("input password ="+password);
			while(x.hasNext())
			{
				s=x.nextLine();
				System.out.println(s);
				if(s.trim().equalsIgnoreCase(id) || s.trim().equalsIgnoreCase(password) )
				{
					i++;
					if(i==2)
					{
						System.out.println("record Found");
						allowLogin = true;
						break;
					}
					allowLogin = false;
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
		System.out.println(isLogin);
		return isLogin;
	}

}
