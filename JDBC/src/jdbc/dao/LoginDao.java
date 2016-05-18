package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {

	public static boolean validate(String n, String p) {
		// TODO Auto-generated method stub
		
	        Connection con = null;
	        PreparedStatement ps = null;
	 
	        try {
	            con = DataConnect.getConnection();
	            ps = con.prepareStatement("Select username, password from customers where username = ? and password = ?");
	            ps.setString(1, n);
	            ps.setString(2, p);
	 
	            ResultSet rs = ps.executeQuery();
	 
	            if (rs.next()) {
	                //result found, means valid inputs
	                return true;
	            }
	        } catch (SQLException ex) {
	            System.out.println("Login error -->" + ex.getMessage());
	            return false;
	        } finally {
	            DataConnect.close(con);
	        }
		return false;
	}

}
