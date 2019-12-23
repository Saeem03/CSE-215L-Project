package memberInfo;

import javax.swing.JOptionPane;

public class NecessityMeetException extends Exception {
	NecessityMeetException()
	{
		JOptionPane.showMessageDialog(null, "Please Print Those ( * ) Marked Fields");
	}
}
