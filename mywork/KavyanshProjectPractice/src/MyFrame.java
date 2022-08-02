import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class MyFrame  extends JFrame implements ActionListener{

	
	JButton button;
	

	
	MyFrame(){
		
		this.setSize(500, 500);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setVisible(true);
		
		//this.getContentPane().setBackground(Color.GREEN);
		
		
		button = new JButton();
		
		button.setBounds(200, 100, 50, 50);
		
		button.setText("This is button");
		
		button.addActionListener(this);
		
		button.setBorder(BorderFactory.createEtchedBorder());
		
		

		
		

	
		this.setFocusable(false);
		
		
		
		
		
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		
		
		
		panel1.setBackground(Color.RED);
		panel2.setBackground(Color.GREEN);
		panel3.setBackground(Color.YELLOW);
		panel4.setBackground(Color.BLUE);
		panel5.setBackground(Color.MAGENTA);
		
		
		this.add(panel1,BorderLayout.NORTH);
		this.add(panel2,BorderLayout.WEST);
		this.add(panel3,BorderLayout.EAST);
		this.add(panel4,BorderLayout.SOUTH);
		this.add(panel5,BorderLayout.CENTER);
		this.setVisible(true);
	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==button) {
		
			System.out.println("I am Pushpa Rani");
			
			button.setEnabled(false);
		
		
		
		
		}
		
		
	}
	
	public static void main(String[] args) {
		
		
		MyFrame frame = new MyFrame();
		
	
	
	
	
	}
	
	
	
}
