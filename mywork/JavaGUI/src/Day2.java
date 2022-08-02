
	import java.awt.Color;
		import java.awt.Font;

		import javax.swing.BorderFactory;
		import javax.swing.ImageIcon;
		import javax.swing.JFrame;
		import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	
			
			
			
			
			Border border = BorderFactory.createLineBorder(Color.red,4);
			
			JFrame frame = new JFrame(); // an object of Jframe class


		    frame.setSize(500,500);
			frame.setTitle("Expense manager");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 3 options are available either nothing, exit or hide
			frame.setResizable(false);
			
			
			ImageIcon image = new ImageIcon("download.png");
			frame.setIconImage(image.getImage());
		 	
			frame.getContentPane().setBackground(Color.GREEN);
			

			
			// we also can write frame.getConentPane().setBackground(new Color(255,0,0))
			
			JLabel label = new JLabel();
			label.setForeground(new Color(255,0,0)); // THIS STATEMENT STES BACKGROUND COLOR
			label.setFont(new Font("MV Boli",Font.BOLD,20));
			label.setText("Welcome! This is Expense Manager");
			label.setIcon(image);
			label.setHorizontalAlignment(JLabel.CENTER);
		    label.setVerticalAlignment(JLabel.CENTER);
		    label.setIconTextGap(-25);// set gap of text to image

		label.setBorder(border);
		frame.add(label);
		frame.setVisible(true);



// the below given code belongs to day 2

		frame.setLayout(null);
		label.setBounds(0,0,370,370); 


		// the given pack function is used to completely fit the photograph inside the background even if we decide to resize it 
		// make sure before using the pack method u use frame.add(label) otherwise it does not work
		
	//frame.pack();
		
		
		
		
		
		// JPanel class
		
	JPanel redpanel = new JPanel();
		
		redpanel.setBackground(Color.red);
		
		

		
		










			
			
		}
		

	}


