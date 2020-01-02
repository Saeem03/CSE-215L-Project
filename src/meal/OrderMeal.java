package meal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class OrderMeal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderMeal frame = new OrderMeal();
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
	public OrderMeal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(27, 92, 1012, 378);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOrderYourMeal = new JLabel("Order Your Whole Month's Meal :");
		lblOrderYourMeal.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 18));
		lblOrderYourMeal.setBounds(27, 11, 408, 57);
		contentPane.add(lblOrderYourMeal);
	}
}
