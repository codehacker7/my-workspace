import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;





import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

//import sun.net.www.URLConnection;

public class MyFrame implements ActionListener  {
	
	JButton startbutton;
	JTextField paneltextfield;
	JFrame frame;
	JTextField expensetextfield;		
	JTextField expensetextfield1 ;
	JTextField expensetextfield2;
	JButton submitbutton  = new JButton("Submit");
	JLabel blacklabel = new JLabel();			
	JLabel blackcompanion = new JLabel();
	JButton loginpage = new JButton("login page");
	JTextField recieptfield = new JTextField(); 
	JButton  choosefile = new JButton("Choose File");
	JComboBox date,month,year;
	JLabel recieptlabel = new JLabel();

	 
	
	
	double price=0;
	String expense;
	
	

	
	MyFrame()  {
		
		
	String[] dates=  { "1", "2", "3", "4", "5","6", "7", "8", "9", "10", "11", "12", "13", "14", "15",  "16", "17", "18", "19", "20",
 "21", "22", "23", "24", "25",   "26", "27", "28", "29", "30","31" };
	
	
	String[] months = { "Jan", "feb", "Mar", "Apr","May", "Jun", "July", "Aug", "Sep", "Oct", "Nov", "Dec" };

	
	String[] years  = {  "2022", "2023","2024", "2025", "2026", "2027","2028", "2029", 	"2030", "2031","2032", "2033", "2034", "2035",
 "2036", "2037", "2038", "2039", "2040", "2041", "2042", "2043", "2044" };

	
	
		
		Border border = BorderFactory.createLineBorder(Color.BLUE,4);

		JTextField textfield= new JTextField();
		
		JLabel label = new JLabel();
		
		textfield.setBackground(Color.BLACK);
		textfield.setBounds(0,0,750,150);
		textfield.setOpaque(true);
		textfield.setFont(new Font("MV BOLI",Font.BOLD,25));
		textfield.setText("Manage your Expenses");
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setForeground(Color.YELLOW);
		textfield.setFocusable(false);
		textfield.setLayout(null);
		
		label.setBounds(250,100, 250, 30);
		label.setBackground(Color.BLACK);
		label.setFont(new Font("MV BOLI",Font.PLAIN,15));
		
		
		label.setText("--Kavyansh and Pranjal");
		//label.setHorizontalTextPosition(JLabel.BOTTOM);

		label.setForeground(Color.YELLOW);
		label.setOpaque(true);
		
		
	
		// The code provided below is used to create a panel in the center 	
		
		JPanel panel = new JPanel();
		panel.setBounds(200, 350, 300, 200);
		panel.setBackground(Color.BLACK);
		
		JLabel label1 = new JLabel();
		
		
		label1.setBounds(250, 280, 10, 20);
		label1.setForeground(Color.YELLOW);
		label1.setFont(new Font("MV BOLI",Font.PLAIN,15));
		label1.setText("Enter your id here  ");
	
		
		
		
		// now it is the time to add JButton in the center
		
		paneltextfield  = new JTextField();
		paneltextfield.setBounds(280, 400, 150,30);
		paneltextfield.setBorder(border);
		
		
		 expensetextfield = new JTextField();
		 expensetextfield.setBounds(70, 240, 300, 40);
		 
		 
		 expensetextfield1 = new JTextField();
		expensetextfield1.setBounds(70,300, 100, 30);
		
		
		expensetextfield2 = new JTextField();
		expensetextfield2.setBounds(250, 300, 100, 30);
		
		
	  	date = new JComboBox(dates);
        date.setFont(new Font("Arial", Font.PLAIN, 15));
        date.setSize(70, 20);
        date.setLocation(250, 305);
  
        
        
        
        month = new JComboBox(months);
        month.setFont(new Font("Arial", Font.PLAIN, 15));
        month.setSize(100, 20);
        month.setLocation(300, 305);
       
        year = new JComboBox(years);
        year.setFont(new Font("Arial", Font.PLAIN, 15));
        year.setSize(100, 20);
        year.setLocation(380, 305);
       
     
        

		
		// now it is the time to add  JButton
		
		startbutton = new JButton("Start here !");
		startbutton.setFocusable(false);
		startbutton.setBackground(Color.YELLOW);
		startbutton.setBounds(280, 460, 150, 30);
		startbutton.setForeground(Color.BLACK);
		startbutton.addActionListener(this);
		submitbutton.addActionListener(this);
		
		date.addActionListener(this);
		month.addActionListener(this);
		year.addActionListener(this);
		loginpage.addActionListener(this);
		choosefile.addActionListener(this);
		// now it is the time to add a piggy to the screen 
		
		ImageIcon image = new ImageIcon("javapiggy.png");
	
		
		JLabel piggylabel = new JLabel();

		piggylabel.setBounds(280,600,150,0);  // we need to fix the size of image of piggy
		piggylabel.setIcon(image);
		
		
		
		
		// JFrame should be kept in the bottom line of the code as frame.visible is the end line to update the code
		
		
		frame = new JFrame();
	
		
		frame.setTitle("Expense Manager");
		frame.setResizable(false);
		frame.setSize(750,750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setLayout(null);
		
		frame.add(piggylabel);
		//frame.add(label);
		textfield.add(label);
		
		frame.add(startbutton);	
		frame.add(textfield);
		frame.add(paneltextfield);
		frame.add(panel);
		panel.add(label1);

		
		
		
		
		frame.setVisible(true);	
	   
		
		
		
		
	
	}
		
		
		
		
		

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String id ="";


		
		if(e.getSource()==startbutton) {
			JFrame newframe = new JFrame();
			newframe.setTitle("Expense Manager");
			newframe.setResizable(false);
			newframe.setSize(750,750);
			newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newframe.getContentPane().setBackground(Color.ORANGE);
			newframe.setLayout(null);
		
			id = paneltextfield.getText();

		
			JTextField textfield= new JTextField();
			
			JLabel label = new JLabel();
			
			textfield.setBackground(Color.BLACK);
			textfield.setBounds(0,0,750,150);
			textfield.setOpaque(true);
			textfield.setFont(new Font("MV BOLI",Font.BOLD,25));
			textfield.setText("Manage your Expenses");
			textfield.setHorizontalAlignment(JTextField.CENTER);
			textfield.setForeground(Color.YELLOW);
			textfield.setFocusable(false);
			textfield.setLayout(null);
			
			label.setBounds(250,100, 250, 30);
			label.setBackground(Color.BLACK);
			label.setFont(new Font("MV BOLI",Font.PLAIN,15));
			
			
			label.setText("--Kavyansh and Pranjal");
			//label.setHorizontalTextPosition(JLabel.BOTTOM);

			label.setForeground(Color.YELLOW);
			label.setOpaque(true);
			
			
			
			JLabel newlabel = new JLabel();
			
			newlabel.setBounds(310, 150, 250, 30);
			newlabel.setFont(new Font("MV BOLI",Font.BOLD,20));
			newlabel.setText("User: "+id); // note here that we need to add two buttons for login page and record history
			
			
			
			JLabel expenselabel = new JLabel();
			
			expenselabel.setBounds(10,240,300,40);
			expenselabel.setFont(new Font("MV BOLI",Font.BOLD,13));
			expenselabel.setForeground(Color.RED);
			expenselabel.setText("Expense: ");
			
			

			JLabel dollarlabel = new JLabel();
			
			dollarlabel.setBounds(25, 295,300, 40);
			dollarlabel.setForeground(Color.RED);
			dollarlabel.setFont(new Font("MV BOLI",Font.BOLD,13));
			dollarlabel.setText("Price: ");
			
			
			
			JLabel datelabel = new JLabel();
			
			datelabel.setBounds(200,300,100,30);
			datelabel.setForeground(null);
			datelabel.setText("Date: ");
			
			
			submitbutton.setBounds(100, 370, 100, 30);
			submitbutton.setFont(new Font("MV BOLI",Font.ITALIC,20));
			submitbutton.setForeground(Color.BLACK);
			
			submitbutton.setBackground(Color.BLUE);
			submitbutton.setOpaque(true);
			
			
			newframe.add(dollarlabel);
			newframe.add(expenselabel);
			newframe.add(submitbutton);
			//newframe.add(expensetextfield2);			
			newframe.add(datelabel);
			newframe.add(expensetextfield1);
			newframe.add(expensetextfield);
			newframe.add(newlabel);
			textfield.add(label);
			newframe.add(textfield);
			
			
			
			newframe.add(date);
			newframe.add(month);
			newframe.add(year);	
			
			
			
			
		//	newlabel.setBounds(310, 150, 250, 30);
			
			loginpage.setBounds(110, 150, 150, 30);
			loginpage.setForeground(Color.BLACK);
			loginpage.setFocusable(false);
			loginpage.setFont(new Font("MV BOLI",Font.ROMAN_BASELINE,20));
			loginpage.setText("Login Page");
			
			newframe.add(loginpage);
			
			
			recieptlabel.setBounds(10, 450, 500, 30);
			recieptlabel.setForeground(Color.black);
			recieptlabel.setFont(new Font("Arial",Font.BOLD,20));
			recieptlabel.setText("Or Upload your reciepts and recoginize text by us");
						
			
			newframe.add(recieptlabel);			
			
			
			
			recieptfield.setBounds(103, 510, 300, 40);  // this is adding a textfield to our java program
			
			
			choosefile.setBounds(10, 510, 100, 40);
			choosefile.setFont(new Font("Arial",Font.ITALIC,15));
			
			
			
			
			
			newframe.add(choosefile);
			newframe.add(recieptfield)
;			
			
			
			newframe.setVisible(true);
			
			
			
}
		
		
		if(e.getSource()==choosefile) {
			
			
			
			JFileChooser fileChooser = new JFileChooser();
			
		int userresponse =	fileChooser.showOpenDialog(null);
			
		if(userresponse == JFileChooser.APPROVE_OPTION) {
			
			JFrame newframe = new JFrame();
			newframe.setTitle("Expense Manager");
			newframe.setResizable(false);
			newframe.setSize(750,750);
			newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newframe.getContentPane().setBackground(Color.ORANGE);
			newframe.setLayout(null);
		
			id = paneltextfield.getText();

		
			JTextField textfield= new JTextField();
			
			JLabel label = new JLabel();
			
			textfield.setBackground(Color.BLACK);
			textfield.setBounds(0,0,750,150);
			textfield.setOpaque(true);
			textfield.setFont(new Font("MV BOLI",Font.BOLD,25));
			textfield.setText("Manage your Expenses");
			textfield.setHorizontalAlignment(JTextField.CENTER);
			textfield.setForeground(Color.YELLOW);
			textfield.setFocusable(false);
			textfield.setLayout(null);
			
			label.setBounds(250,100, 250, 30);
			label.setBackground(Color.BLACK);
			label.setFont(new Font("MV BOLI",Font.PLAIN,15));
			
			
			label.setText("--Kavyansh and Pranjal");
			//label.setHorizontalTextPosition(JLabel.BOTTOM);

			label.setForeground(Color.YELLOW);
			label.setOpaque(true);
			
			
			
			JLabel newlabel = new JLabel();
			
			newlabel.setBounds(310, 150, 250, 30);
			newlabel.setFont(new Font("MV BOLI",Font.BOLD,20));
			newlabel.setText("User: "+id); // note here that we need to add two buttons for login page and record history
			
			
			
			JLabel expenselabel = new JLabel();
			
			expenselabel.setBounds(10,240,300,40);
			expenselabel.setFont(new Font("MV BOLI",Font.BOLD,13));
			expenselabel.setForeground(Color.RED);
			expenselabel.setText("Expense: ");
			
			

			JLabel dollarlabel = new JLabel();
			
			dollarlabel.setBounds(25, 295,300, 40);
			dollarlabel.setForeground(Color.RED);
			dollarlabel.setFont(new Font("MV BOLI",Font.BOLD,13));
			dollarlabel.setText("Price: ");
			
			
			
			JLabel datelabel = new JLabel();
			
			datelabel.setBounds(200,300,100,30);
			datelabel.setForeground(null);
			datelabel.setText("Date: ");
			
			
			submitbutton.setBounds(100, 370, 100, 30);
			submitbutton.setFont(new Font("MV BOLI",Font.ITALIC,20));
			submitbutton.setForeground(Color.BLACK);
			
			submitbutton.setBackground(Color.BLUE);
			submitbutton.setOpaque(true);
			
			
			newframe.add(dollarlabel);
			newframe.add(expenselabel);
			newframe.add(submitbutton);
			//newframe.add(expensetextfield2);			
			newframe.add(datelabel);
			newframe.add(expensetextfield1);
			newframe.add(expensetextfield);
			newframe.add(newlabel);
			textfield.add(label);
			newframe.add(textfield);
			
			
			
			newframe.add(date);
			newframe.add(month);
			newframe.add(year);	
			
			
			
			
		//	newlabel.setBounds(310, 150, 250, 30);
			
			loginpage.setBounds(110, 150, 150, 30);
			loginpage.setForeground(Color.BLACK);
			loginpage.setFocusable(false);
			loginpage.setFont(new Font("MV BOLI",Font.ROMAN_BASELINE,20));
			loginpage.setText("Login Page");
			
			newframe.add(loginpage);
			
			
			recieptlabel.setBounds(10, 450, 500, 30);
			recieptlabel.setForeground(Color.black);
			recieptlabel.setFont(new Font("Arial",Font.BOLD,20));
			recieptlabel.setText("Or Upload your reciepts and recoginize text by us");
						
			
			newframe.add(recieptlabel);			
			
			
			
			recieptfield.setBounds(103, 510, 300, 40);  // this is adding a textfield to our java program
			
			
			choosefile.setBounds(10, 510, 100, 40);
			choosefile.setFont(new Font("Arial",Font.ITALIC,15));
			
			
			
			String filename = fileChooser.getSelectedFile().getName();
			
			
			recieptfield.setText(filename);
			
	
			
			
			newframe.add(choosefile);
			newframe.add(recieptfield);			
			
			
			
			
			newframe.setVisible(true);
	
		
		
		
		
		}
		
		}
		
		
		
		
		
		if(e.getSource()==loginpage) {
			
			Border border = BorderFactory.createLineBorder(Color.BLUE,4);

			JTextField textfield= new JTextField();
			
			JLabel label = new JLabel();
			
			textfield.setBackground(Color.BLACK);
			textfield.setBounds(0,0,750,150);
			textfield.setOpaque(true);
			textfield.setFont(new Font("MV BOLI",Font.BOLD,25));
			textfield.setText("Manage your Expenses");
			textfield.setHorizontalAlignment(JTextField.CENTER);
			textfield.setForeground(Color.YELLOW);
			textfield.setFocusable(false);
			textfield.setLayout(null);
			
			label.setBounds(250,100, 250, 30);
			label.setBackground(Color.BLACK);
			label.setFont(new Font("MV BOLI",Font.PLAIN,15));
			
			
			label.setText("--Kavyansh and Pranjal");
			//label.setHorizontalTextPosition(JLabel.BOTTOM);

			label.setForeground(Color.YELLOW);
			label.setOpaque(true);
			
			
		
			// The code provided below is used to create a panel in the center 	
			
			JPanel panel = new JPanel();
			panel.setBounds(200, 350, 300, 200);
			panel.setBackground(Color.BLACK);
			
			JLabel label1 = new JLabel();
			
			
			label1.setBounds(250, 280, 10, 20);
			label1.setForeground(Color.YELLOW);
			label1.setFont(new Font("MV BOLI",Font.PLAIN,15));
			label1.setText("Enter your id here  ");
		
			
			
			
			// now it is the time to add JButton in the center
			
			paneltextfield  = new JTextField();
			paneltextfield.setBounds(280, 400, 150,30);
			paneltextfield.setBorder(border);
			
			
			 expensetextfield = new JTextField();
			 expensetextfield.setBounds(70, 240, 300, 40);
			 
			 
			 expensetextfield1 = new JTextField();
			expensetextfield1.setBounds(70,300, 100, 30);
			
			
			expensetextfield2 = new JTextField();
			expensetextfield2.setBounds(250, 300, 100, 30);
			
			
	       
	     
	        

			
			// now it is the time to add  JButton
			
			startbutton = new JButton("Start here !");
			startbutton.setFocusable(false);
			startbutton.setBackground(Color.YELLOW);
			startbutton.setBounds(280, 460, 150, 30);
			startbutton.setForeground(Color.BLACK);
			startbutton.addActionListener(this);
			submitbutton.addActionListener(this);
			
			date.addActionListener(this);
			month.addActionListener(this);
			year.addActionListener(this);
			loginpage.addActionListener(this);
			// now it is the time to add a piggy to the screen 
			
			ImageIcon image = new ImageIcon("javapiggy.png");
		
			
			JLabel piggylabel = new JLabel();

			piggylabel.setBounds(280,600,150,0);  // we need to fix the size of image of piggy
			piggylabel.setIcon(image);
			
			
			
			
			// JFrame should be kept in the bottom line of the code as frame.visible is the end line to update the code
			
			
			frame = new JFrame();
		
			
			frame.setTitle("Expense Manager");
			frame.setResizable(false);
			frame.setSize(750,750);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setBackground(Color.ORANGE);
			frame.setLayout(null);
			
			frame.add(piggylabel);
			//frame.add(label);
			textfield.add(label);
			
			frame.add(startbutton);	
			frame.add(textfield);
			frame.add(paneltextfield);
			frame.add(panel);
			panel.add(label1);

			
			
			
			
			
			
			frame.setVisible(true);	
		   
			
			
			
			
		}

	
	 if(e.getSource()==submitbutton) {
			
		 try {
			
			 DataOutputStream file = new DataOutputStream(new FileOutputStream("/Users/kavyanshbansal/Desktop/kavyansh.txt"));
		 expense = expensetextfield.getText();
			
			
			try {
			
			price = Double.parseDouble(expensetextfield1.getText());
			
			JFrame newframe = new JFrame();
			newframe.setTitle("Expense Manager");
			newframe.setResizable(false);
			newframe.setSize(750,750);
			newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			newframe.getContentPane().setBackground(Color.ORANGE);
			newframe.setLayout(null);
		
			id = paneltextfield.getText();

		
			JTextField textfield= new JTextField();
			
			JLabel label = new JLabel();
			
			textfield.setBackground(Color.BLACK);
			textfield.setBounds(0,0,750,150);
			textfield.setOpaque(true);
			textfield.setFont(new Font("MV BOLI",Font.BOLD,25));
			textfield.setText("Manage your Expenses");
			textfield.setHorizontalAlignment(JTextField.CENTER);
			textfield.setForeground(Color.YELLOW);
			textfield.setFocusable(false);
			textfield.setLayout(null);
			
			label.setBounds(250,100, 250, 30);
			label.setBackground(Color.BLACK);
			label.setFont(new Font("MV BOLI",Font.PLAIN,15));
			
			
			label.setText("--Kavyansh and Pranjal");
			//label.setHorizontalTextPosition(JLabel.BOTTOM);

			label.setForeground(Color.YELLOW);
			label.setOpaque(true);
			
			
			
			JLabel newlabel = new JLabel();
			
			newlabel.setBounds(310, 150, 250, 30);
			newlabel.setFont(new Font("MV BOLI",Font.BOLD,20));
			newlabel.setText("User: "+id); // note here that we need to add two buttons for login page and record history
			
			
			JLabel expenselabel = new JLabel();
			
			expenselabel.setBounds(10,240,300,40);
			expenselabel.setFont(new Font("MV BOLI",Font.BOLD,13));
			expenselabel.setForeground(Color.RED);
			expenselabel.setText("Expense: ");
			
			

			JLabel dollarlabel = new JLabel();
			
			dollarlabel.setBounds(25, 295,300, 40);
			dollarlabel.setForeground(Color.RED);
			dollarlabel.setFont(new Font("MV BOLI",Font.BOLD,13));
			dollarlabel.setText("Price: ");
			
			
			
			JLabel datelabel = new JLabel();
			
			datelabel.setBounds(200,300,100,30);
			datelabel.setForeground(null);
			datelabel.setText("Date: ");
			
			
			submitbutton.setBounds(100, 370, 100, 30);
			submitbutton.setFont(new Font("MV BOLI",Font.ITALIC,20));
			submitbutton.setForeground(Color.BLACK);
			
			submitbutton.setBackground(Color.BLUE);
			submitbutton.setOpaque(true);
			
			
			newframe.add(dollarlabel);
			newframe.add(expenselabel);
			newframe.add(submitbutton);
			//newframe.add(expensetextfield2);			 // my code is here ***************************************
			newframe.add(datelabel);
			newframe.add(expensetextfield1);
			newframe.add(expensetextfield);
			newframe.add(newlabel);
			textfield.add(label);
			newframe.add(textfield);
			
			
		//	JLabel blacklabel = new JLabel();			
			
		   JPanel panel = new JPanel();
			
			
     		//blacklabel.setBounds(70, 440, 300, 100);
			blacklabel.setBounds(30, 395, 300, 100);
			blacklabel.setForeground(Color.RED);
			blacklabel.setFont(new Font("MV BOLI",Font.ITALIC,30));
			blacklabel.setText("Here is the result");
			
			
			
		
			blacklabel.setFocusable(true);
			blackcompanion.setForeground(Color.YELLOW);
			blackcompanion.setFont(new Font("MV BOLI",Font.ITALIC,20));
			blackcompanion.setText(" , spend "+expensetextfield1.getText()+" $"+" for "+expensetextfield.getText());
			blackcompanion.setVisible(true);
			
			
			JLabel datedone = new JLabel();
			datedone.setForeground(Color.YELLOW);
			datedone.setFont(new Font("MV BOLI",Font.ITALIC,20));
			//datedone.setText("   ");
		//	datedone.setText("Date : "+expensetextfield2.getText());
			
			
			datedone.setText("Date : "+date.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem());
	
			
			
			
			
			
			
			panel.setBounds(10, 500, 750, 100);				
			panel.setBackground(Color.BLACK);
			
			
//			JLabel blackcompanion = new JLabel();
			
//			blackcompanion.setBounds(30, 600, 500, 100);


//			
//			blacklabel.setBackground(Color.BLACK);

//						
//		
//			
			panel.add(datedone);
			panel.add(blackcompanion);
			//newframe.add(blackcompanion);
			newframe.add(panel);
			newframe.add(blacklabel);
			
			newframe.add(date);
			newframe.add(month);
			newframe.add(year);	
			
			loginpage.setBounds(110, 150, 150, 30);
			loginpage.setForeground(Color.BLACK);
			loginpage.setFocusable(false);
			loginpage.setFont(new Font("MV BOLI",Font.ROMAN_BASELINE,20));
			loginpage.setText("Login Page");
			
			newframe.add(loginpage);
			
			
			// we do not need reciept label here because here user is displaying result
			
			
//			recieptlabel.setBounds(10, 450, 500, 30);
//			recieptlabel.setForeground(Color.black);
//			recieptlabel.setFont(new Font("Arial",Font.BOLD,20));
//			recieptlabel.setText("Or Upload your reciepts and recoginize text by us");
//						
//			
//			newframe.add(recieptlabel);			
//			
			
			newframe.setVisible(true);
			
			

			}catch(Exception input) {
				
				
				JFrame newframe = new JFrame();
				newframe.setTitle("Expense Manager");
				newframe.setResizable(false);
				newframe.setSize(750,750);
				newframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				newframe.getContentPane().setBackground(Color.ORANGE);
				newframe.setLayout(null);
			
				id = paneltextfield.getText();

			
				JTextField textfield= new JTextField();
				
				JLabel label = new JLabel();
				
				textfield.setBackground(Color.BLACK);
				textfield.setBounds(0,0,750,150);
				textfield.setOpaque(true);
				textfield.setFont(new Font("MV BOLI",Font.BOLD,25));
				textfield.setText("Manage your Expenses");
				textfield.setHorizontalAlignment(JTextField.CENTER);
				textfield.setForeground(Color.YELLOW);
				textfield.setFocusable(false);
				textfield.setLayout(null);
				
				label.setBounds(250,100, 250, 30);
				label.setBackground(Color.BLACK);
				label.setFont(new Font("MV BOLI",Font.PLAIN,15));
				
				
				label.setText("--Kavyansh and Pranjal");
				//label.setHorizontalTextPosition(JLabel.BOTTOM);

				label.setForeground(Color.YELLOW);
				label.setOpaque(true);
				
				
				
				JLabel newlabel = new JLabel();
				
				newlabel.setBounds(310, 150, 250, 30);
				newlabel.setFont(new Font("MV BOLI",Font.BOLD,20));
				newlabel.setText("User: "+id); // note here that we need to add two buttons for login page and record history
				
				
				
				JLabel expenselabel = new JLabel();
				
				expenselabel.setBounds(10,240,300,40);
				expenselabel.setFont(new Font("MV BOLI",Font.BOLD,13));
				expenselabel.setForeground(Color.RED);
				expenselabel.setText("Expense: ");
				
				

				JLabel dollarlabel = new JLabel();
				
				dollarlabel.setBounds(25, 295,300, 40);
				dollarlabel.setForeground(Color.RED);
				dollarlabel.setFont(new Font("MV BOLI",Font.BOLD,13));
				dollarlabel.setText("Price: ");
				
				
				
				JLabel datelabel = new JLabel();
				
				datelabel.setBounds(200,300,100,30);
				datelabel.setForeground(null);
				datelabel.setText("Date: ");
				
				
				submitbutton.setBounds(100, 370, 100, 30);
				submitbutton.setFont(new Font("MV BOLI",Font.ITALIC,20));
				submitbutton.setForeground(Color.BLACK);
				
				submitbutton.setBackground(Color.BLUE);
				submitbutton.setOpaque(true);
				
				
				newframe.add(dollarlabel);
				newframe.add(expenselabel);
				newframe.add(submitbutton);
			//	newframe.add(expensetextfield2);			************************************************
				newframe.add(datelabel);
				newframe.add(expensetextfield1);
				newframe.add(expensetextfield);
				newframe.add(newlabel);
				textfield.add(label);
				newframe.add(textfield);
				
				
				JLabel errorlabel = new JLabel();			
				
					errorlabel.setBounds(20,500,800,100);
					//errorlabel.setOpaque(true);
					errorlabel.setFont(new Font("MV BOLI",Font.ITALIC,30));
					errorlabel.setText("Error : \n "+"Invalid Input In price field");
					errorlabel.setForeground(Color.RED);
					errorlabel.setVisible(true);
					newframe.add(errorlabel);
					
					
					newframe.add(date);
					newframe.add(month);
					newframe.add(year);	
					
					loginpage.setBounds(110, 150, 150, 30);
					loginpage.setForeground(Color.BLACK);
					loginpage.setFocusable(false);
					loginpage.setFont(new Font("MV BOLI",Font.ROMAN_BASELINE,20));
					loginpage.setText("Login Page");
					
					newframe.add(loginpage);
					
					recieptlabel.setBounds(10, 420, 500, 30);
					recieptlabel.setForeground(Color.black);
					recieptlabel.setFont(new Font("Arial",Font.BOLD,20));
					recieptlabel.setText("Or Upload your reciepts and recoginize text by us");
								
					recieptfield.setBounds(103, 480, 300, 40);
					
					

					choosefile.setBounds(10, 480, 100, 40);
					choosefile.setFont(new Font("Arial",Font.ITALIC,15));
					
					
					newframe.add(choosefile);
					newframe.add(recieptfield);
					
					
					
					newframe.add(recieptlabel);			
					
					
					
					newframe.setVisible(true);
					
			
				}

	 } 
			 
			 catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("error ");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("error");
			}
			 
	}
		
		
	}
	
	
	
	
public static void main(String[] args) {
		MyFrame frame = new MyFrame();
		
	}
	
}

		

	
	
	
	
	

