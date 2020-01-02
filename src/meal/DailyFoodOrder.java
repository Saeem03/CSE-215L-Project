package meal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JSpinner;

public class DailyFoodOrder extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DailyFoodOrder frame = new DailyFoodOrder();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DailyFoodOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1138, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 68, 1061, 365);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOrderYourMeal = new JLabel("Order Your Meal For Tomorrow :");
		lblOrderYourMeal.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblOrderYourMeal.setBounds(23, 22, 248, 48);
		panel.add(lblOrderYourMeal);
		
		JLabel lblBreakfast = new JLabel("Breakfast");
		lblBreakfast.setBounds(137, 105, 220, 48);
		panel.add(lblBreakfast);
		
		JLabel lblLunch = new JLabel("Lunch");
		lblLunch.setBounds(137, 164, 220, 48);
		panel.add(lblLunch);
		
		JLabel lblDinner = new JLabel("Dinner");
		lblDinner.setBounds(137, 223, 220, 48);
		panel.add(lblDinner);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Normal Items");
		rdbtnNewRadioButton.setBounds(363, 118, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNormalItems = new JRadioButton("Normal Items");
		rdbtnNormalItems.setBounds(363, 177, 109, 23);
		panel.add(rdbtnNormalItems);
		
		JRadioButton rdbtnNormalItems_1 = new JRadioButton("Normal Items");
		rdbtnNormalItems_1.setBounds(363, 236, 109, 23);
		panel.add(rdbtnNormalItems_1);
		
		JRadioButton rdbtnRichItems = new JRadioButton("Rich Items");
		rdbtnRichItems.setBounds(550, 118, 109, 23);
		panel.add(rdbtnRichItems);
		
		JRadioButton radioButton = new JRadioButton("Rich Items");
		radioButton.setBounds(550, 177, 109, 23);
		panel.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Rich Items");
		radioButton_1.setBounds(550, 236, 109, 23);
		panel.add(radioButton_1);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBounds(350, 301, 147, 42);
		panel.add(btnSave);
		
		JButton btnRest = new JButton("Rest");
		btnRest.setBounds(568, 301, 147, 42);
		panel.add(btnRest);
		
		JTextArea txtrNormalItems = new JTextArea();
		txtrNormalItems.setEditable(false);
		txtrNormalItems.setText("\r\nNormal Items : normal rice,vegetable\r\n\tdaal,fish/chicken/egg.\r\nRich Items  : Polao/Fried Rice,\r\n       Beef/Mutton,\rVegetable,daal.\r");
		txtrNormalItems.setBounds(748, 11, 303, 109);
		panel.add(txtrNormalItems);
	}
}
