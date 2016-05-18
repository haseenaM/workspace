<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>adduser</title>
<script type=”text/javascript”>
function ValidateForm()
{

if(document.frm.customer_fname.value==””)
{
alert(“Please Enter User FirstName “);
return false;
}

if(document.frm.customer_lname.value==””)
{
alert(“Please Enter User LastName “);
return false;
}

if(document.frm.customer_middlename.value==””)
{
alert(“Please Enter User MiddleName “);
return false;
}
if(document.frm.username.value==””)
{
alert(“Please Enter User Name “);
return false;
}
if(document.frm.password.value==””)
{
alert(“Please Enter password”);
return false;
}
if(document.frm.customer_address.value==””)
{
alert(“Please Enter Address”);
return false;
}
if(document.frm.customer_phno.value==””)
{
alert(“Please Enter Phone number “);
return false;
}
if(document.frm.email.value==””)
{
alert(“Please Enter Valid Email “);
return false;
}
return true;
}
function save(){

if(!ValidateForm()) return;{
document.frm.action=”Register”;
document.frm.submit();
}
}
</script>


</head>
<body>
<form action="Register" method="post" name=frm>
<center>
<h1>Registration</h1>
<table border="10"  width="500px">
<!-- <tr><td colspan="2">Enter ID:</td><td><input type="text" name="customer_id" ></td></tr>-->
<tr><td colspan="2">Enter FirstName:</td><td><input type="text" name="customer_fname" ></td></tr>
<tr><td colspan="2">Enter LastName:</td><td><input type="text" name="customer_lname"></td></tr>
<tr><td colspan="2">Enter MiddleName:</td><td><input type="text" name="customer_middlename"></td></tr>
<tr><td colspan="2">Enter Username:</td><td><input type="text" name="username"></td></tr>
<tr><td colspan="2">Enter Password:</td><td><input type="password" name="password"></td></tr>
<tr><td colspan="2">Enter Address:</td><td><input type="text" name="customer_address"></td></tr>
<tr><td colspan="2">Enter Phone number:</td><td><input type="text" name="customer_phno"></td></tr>
<tr><td colspan="2">Enter Email:</td><td><input type="email" name="email"></td></tr>
<tr><td></td><TD> <BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>
<BUTTON type=”button” value=”Cancel” name=”cmdCancel”>Cancel</BUTTON>
</TD>
</tr>
</table>
</center>
</form>
</body>
</html>