package restarunt_bill_generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro Bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(186, 40, 160, 34);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(68, 133, 77, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Qnty");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(68, 192, 66, 34);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Coffe - Rs.30", "pizza - Rs.150", "cool drink - Rs.50", "ice-cream - Rs.120"}));
		c1.setBounds(229, 143, 166, 24);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(229, 203, 166, 24);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Order");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
				if(item.equals("Coffe - Rs.30"))
				{
					bill=q*30;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("pizza - Rs.150"))
				{
					bill=q*150;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals("cool drink - Rs.50"))
				{
					bill=q*50;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
				else if(item.equals( "ice-cream - Rs.120"))
				{
					bill=q*120;
					JOptionPane.showMessageDialog(btnNewButton, "Hello \n Selected item:"+item+"\n Qnty: "+q+" \n your bill:"+bill);
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(163, 303, 101, 34);
		frame.getContentPane().add(btnNewButton);
		frame.setBackground(Color.CYAN);
		frame.setBounds(100, 100, 517, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
