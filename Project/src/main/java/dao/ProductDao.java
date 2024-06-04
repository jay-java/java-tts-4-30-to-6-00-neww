package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connectivity.DBConnectivity;
import model.Product;

public class ProductDao {
	public static void insertProduct(Product p) {
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="insert into product(sid,image,pname,pprice,pcategory,pdescription) values(?,?,?,?,?,?)";
			PreparedStatement pst= conn.prepareStatement(sql);
			pst.setInt(1, p.getSid());
			pst.setString(2,p.getImage());
			pst.setString(3, p.getPname());
			pst.setInt(4,p.getPprice());
			pst.setString(5, p.getPcategory());
			pst.setString(6,p.getPdescription());
			pst.executeUpdate();
			System.out.println("product uploaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Product> getProductsListBySid(int sid){
		List<Product> list = new ArrayList<Product>();
		try {
			Connection conn = DBConnectivity.createConnection();
			String sql="select * from product where sid=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, sid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setPid(rs.getInt("pid"));
				p.setSid(rs.getInt("sid"));
				p.setImage(rs.getString("image"));
				p.setPname(rs.getString("pname"));
				p.setPprice(rs.getInt("pprice"));
				p.setPcategory(rs.getString("pcategory"));
				p.setPdescription(rs.getString("pdescription"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
