<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Your Details</title>

<script type="text/javascript">
window.onload = function() {
	 
	};

</script>
<%


%>
</head>
<body>
    
    <form method= "post" action="UpdateServlet">

    <h1> <center>Enter the required information</center></h1>

    <table>
       <!-- <tr>
            <td>ID</td>
            <td> :- </td>
            <%if(request.getAttribute("customer_id")!=null){ %>
            <td><input type="text" name="customer_id" value="<%=request.getAttribute("customer_id")%>"></input>

            <%}else{ %>
            <td><input type="text" name="customet_id"></input>
            <%} %>
            </td>
        </tr>-->
        
        
        <tr>
            <td>UserName</td>
            <td> :- </td>
           <%if(request.getAttribute("username")!=null){ %>
            <td><input type="text" name="username" value="<%=request.getAttribute("username")%>"></input>

            <%}else{ %>
            <td><input type="text" name="username"></input>
            <%} %>
            </td>       
        </tr>

        <tr>
            <td>First Name</td>
            <td> :- </td>
           <%if(request.getAttribute("customer_fname")!=null){ %>
            <td><input type="text" name="customer_fname" value="<%=request.getAttribute("customer_fname")%>"></input>

            <%}else{ %>
            <td><input type="text" name="customer_fname"></input>
            <%} %>
            </td>       
        </tr>
        <tr>
            <td>Last Name</td>
            <td> :- </td>
           <%if(request.getAttribute("customer_lname")!=null){ %>
            <td><input type="text" name="customer_lname" value="<%=request.getAttribute("customer_lname")%>"></input>

            <%}else{ %>
            <td><input type="text" name="customer_lname"></input>
            <%} %>
            </td>       
        </tr>
        
        <tr>
            <td>Middle Name</td>
            <td> :- </td>
           <%if(request.getAttribute("customer_middlename")!=null){ %>
            <td><input type="text" name="customer_middlename" value="<%=request.getAttribute("customer_middlename")%>"></input>

            <%}else{ %>
            <td><input type="text" name="customer_middlename"></input>
            <%} %>
            </td>       
        </tr>
        
        
        
        
        
        
        <tr>
            <td>Password</td>
            <td> :- </td>
           <%if(request.getAttribute("password")!=null){ %>
            <td><input type="text" name="password" value="<%=request.getAttribute("password")%>"></input>

            <%}else{ %>
            <td><input type="text" name="password"></input>
            <%} %>
            </td>       
        </tr>
        
        
        
        
        <tr>
            <td>Address </td>
            <td> :- </td>
             <%if(request.getAttribute("customer_address")!=null){ %>
            <td><input type="text" name="customer_address" value="<%=request.getAttribute("customer_address")%>"></input>

            <%}else{ %>
            <td><input type="text" name="customer_address"></input>
            <%} %>
            </td>
        </tr>

        <tr>
            <td>Phone Number </td>
            <td> :- </td>
            <%if(request.getAttribute("customer_phno")!=null){ %>
            <td><input type="text" name="customer_phno" value="<%=request.getAttribute("customer_phno")%>"></input>

            <%}else{ %>
            <td><input type="text" name="customer_phno"></input>
            <%} %>
            </td>
        </tr>
        
        <tr>
            <td>Email</td>
            <td> :- </td>
           <%if(request.getAttribute("email")!=null){ %>
            <td><input type="text" name="email" value="<%=request.getAttribute("email")%>"></input>

            <%}else{ %>
            <td><input type="text" name="email"></input>
            <%} %>
            </td>       
        </tr>

        <tr>
            <td></td>
            <td><input type="submit" value="Update" width="16"></input></td>
        </tr>

    </table>

    </form>

</body>
</html>