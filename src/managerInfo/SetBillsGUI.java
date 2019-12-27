//package managerInfo;
//
//import java.awt.Button;
//import java.awt.Color;
//import java.awt.Component;
//import java.awt.TextField;
//import java.io.FileNotFoundException;
//
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class SetBillsGUI extends JFrame {
//	TextField t;
//	JPanel panel;
//	Button b1;
//	Thread x;
//	Thread y;
//	SetBillsGUI() throws InterruptedException{
//		panel = new JPanel();
//		t = new TextField("HI there");
//		panel.add(t);
//		panel.setSize(300,300);
//		panel.setBounds(50,50,300,300);
//		panel.setBackground(Color.red);
//		b1 = new Button("Click");
//		panel.add(b1);
//		add(panel);
//		
//		setBackground(Color.gray);
//		setLayout(null);
//		setVisible(true);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setSize(800,700);
//		
//	}
//	
//
//	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
//		System.out.println("HI");
//		new SetBillsGUI();
//		Total_Bills x = new Total_Bills();
//		System.out.println(x.toString(x.list));
//
//	}
//	
//}