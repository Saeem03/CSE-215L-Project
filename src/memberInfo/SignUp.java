package memberInfo;

import java.io.File;
import java.io.FileWriter;

public class SignUp {
	SignUp(Member m ) throws Exception
	{
		save(m);
	}
	
	public void save(Member m)  throws Exception
	{
		File f = new File("D:\\eclipse-workspace\\Project\\Records\\Member\\"+m.getId()+".txt");
		if(f.exists() && !f.isDirectory()) { 
			System.out.println("Already Signed up");
			throw new SignUpException();
		}
		FileWriter y = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\Member's User_Password.txt",true);
			y.write(m.getName()+"\n"+m.getPassword()+"\n");
			y.close();
			String s = m.getName()+"\n"+m.getId()+"\n"+m.getfName()+"\n"+m.getmName()+"\n"+m.getAddress()+"\n"+m.getAge()+"\n"+m.getGender()+"\n"+m.getPassword()+"\n";
			FileWriter x = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\"+m.getId()+".txt");
			x.write(s);
			System.out.println("File Created");
			x.close();
	}
	

}
