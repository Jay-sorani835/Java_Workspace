package Assignment;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegistrationForm implements ActionListener
{
	JFrame main,deleteframe;
	JLabel m,l1,l2,l3,l4,l5,l;
	JTextField tf1,tf2,tf3,tf4;
	JRadioButton rd1,rd2;
	JButton btn1,btn2,btn3,btn4,btn5,re,btn;
	JTable t;
	JScrollPane s ;
	DefaultTableModel model;
	int did = 0;
	
	public RegistrationForm() 
	{
		main = new JFrame("Registration Form");
		m = new JLabel("Registration Form");
		l1 = new JLabel("ID");
		l2 = new JLabel("Name ");
		l3 = new JLabel("Gender");
		l4 = new JLabel("Address");
		l5 = new JLabel("Contact");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		
		rd1 = new JRadioButton("Male");
		rd2 = new JRadioButton("Female");
		
		btn1 = new JButton("Exit");
		btn2 = new JButton("Register");
		btn3 = new JButton("Delete");
		btn4 = new JButton("Update");
		btn5 = new JButton("Reset");
		re = new JButton("Refresh Table");
		
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		re.addActionListener(this);

		btn1.setFont(new Font("Tahoma", Font. BOLD, 14));
		btn2.setFont(new Font("Tahoma", Font. BOLD, 14));
		btn3.setFont(new Font("Tahoma", Font. BOLD, 14));
		btn4.setFont(new Font("Tahoma", Font. BOLD, 14));
		btn5.setFont(new Font("Tahoma", Font. BOLD, 14));
		
		m.setFont(new Font("Tahoma", Font. BOLD, 25));
		l1.setFont(new Font("Tahoma", Font. BOLD, 16));
		l2.setFont(new Font("Tahoma", Font. BOLD, 16));
		l3.setFont(new Font("Tahoma", Font. BOLD, 16));
		l4.setFont(new Font("Tahoma", Font. BOLD, 16));
		l5.setFont(new Font("Tahoma", Font. BOLD, 16));
		
		rd1.setFont(new Font("Tahoma", Font. BOLD, 16));
		rd2.setFont(new Font("Tahoma", Font. BOLD, 16));
		
		m.setBounds(53, 33, 300, 30);
		l1.setBounds(29, 125, 46, 23);
		l2.setBounds(29, 175, 100, 23);
		l3.setBounds(29, 225, 100, 23);
		l4.setBounds(29, 275, 250, 23);
		l5.setBounds(29, 325, 100, 23);
		
		rd1.setBounds(120, 225, 80, 23);
		rd2.setBounds(200, 225, 125, 23);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rd1);
		bg.add(rd2);
		
		tf1.setBounds(120, 125, 200, 20);
		tf2.setBounds(120, 175, 200, 20);
		tf3.setBounds(120, 275, 200, 20);
		tf4.setBounds(120, 325, 200, 20);
		
		btn1.setBounds(40, 375, 100, 30);
		btn2.setBounds(200, 375, 100, 30);
		btn3.setBounds(40, 425, 100, 30);
		btn4.setBounds(200, 425, 100, 30);
		btn5.setBounds(120, 475, 100, 30);
		re.setFont(new Font("Tahoma", Font.BOLD,15));
		re.setBounds(550, 403, 300, 34);
		 
		String column[] = {"S.No","ID","Name","Gender","Address","Contact"};
		
		model = new DefaultTableModel(column,0);
		t = new JTable(model);
		t.setBounds(350, 13, 650, 377);
		t.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 15));
		
		t.repaint();
		s = new JScrollPane(t, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		s.setBounds(350, 13, 650, 377);
//	    JScrollPane sp=new JScrollPane(jt);   
		main.add(m);
		main.add(l1);
		main.add(l2);
		main.add(l3);
		main.add(l4);
		main.add(l5);
		main.add(tf1);
		main.add(tf2);
		main.add(tf3);
		main.add(tf4);
		main.add(rd1);
		main.add(rd2);
		main.add(btn1);
		main.add(btn2);
		main.add(btn3);
		main.add(btn4);
		main.add(btn5);
//		main.add(show);
		main.add(s);
		main.add(re);
		main.setSize(1100,600);
		main.setLayout(null);
		main.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new RegistrationForm();
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		JOptionPane op = new JOptionPane();
		AllOperation a = new AllOperation();
		if(e.getSource() == btn1)
		{
			main.setVisible(false);
		}
		if(e.getSource() == btn2)
		{
			if(tf1.getText() == null && tf2.getText() == null && tf3.getText() == null && tf4.getText() == null)
			{
				op.showMessageDialog(op, "Please Fillout the form.");
			}
			else
			{
				String host="jdbc:mysql://localhost:3306/";
				String db="assignment";
				String url = host+db;
				
				String ID = tf1.getText().toString();
				int id = Integer.parseInt(ID);
				
				String name = tf2.getText().toString();
				
				String address = tf3.getText().toString();
				
				String contact = tf4.getText().toString();
//				StringBuffer confirmcontact = new StringBuffer();
//				if(contact.length() == 10)
//				{
//					for(int i = 0;i < 10;i++)
//					{
//						if(contact.charAt(i) >= 42 && contact.charAt(i) <= 51)
//						{
//							confirmcontact.append(contact.charAt(i));
//						}
//						else
//						{
//							op.showMessageDialog(op, "Contact contains only digits.");
//						}
//					}
//				}
//				else
//				{
//					op.showMessageDialog(op,"Contact is Invalid.");
//				}
				String gender = new String();
				if(rd1.isSelected())
				{
					gender = "M";
				}
				else if(rd2.isSelected())
				{
					gender = "F";
				}
				else
				{
					op.showMessageDialog(op, "Please Select gender field.");
				}
				
				try 
				{
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection(url,"root","");
					String sql = "Insert into Register (id,Name,Gender,Address,Contact) values ('"+id+"','"+name+"','"+gender+"','"+address+"', '"+contact+"');" ;
					Statement stmt = con.createStatement();
					int r = stmt.executeUpdate(sql);
					
					
				} 
				catch (Exception e2)
				{
					e2.printStackTrace();
				}
			}
		}
		if(e.getSource() == btn3)
		{
			deleteframe = new JFrame();
			
			tf1 = new JTextField(20);
			l = new JLabel("Id : ");
			btn =  new JButton("Delete");
			
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					String host="jdbc:mysql://localhost:3306/";
					String db="assignment";
					String url = host+db;
					
					String t = tf1.getText().toString();
					int id = Integer.parseInt(t);
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url,"root","");
						String sql ="delete from Register where id = '"+id+"'";
						Statement stmt = con.createStatement();
						//ResultSet set = stmt.executeQuery(sql);
						
						int data = stmt.executeUpdate(sql);
						
						if(data>0)
						{
							deleteframe.setVisible(false);
						}
						else
						{
							System.out.println("Error");
						}
					}
					catch(Exception e1)
					{
						System.out.println(e1);
					}
				}
			});
			
			deleteframe.add(l);
			deleteframe.add(tf1);
			deleteframe.add(btn);
			
			deleteframe.setSize(300,300);
			deleteframe.setLayout(new FlowLayout());
			deleteframe.setVisible(true);
		}
		if(e.getSource() == btn4)
		{
			JFrame update;
			JPanel jp,jp2;
			JLabel l;
			JTextField tf1,tf2,tf3;
			JButton btn1,btn2;
			
			
			update = new JFrame();
			jp = new JPanel();
			jp2 = new JPanel();
			
		
			tf1 = new JTextField(15);
			btn1 = new JButton("Edit");
			
			jp.add(tf1);
			jp.add(btn1);
			
			
			
			tf2 = new JTextField(15);
			tf3 = new JTextField(15);
			btn2 = new JButton("Update");
			
			jp2.add(tf2);
			jp2.add(tf3);
			jp2.add(btn2);
			
			
			jp.setVisible(true);
			jp2.setVisible(false);
			
			btn1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
			
					

					String host="jdbc:mysql://localhost:3306/";
					String db="assignment";
					String url = host+db;
					
					String id = tf1.getText().toString();
					int id2 = Integer.parseInt(id);
					try 
					{
						Class.forName("com.mysql.jdbc.Driver");
						Connection con = DriverManager.getConnection(url,"root","");
						//
						
						String sql ="select * from Register where id ='"+id2+"'";
						Statement st = con.createStatement();
						
						ResultSet set = st.executeQuery(sql);
						
						if(set.next())
						{
							did = set.getInt(1);
							String name = set.getString(2);
							String surname = set.getString(3);
							
							tf2.setText(name);
							tf3.setText(surname);
							
							btn2.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
								
									
									String host="jdbc:mysql://localhost:3306/";
									String db="assignment";
									String url = host+db;
								
									String n = tf2.getText().toString();
									String s = tf3.getText().toString();
									
									try 
									{
										Class.forName("com.mysql.jdbc.Driver");
										Connection con = DriverManager.getConnection(url,"root","");
										
										String sql ="update Register set name='"+n+"',surname='"+s+"' where id='"+did+"'";
										
										Statement stmt = con.createStatement();
										int data = stmt.executeUpdate(sql);
										
										if(data>0)
										{
											update.setVisible(false);
										}
										else
										{
											System.out.println("Error");
										}
									}
									catch (Exception e1) 
									{
										// TODO Auto-generated catch block
										System.out.println(e1);
									}
								}
							});
							
						}
					} 
					catch (Exception e1)
					{
						// TODO Auto-generated catch block
						System.out.println(e1);
					}
					jp2.setVisible(true);
					jp.setVisible(false);

				}
			});
			
			
			update.add(jp);
			update.add(jp2);
			update.setSize(500,500);
			update.setLayout(new FlowLayout());
			update.setVisible(true);
		}
		if(e.getSource() == btn5)
		{
			tf1.setText(null);
			tf2.setText(null);
			tf3.setText(null);
			tf4.setText(null);
			
			rd1.setSelected(false);
			rd2.setSelected(false);
			
		}
		if(e.getSource() == re)
		{
			this.viewDataInTable();
		}
	}
	public void viewDataInTable()
	{
		String host="jdbc:mysql://localhost:3306/";
		String db="assignment";
		String url = host+db;	
		String sqlviewdata = "select * from Register";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, "root", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sqlviewdata);



			model.setRowCount(0);
						
			while(rs.next())
			{
				model.addRow(new Object[] {rs.getInt(1), rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getLong(6)});
							
			}
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}