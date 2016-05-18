package com.java.dao;

import java.util.List;

import com.java.model.Customers;



public interface CustomerDAO {
	
    public void addCustomer( Customers cust );
    public void deleteCustomer( int customer_id );
    public void updateCustomer( Customers cust );
    public List<Customers> getAllCustomers();
    public Customers getStudentById( int customer_id );
	Customers getCustomerById(int customer_id);
}