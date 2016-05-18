<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
        <thead>
            <tr>
                <th>Customer ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Middle Name</th>
                <th>USer Name</th>
                <th>Password</th>
                <th>Address</th>
                <th>Phone no</th>
                <th>Email Id</th>
                <th colspan="2">Action</th>
            </tr>
        </thead>
        <tbody>
        
        
        
            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td><c:out value="${customers.customer_id}" /></td>
                    <td><c:out value="${customers.customer_fname}" /></td>
                    <td><c:out value="${customers.customer_lname}" /></td>
                    <td><c:out value="${customers.customer_middlename}" /></td>
                    <td><c:out value="${customers.username}" /></td>
                    <td><c:out value="${customers.password}" /></td>
                    <td><c:out value="${customers.customer_address}" /></td>
                    <td><c:out value="${customers.customer_phno}" /></td>
                    <td><c:out value="${customers.email}" /></td>
                    
                    <td><a href="CustomerController.do?action=edit&customer_id=<c:out value="${customers.customer_id }""/> Update</a></td>
                    <td><a href="CustomerController.do?action=delete&customer_id=<c:out value="${customers.customer_id }""/> Delete</a></td>
                        
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <p>
        <a href="Customercontroller.do?action=insert">Add Customers</a>
    </p>
</body>
</html>