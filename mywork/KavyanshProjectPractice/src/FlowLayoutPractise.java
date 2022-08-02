import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	JFrame frame = new JFrame();
	
	frame.setLayout(new FlowLayout());
	
	frame.add(new Button("1"));
	frame.add(new Button("2"));
	frame.add(new Button("3"));
	frame.add(new Button("4"));
	frame.add(new Button("5"));
	frame.add(new Button("6"));
	frame.add(new Button("7"));
	frame.add(new Button("8"));
	frame.add(new Button("9"));

	
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(500,500);
	frame.setVisible(true);
	
	
	
	
	
	
	
	
	}

}
