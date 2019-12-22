package memberInfo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class SignUpHandler implements ActionListener{
	private String fileName;
	void SetFileName(String s)
	{
		this.fileName=s;
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("SignUp"))
		{
			System.out.println("Clicked");
			if(fileName!=null)
				try {
				FileWriter x = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\"+fileName+".txt");
				x.close();
				FileWriter y = new FileWriter("D:\\eclipse-workspace\\Project\\Records\\Member\\User_Password.txt",true);
				x.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			else System.out.println("No entry possible");
		}
		
	}

}
