package memberInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Login {
	static boolean isLogin=false;
	 boolean allowLogin=false;
	 String status="Member";
	Login(){};
	Login(boolean x)
	{
		allowLogin=x;
	}
	Login(String id , String password,String status) throws Exception{
		this.status=status;
		login(id,password);
		if(allowLogin)
			JOptionPane.showMessageDialog(null, "Login Successfull");
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean login(String id,String password)  throws Exception
	{
		Boolean isLogin=false;
		Scanner x;
		int i=0;
		try {
			x = new  Scanner(new FileReader(".\\Records\\Managers\\"+status+"'s User_Password.txt"));
			System.out.println(".\\Records\\Managers\\"+status+"'s User_Password.txt");
			String s;
			System.out.println("input id ="+id);
			System.out.println("input password ="+password);
			System.out.println("Status :"+status);
			while(x.hasNext())
			{
				s=x.nextLine();
				if(s.trim().equals(id) || s.trim().equals(password) )
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
			e1.printStackTrace();
		}
		return isLogin;
	}
		

}
