package basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
class DataNotFound{
	public DataNotFound() {
		JFrame fr = new JFrame("Alert");
		fr.setVisible(true);
		fr.setSize(300, 200);
		fr.setLayout(null);
		JLabel l1 = new JLabel("Data Not Found");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
	}
}
class SwingDemo implements ActionListener {
	JButton b1, b2, b3, b4;
	JLabel l1, l2, l3, l4, l5;
	JTextField t1, t2, t3, t4, t5;

	SwingDemo() {
		JFrame fr = new JFrame("MyApp");
		fr.setVisible(true);
		fr.setSize(700, 500);
		fr.setLayout(null);

		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);

		l2 = new JLabel("Name : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);

		l3 = new JLabel("Contact : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);

		l4 = new JLabel("Address : ");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);

		l5 = new JLabel("Email : ");
		l5.setBounds(100, 220, 120, 20);
		fr.add(l5);

		t1 = new JTextField();
		t1.setBounds(200, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(200, 130, 120, 20);
		fr.add(t2);
		t3 = new JTextField();
		t3.setBounds(200, 160, 120, 20);
		fr.add(t3);
		t4 = new JTextField();
		t4.setBounds(200, 190, 120, 20);
		fr.add(t4);
		t5 = new JTextField();
		t5.setBounds(200, 220, 120, 20);
		fr.add(t5);

		b1 = new JButton("Insert");
		b1.setBounds(100, 280, 120, 20);
		fr.add(b1);

		b2 = new JButton("Search");
		b2.setBounds(250, 280, 120, 20);
		fr.add(b2);

		b3 = new JButton("Update");
		b3.setBounds(100, 310, 120, 20);
		fr.add(b3);

		b4 = new JButton("Delete");
		b4.setBounds(250, 310, 120, 20);
		fr.add(b4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

	}

	public static Connection createConnection() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/swing", "root", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			System.out.println("insert button clicked");
			int id = Integer.parseInt(t1.getText());
			System.out.println(id);
			String name = t2.getText();
			System.out.println(name);
			long contact = Long.parseLong(t3.getText());
			System.out.println(contact);
			String address = t4.getText();
			System.out.println(address);
			String email = t5.getText();
			System.out.println(email);
			try {
				Connection conn = SwingDemo.createConnection();
				String sql="insert into user(id,name,contact,address,email) values(?,?,?,?,?)";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setLong(3, contact);
				pst.setString(4, address);
				pst.setString(5, email);
				pst.executeUpdate();
				System.out.println("data inserted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
//				executeUPdate->DML(insert,update,delete)
//				executeQuery->DQL(select)
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} else if (e.getSource() == b2) {
			System.out.println("search button clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection conn = SwingDemo.createConnection();
				String sql = "select * from user where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					t1.setText(String.valueOf(rs.getInt("id")));
					t2.setText(rs.getString("name"));
					t3.setText(String.valueOf(rs.getLong("contact")));
					t4.setText(rs.getString("address"));
					t5.setText(rs.getString("email"));
				}
				else {
					System.out.println("data not found");
					t1.setText("");
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
					new DataNotFound();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		} else if (e.getSource() == b3) {
			System.out.println("update button clicked");
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			String email = t5.getText();
			try {
				Connection conn = SwingDemo.createConnection();
				String sql = "update user set name=?,contact=?,address=?,email=? where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, name);
				pst.setLong(2, contact);
				pst.setString(3, address);
				pst.setString(4, email);
				pst.setInt(5, id);
				pst.executeUpdate();
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		} else if (e.getSource() == b4) {
			System.out.println("delete button clicked");
			int id = Integer.parseInt(t1.getText());
			try {
				Connection conn = SwingDemo.createConnection();
				String sql = "delete from user where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.executeUpdate();
				System.out.println("data deleted");
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
		}
	}
}

public class P030_Swing {
	public static void main(String[] args) {
		new SwingDemo();
	}
}
