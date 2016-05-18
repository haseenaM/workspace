<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">



<%@ page import="java.sql.*" %>
<% Class.forName("com.mysql.jdbc.Driver");  %>

<HTML>
    <HEAD>
        <TITLE>Fetching Data From a Database</TITLE>
    </HEAD>

    <BODY>
        <H1>Fetching Data From a Database</H1>

        <% 
        Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","testuser","password"); 

            Statement statement = con.createStatement();

            String id = request.getParameter("username");  

            ResultSet resultset = 
                statement.executeQuery("select * from customers where username = '" + id + "'") ; 

            if(!resultset.next()) {
                out.println("Sorry, could not find that customer. ");
            } else {
        %>

        <TABLE BORDER="1">
            <TR>
               <TH>ID</TH>
               <TH>FName</TH>
               <TH>Lname</TH>
               <TH>Mname</TH>
               <TH>Username</TH>
               <TH>Password</TH>
               <TH>Address</TH>
               <TH>Phone no</TH>
               <TH>Email</TH>
           </TR>
           <TR>
               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
               <TD> <%= resultset.getString(3) %> </TD>
               <TD> <%= resultset.getString(4) %> </TD>
               <TD> <%= resultset.getString(5) %> </TD>
               <TD> <%= resultset.getString(6) %> </TD>
               <TD> <%= resultset.getString(7) %> </TD>
               <TD> <%= resultset.getString(8) %> </TD>
               <TD> <%= resultset.getString(9) %> </TD>
               
               
               
               
           </TR>
       </TABLE>
       <BR>
       <% 
           } 
       %>
       
       <h4><a href="index.jsp">Back to LoginPage</a></h4>
       
    </BODY>
</HTML>





