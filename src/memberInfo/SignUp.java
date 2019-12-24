package memberInfo;

import java.io.FileWriter;

public class SignUp {
	SignUp(Member m ) throws Exception
	{
		save(m);
	}
	
	public void save(Member m)  throws Exception
	{
		
		String s = m.name+" ,"+m.id+" ,"+" ,"+m.password+" ,"+m.gender+" ,"+m.age+" ,"+m.address+"\n";
			FileWriter y = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\Member's User_Password.txt",true);
			y.write(m.name+"\n"+m.password+"\n");
			y.close();
			FileWriter x = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\"+m.id+".txt");
			x.write(s);
			x.close();
	}
	

}
