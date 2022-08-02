import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyCalculator implements ActionListener {

	JTextField textfield;
	JFrame frame;
	JPanel panel;
	JButton[] numberbutton = new JButton[10];
	JButton[] functionbutton = new JButton[8];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton;

	double x,y,result;
	String operator;
	
	
	
	MyCalculator(){
		frame = new JFrame("Calculator");
		frame.setSize(420,550);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		
		
		
		
		
		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFocusable(false);
		frame.add(textfield);
		
		
		
		for(int i=0;i<10;i++) {
			numberbutton[i] = new JButton(String.valueOf(i));		
			numberbutton[i].setFocusable(false);
			numberbutton[i].addActionListener(this);
		}
		

		
		
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");
		
		
		functionbutton[0] = addButton;
		functionbutton[1] = subButton;
		functionbutton[2] = mulButton;
		functionbutton[3] = divButton;
		functionbutton[4] = decButton;
		functionbutton[5] = equButton;
		functionbutton[6] = delButton;
		functionbutton[7] = clrButton;
		
		for(int i=0;i<8;i++) {
		
			functionbutton[i].addActionListener(this);
		}
		
		
		
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4));
		panel.setBackground(Color.GRAY);
	
		
		
		for(int i=0;i<10;i++) {
			panel.add(numberbutton[i]);
		}
		for(int i=0;i<6;i++) {
			panel.add(functionbutton[i]);
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
		
		
		MyCalculator cal = new MyCalculator();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
		
			if(e.getSource()==numberbutton[i]) {
//				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				textfield.setText(String.valueOf(i));
			
			}
		
		}
		
		if(e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
			if(e.getSource()==addButton) {
				x = Double.parseDouble(textfield.getText());
				operator = "+";
				textfield.setText("");
			}
			if(e.getSource()==subButton) {
				x = Double.parseDouble(textfield.getText());
				operator = "-";
				textfield.setText("");
			}
			if(e.getSource()==mulButton) {
				x = Double.parseDouble(textfield.getText());
				operator = "*";
				textfield.setText("");
			}
			if(e.getSource()==divButton) {
				x = Double.parseDouble(textfield.getText());
				operator = "/";
				textfield.setText("");
			}
			if(e.getSource()==decButton) {
				x = Double.parseDouble(textfield.getText());
				operator = ".";
				textfield.setText("");
			}
			
			
			if(e.getSource()==equButton) {
				y = Double.parseDouble(textfield.getText());
				
			
			
			switch(operator) {
			
			case "+":
				result = x+y;
				break;
			case "-":
				result = x-y;
				break;
			case "*":
				result = x*y;
				break;
			case "/":
				result = x/y;
				break;
				
				
			}
			
			textfield.setText(String.valueOf(result));
			x = result;
			}
			
			if(e.getSource()==clrButton) {
				textfield.setText("");
			
			}
			
			if(e.getSource()==delButton) {
				
				String text = textfield.getText();
				textfield.setText("");
				
				String newtext = "";
				
				for(int j=0;j<text.length()-1;j++) {
					newtext = newtext + text.charAt(j);
				}
				
				textfield.setText(newtext);
			}
			
		
		
		
		
		
		
		
		
	}
	
}
