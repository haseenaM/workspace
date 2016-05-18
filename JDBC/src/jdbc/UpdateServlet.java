package jdbc;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
	    	    out.println("<html>"); 
	            out.println("<head>"); 
	            out.println("<title>Customer Data</title>"); 
	            out.println("</head>"); 
	            out.println("<body>"); 
	            out.println("<center><u><h1>Customer Data</h1></u>"); 
                out.println("<form name='form' >"); 

	                int a = 2; 
	                out.println("<table border="+a+ "> "); 
	                out.println("<tr>"); 
	                    
	                    out.println("<td> FirstName </td>"); 
	                    out.println("<td> LastName </td>"); 
	                    out.println("<td> MiddleName </td>"); 
	                   // out.println("<td> UserName </td>");
	                    out.println("<td> Password </td>");
	                    out.println("<td> Address </td>");
	                    out.println("<td> Phone no </td>");
	                    out.println("<td> Email </td>");
	                    out.println("</tr>"); 
	                   // out.println("</table>");
	                   // out.println("</form>");
	                   // out.println("</body>");
	                   // out.println("</html>");
	                    
	                    
	                  /*  Connection con = null; 
	                     PreparedStatement ps = null;
	                    ResultSet rs = null; 
	                    Statement st = null; 
	                    String url="jdbc:mysql://localhost:3306/";
	                    String dbName="testdb";
	                    String driver="com.mysql.jdbc.Driver";*/
	                    
	                   
                 
        try { 
                     
           String username=request.getParameter("username");  
            System.out.println(username);
            
    		String Fname=request.getParameter("customer_fname");  
    		System.out.println(Fname);
    		
    		String lname=request.getParameter("customer_lname"); 
    	    System.out.println(lname);
    	    
    		String mname=request.getParameter("customer_middlename"); 
    		System.out.println(mname);
    		
    		String pass=request.getParameter("password");
    		System.out.println(pass);
    		
    		String add=request.getParameter("customer_address");
    		System.out.println(add);
    		
    		String phno=request.getParameter("customer_phno");
           System.out.println(phno);
           
    		String e=request.getParameter("email");
    		System.out.println(e);
    		
    		
    		
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "testuser", "password");
                    
    		String update="update customers set customer_fname=?,customer_lname=?,customer_middlename=?,password=?,customer_address=?, customer_phno=?,email=? where username=? ";
    		 System.out.println("The sql is " +update);
    		 PreparedStatement ps = (PreparedStatement) con.prepareStatement(update);
                ps.setString(1,	Fname);
                ps.setString(2,lname);
                ps.setString(3,mname);
                ps.setString(4,pass);
                ps.setString(5,add); 
                ps.setString(6,phno);
                ps.setString(7,e);
               ps.setString(8,username);
               
               
                 int i = ps.executeUpdate(); 
                
                 String msg=" ";
                 if(i!=0){  
                   msg="User Updated";

                   out.print(i);
                   out.print("<font size='6' color=blue>" + msg + "</font>");  
                   out.print(" '"+Fname+"'");

                 }  
                 else{  
                   msg="failed to update the data";
                   out.print("<font size='6' color=blue>" + msg + "</font>");
                  }  
                 out.close();
                 ps.close();
                 con.close();
               }  
               catch (Exception e){  
                   e.printStackTrace(); 
               }  
        }
		
	}
		
		
	


