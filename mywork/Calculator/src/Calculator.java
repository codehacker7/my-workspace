import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{

	
	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[8];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton;
	JPanel panel;
	
	
	Font myFont = new Font("ink free",Font.BOLD,30);
	double num1=0,num2=0,result =0;
	char operator;
	
	
	Calculator(){
		
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		frame.setLayout(null);
		
		
		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		
		
		
		// IN THIS OUR TASK IS TO INTIALIZE THE FUNCTIONBUTTONS AND NUMBER BUTTONS
		
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		
		
		for(int i=0;i<8;i++) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
	
		for(int i=0;i<10;i++) {
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
	
		}	// Number buttons and function buttons are successfully intialized with the actionListener interface being implemented
		
		
		// now our task is to add these to the panel 
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4));		
		panel.setBackground(Color.GRAY);
		
		
		
		for(int i=0;i<=9;i++) {
			panel.add(numberButtons[i]);
		}
		for(int i=0;i<=7;i++) {
			panel.add(functionButtons[i]);
		}
		
		
	
		delButton.setBounds(50, 430, 145, 50);
		clrButton.setBounds(205,430,145,50);
		
		
		

		
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.add(panel);
		frame.setVisible(true);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calculator calc = new Calculator();
		
		
	}








	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	
		for(int i=0;i<10;i++) {
			
			if(e.getSource()==numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
			}
			
		}
	
		if(e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			
			textfield.setText("");
			
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			textfield.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			textfield.setText("");
		}
	
		
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			textfield.setText("");
		}
		
		if(e.getSource()==equButton) {
			num2 = Double.parseDouble(textfield.getText());
		
			result = num2;
			
			
			
			switch(operator) {
			
			case '+' :
				result = num1+num2;
				break;
			
			case '-':
				result = num1 - num2;
				break;
			case '*' :
				result = num1*num2;
				break;
			case '/':
				result = num1/num2;
				break;
			
			
			}
			textfield.setText(String.valueOf(result));
			num1 = result;
			
		}
			if(e.getSource()==clrButton) {
				textfield.setText("");
			}
			if(e.getSource()==delButton) {
				String string = textfield.getText();
				textfield.setText("");
			
			for(int i=0;i<string.length()-1;i++)
			{
				textfield.setText(textfield.getText()+string.charAt(i));
			}
			
			}
			
			
			
		}
	
	
	
	
	
	
	}
	
	
	
	


