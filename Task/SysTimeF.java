package task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.print.attribute.standard.PrinterMessageFromOperator;
import javax.swing.*;
public class SysTimeF {
	JFrame f;
	JButton btn;
	
	SysTimeF(){
		f = new JFrame();
		
		btn = new JButton("Execute");
		btn.setBounds(120, 120, 80, 30);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DateTimeFormatter cur = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
				LocalDateTime now = LocalDateTime.now();
				JOptionPane op = new JOptionPane();
				op.showMessageDialog(op, cur.format(now));
			}
		});
		
		f.add(btn);
		f.setSize(450, 450);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new SysTimeF();
	}
}
