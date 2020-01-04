package memberInfo;

import java.io.File;
import java.io.FileWriter;

public class SignUp {
	static boolean  signUp=false;
	SignUp(Member m ) throws Exception
	{
		save(m);
	}

	public void save(Member m)  throws Exception
	{
		File f = new File(".\\Records\\Member\\"+m.getId()+".txt");
		if(f.exists() && f.isDirectory()) { 
			System.out.println("Already Signed up");
			signUp=true;
			return;

		}
		FileWriter y = new FileWriter(".\\Records\\Managers\\Member's User_Password.txt",true);
		y.write(m.getId()+"\n"+m.getPassword()+"\n");
		y.close();
		FileWriter z = new FileWriter(".\\Records\\Managers\\Member's Emails.txt",true);
		z.write(m.getEmail());
		z.write("\n");
		z.close();
		String s = m.getName()+"\n"+m.getId()+"\n"+m.getfName()+"\n"+m.getEmail()+"\n"+m.getmName()+"\n"+m.getAddress()+"\n"+m.getAge()+"\n"+m.getGender()+"\n"+m.getPassword()+"\n";
		FileWriter x = new FileWriter(".\\Records\\Member\\"+m.getId()+".txt");
		x.write(s);
		System.out.println("File Created");
		signUp=true;
		x.close();
		new MemberProfGUI(m.getId());
		System.out.println("Working");

	}


}
