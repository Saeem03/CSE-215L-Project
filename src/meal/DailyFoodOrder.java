package meal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

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
		
		JLabel label = new JLabel("Breakfast");
		label.setBounds(137, 164, 220, 48);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Breakfast");
		label_1.setBounds(137, 223, 220, 48);
		panel.add(label_1);
	}
}
