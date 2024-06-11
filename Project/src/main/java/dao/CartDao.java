package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connectivity.DBConnectivity;
import model.Cart;

public class CartDao {
	public static void insertIntoProduct(Cart c) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql = "insert into cart(cus_id,pid,pprice,qty,total_price,subtotal,payment_status) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getCus_id());
			pst.setInt(2, c.getPid());
			pst.setInt(3, c.getPprice());
			pst.setInt(4, c.getQty());
			pst.setInt(5, c.getTotal_price());
			pst.setInt(6, c.getSubtotal());
			pst.setString(7, c.getPayment_status());
			pst.executeUpdate();
			System.out.println("inserted into cart");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
