<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login page</title>
</head>
<body>
<form action="loginServlet" method="post">  
        <fieldset style="width: 300px">  
            <legend> Login to App </legend>  
            <table>  
                <tr>  
                    <td>User ID</td>  
                    <td><input type="text" name="username" /></td>  
                </tr>  
                <tr>  
                    <td>Password</td>  
                    <td><input type="password" name="password"  /></td>  
                </tr>  
                <tr>  
                    <td><input type="submit" value="Login" /></td>  
                    <td><a href="register.jsp"><input type="button" value="register"/></a></td>
                    <td><a href="Update.jsp"><input type="button" value="Update"/></a></td>
                </tr>  
            </table>  
        </fieldset>  
    </form>  
</body>
</html>