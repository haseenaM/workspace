package com.java.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.dao.CustomerDAO;
import com.java.model.*;
import com.java.dao.CustomerDAOImplementation;

/**
 * Servlet implementation class Customercontroller
 */
public class Customercontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CustomerDAO dao;
	private static final String LIST_CUSTOMERS="/listcustomer.jsp";
	public static final String INSERT_OR_EDIT="/customer.jsp"; 
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customercontroller() {
        super();
        // TODO Auto-generated constructor stub
        // dao=new CustomerDAOImplementation();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String forward="";
		String action=request.getParameter("action");
		if( action.equalsIgnoreCase( "delete" ) ) {
            forward = LIST_CUSTOMERS;
            int customerId = Integer.parseInt( request.getParameter("customer_id") );
            dao.deleteCustomer(customerId);
            request.setAttribute("customers", dao.getAllCustomers() );
        }
		else if( action.equalsIgnoreCase( "edit" ) ) {
            forward = INSERT_OR_EDIT;
            int customerId = Integer.parseInt( request.getParameter("customer_id") );
            Customers cust = dao.getStudentById(customerId);
            request.setAttribute("customers", cust);
        }
		else if( action.equalsIgnoreCase( "insert" ) ) {
            forward = INSERT_OR_EDIT;
        }
		else {
            forward = LIST_CUSTOMERS;
            request.setAttribute("students", dao.getAllCustomers() );
        }
		RequestDispatcher view = request.getRequestDispatcher( forward );
        view.forward(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		Customers cust=new Customers();
		
		
		
		
		cust.setCustomer_fname( request.getParameter( "customer_fname" ) );
        cust.setCustomer_lname( request.getParameter( "customer_lname" ) );
        cust.setCustomer_middlename( request.getParameter( "customer_middlename" ) );
        cust.setUsername( request.getParameter( "username" ) );
        cust.setPassword( request.getParameter( "password" ) );
        cust.setCustomer_address( request.getParameter( "customer_address" ) );
        cust.setCustomer_phno( request.getParameter( "customer_phno" ) );
        cust.setEmail( request.getParameter( "email" ) );
		String customerId=request.getParameter("customer_id");
		
		if(customerId==null || customerId.isEmpty()) 
			dao.addCustomer(cust);
		else {
            cust.setCustomer_id( Integer.parseInt(customerId) );
            dao.updateCustomer(cust);
        }
		RequestDispatcher view = request.getRequestDispatcher( LIST_CUSTOMERS );
        request.setAttribute("customers", dao.getAllCustomers());
        view.forward(request, response);
	}

}
