package com.java.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.model.Customers;
import com.java.util.DBUtil;


public abstract class CustomerDAOImplementation implements CustomerDAO{
	private Connection con;
	 public CustomerDAOImplementation() {
	        con = DBUtil.getConnection();
	    }
	 @Override
	    public void addCustomer( Customers cust ) {
	        try {
	            String query = "insert into customers (customer_fname, customer_lname,customer_middlename,username,password,customer_address,customer_phno,email) values (?,?,?,?,?,?,?,?)";
	            PreparedStatement preparedStatement = con.prepareStatement( query );
	            preparedStatement.setString( 1, cust.getCustomer_fname() );
	            preparedStatement.setString( 2, cust.getCustomer_lname() );
	            preparedStatement.setString( 3, cust.getCustomer_middlename() );
	            preparedStatement.setString( 4, cust.getUsername() );
	            preparedStatement.setString( 5, cust.getPassword() );
	            preparedStatement.setString( 6, cust.getCustomer_address() );
	            preparedStatement.setString( 7, cust.getCustomer_phno() );
	            preparedStatement.setString( 8, cust.getEmail() );   
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 
	 
	 @Override
	    public void deleteCustomer( int customer_id ) {
	        try {
	            String query = "delete from customers where customer_id=?";
	            PreparedStatement preparedStatement = con.prepareStatement(query);
	            preparedStatement.setInt(1, customer_id);
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 @Override
	    public void updateCustomer( Customers cust ) {
	        try {
	            String query = "update customers set customer_fname=?, customer_lname=?, customer_middlename=?,username=?,password=?,customer_address=?,customer_phno=?,email  where customer_id=?";
	            PreparedStatement preparedStatement = con.prepareStatement( query );
	            preparedStatement.setString( 1, cust.getCustomer_fname() );
	            preparedStatement.setString( 2, cust.getCustomer_lname() );
	            preparedStatement.setString( 3, cust.getCustomer_middlename() );
	            preparedStatement.setString( 4, cust.getUsername() );
	            preparedStatement.setString( 5, cust.getPassword() );
	            preparedStatement.setString( 6, cust.getCustomer_address() );
	            preparedStatement.setString( 7, cust.getCustomer_phno() );
	            preparedStatement.setString( 8, cust.getEmail() );   
	            preparedStatement.setInt(9, cust.getCustomer_id());
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	 @Override
	    public List<Customers> getAllCustomers() {
	        List<Customers> customers = new ArrayList<Customers>();
	        try {
	        	java.sql.Statement statement = con.createStatement();
	            ResultSet resultSet = statement.executeQuery( "select * from customers" );
	            while( resultSet.next() ) {
	                Customers cust = new Customers();
	                cust.setCustomer_id( resultSet.getInt( "customer_id" ) );
	                cust.setCustomer_fname( resultSet.getString( "customer_fname" ) );
	                cust.setCustomer_lname( resultSet.getString( "customer_lname" ) );
	                cust.setCustomer_middlename( resultSet.getString( "customer_middlename" ) );
	                cust.setUsername( resultSet.getString( "username" ) );
	                cust.setPassword( resultSet.getString( "password" ) );
	                cust.setCustomer_address( resultSet.getString( "customer_address" ) );
	                cust.setCustomer_phno( resultSet.getString( "customer_phno" ) );
	                cust.setEmail( resultSet.getString( "email" ) );
	                cust.add(cust);
	            }
	            resultSet.close();
	            statement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return customers;
	    }
	 @Override
	    public Customers getCustomerById(int customer_id) {
	        Customers cust = new Customers();
	        try {
	            String query = "select * from customers where customer_id=?";
	            PreparedStatement preparedStatement = con.prepareStatement( query );
	            preparedStatement.setInt(1, customer_id);
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while( resultSet.next() ) {
	                cust.setCustomer_id( resultSet.getInt( "customer_id" ) );
	                cust.setCustomer_fname( resultSet.getString( "customer_fname" ) );
	                cust.setCustomer_lname( resultSet.getString( "customer_lname" ) );
	                cust.setCustomer_middlename( resultSet.getString( "customer_middlename" ) );
	                cust.setUsername( resultSet.getString( "username" ) );
	                cust.setPassword( resultSet.getString( "password" ) );
	                cust.setCustomer_address( resultSet.getString( "customer_address" ) );
	                cust.setCustomer_phno( resultSet.getString( "customer_phno" ) );
	                cust.setEmail( resultSet.getString( "email" ) );
	            }
	            resultSet.close();
	            preparedStatement.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        return cust;
	    }
	 
}
