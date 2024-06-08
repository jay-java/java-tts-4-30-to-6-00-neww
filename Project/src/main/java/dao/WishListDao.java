package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connectivity.DBConnectivity;
import model.WishList;

public class WishListDao {
	public static void insertIntoWishList(WishList w) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="insert into wishlist(cusid,pid) values(?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, w.getCusid());
			pst.setInt(2, w.getPid());
			pst.executeUpdate();
			System.out.println("inserted");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}
	public static List<WishList> getWishListByCusId(int cusid){
		List<WishList> list = new ArrayList<WishList>();
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="select * from wishlist where cusid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, cusid);
			ResultSet rs = pst.executeQuery();
	
			while(rs.next()) {
				WishList w = new WishList();
				w.setWid(rs.getInt("wid"));
				w.setCusid(rs.getInt("cusid"));
				w.setPid(rs.getInt("pid"));
				list.add(w);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static void removeWishLIst(int wid) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="delete from wishlist where wid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, wid);
			pst.executeUpdate();
			System.out.println("removed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
