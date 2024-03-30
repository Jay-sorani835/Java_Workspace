package task;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class design {
	JFrame f;
	JLabel l;
	JTextField tf;
	JButton btn;
	int guess,k = 5;
	int num;
	design()
	{
		
		num = 1 + (int)(20*Math.random());
		System.out.println(num);

		f = new JFrame();
		
		l = new JLabel("Random Game");
		l.setBounds(141, 42, 126, 14);
		tf = new JTextField();
		tf.setBounds(80, 75, 86, 20);
		
		btn = new JButton("Submit");
		btn.setBounds(228, 74, 89, 23);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					System.out.println(
							"Guess the number:");
					int guess = Integer.parseInt(tf.getText().toString());
						// Take input for guessing

						// If the number is guessed
						if (num == guess) 
						{
							System.out.println("Congratulations!"+ " You guessed the number.");
						}
						else if (num > guess) {
							System.out.println("Too low ! Try again. You have " + --k + " trials left.");
						}
						else  {
							System.out.println("Too high ! Try again. You have " + --k + " trials left.");
						}
						if(k == 0) {
							System.out.println("You couldn't have more trials." + "\n The number was " + num);
						}
				}
		});
//		
		f.add(l);
		f.add(tf);
		f.add(btn);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
		}
	
	public static void main(String[] args) 
	{
		new design();
			
		
	}
}
