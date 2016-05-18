package com.java.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		
		//String ID=request.getParameter("customer_id");  
		String Fname=request.getParameter("customer_fname");  
		String lname=request.getParameter("customer_lname");  
		String mname=request.getParameter("customer_middlename"); 
		String username=request.getParameter("userName");  
		String pass=request.getParameter("password"); 
		String add=request.getParameter("customer_address");
		String phno=request.getParameter("customer_phno");
		String e=request.getParameter("email"); 
		try{
			
			Class.forName("com.mysql.jdbc.Driver");  
            Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","testuser","password");  
			String query="INSERT INTO customers(customer_fname,customer_lname,customer_middlename,username,password,customer_address,customer_phno,email) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement ps=con.prepareStatement(query); 
            System.out.println("Created prepared statement");
            //ps.setString(1,ID); 
            ps.setString(1,	Fname);
            ps.setString(2,lname);
            ps.setString(3,mname);
            ps.setString(4,username);
            ps.setString(5,pass);
            ps.setString(6,add); 
            ps.setString(7,phno);
           ps.setString(8,e);
         
           int i=ps.executeUpdate();  
            if(i>0) {
                
				out.print("You are successfully registered..."); 
				request.getRequestDispatcher("/listcustomer.jsp").forward(request, response);
		}}
            catch (Exception e2) {System.out.println(e2);}  
		  
		out.close(); 
		
	}

}
