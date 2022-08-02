import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;
public class Framecl extends JFrame implements ActionListener {

	JButton button ;
	JLabel label;
	
	Framecl(){

		ImageIcon icon = new ImageIcon("download.png");
		ImageIcon icon2 = new ImageIcon("face.png");
		
		label = new JLabel();
		label.setIcon(icon2);
		label.setBounds(150,250,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(this);
		// 2nd option if you do not want to implement actionlistener interface
	//	button.addActionListener(e -> System.out.println("poo"));
	
		
		button.setText("I'm a button!");
		button.setFocusable(false); // this will get rid anoyable box around the butto
		//button.setIcon(icon); // please ignore here my image is big so it occupies full space
		button.setHorizontalAlignment(JButton.CENTER);
		button.setVerticalAlignment(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans",Font.BOLD,20));
		button.setForeground(Color.blue);
		button.setBackground(Color.gray);
		button.setBorder(BorderFactory.createEtchedBorder()); // it creates 3d effect
	//	button.setEnabled(false);
		
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
	if(e.getSource()==button) {
		System.out.println("Poo");
		//button.setEnabled(false);
		label.setVisible(true); // this will make our label visible when we click the button
	}
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
	
	
	
}
