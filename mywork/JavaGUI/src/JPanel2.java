import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon icon = new ImageIcon("download2.png");
		
		JLabel label = new JLabel();
		label.setText("Hi jojnzxjbxjinixckxcojbo");
		label.setIcon(icon);
	
				
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(250,0,250,250);
		
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
		
		JFrame frame = new JFrame();
		
		
		frame.setSize(750,750);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
		redpanel.add(label); // makes apper the image in redpanel
		
		
		
	}

}
