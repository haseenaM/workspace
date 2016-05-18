<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="Customercontroller.do" method="post">
        <fieldset>
            <div>
                <label for="customer_id">Student ID</label>
                 <input type="text"
                    name="customer_id" value="<c:out value="${customers.customer_id}"/>"
                    readonly="readonly" placeholder="Customer ID" />
            </div>
            <div>
                <label for="firstName">First Name</label> <input type="text"
                    name="customer_fname" value="<c:out value="${customers.customer_fname}" />
                    placeholder="First Name" />
            </div>
            <div>
                <label for="lastName">Last Name</label> <input type="text"
                    name="customer_lname" value="<c:out value="${customers.customer_lname}" />
                    placeholder="Last Name" />
            </div>
            <div>
                <label for="MiddleName">Middle Name</label> <input type="text"
                    name="customer_middlename" value="<c:out value="${customers.customer_middlename}" />
                    placeholder="Middle Name" />
            </div>
            
            <div>
                <label for="username">UserName</label> <input type="text" name="username"
                    value="<c:out value="${customers.username}" /> placeholder="username" />
            </div>
            <div>
                <label for="password">Password</label> <input type="text" name="password"
                    value="<c:out value="${customers.password}" /> placeholder="password" />
            </div>
            
            <div>
                <label for="Address">Address</label> <input type="text"
                    name="customer_address" value="<c:out value="${customers.customer_address}" />
                    placeholder="Address" />
            </div>
            <div>
                <label for="Phone no">Phone no</label> <input type="text"
                    name="customer_phno" value="<c:out value="${customers.customer_phno}" />
                    placeholder="Phone no" />
            </div>
            <div>
                <label for="Email">Email Id</label> <input type="text"
                    name="email" value="<c:out value="${customers.email}" />
                    placeholder="Email" />
            </div>
            
            
            
            
            
            <div>
                <input type="submit" value="Submit" />
            </div>
        </fieldset>
    </form>
</body>
</html>