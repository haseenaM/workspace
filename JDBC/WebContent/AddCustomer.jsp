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
document.frm.action=”AddUser”;
document.frm.submit();
}
}
</script>
</head>
<body>
<form name=frm method=”post” action="adduser">
<table border=”1″>
<THEAD>
<tr><td colspan=”7″ align=”center”><font size="3">Add User Details</font></td>
</tr>
</THEAD>
<tr><td>FirstName</td>
<td><INPUT type=”text” name=customer_fname value=”” size="24"></td></tr>
<tr><td>LastName</td>
<td><INPUT type=”text” name=customer_lname value=”” size="24"></td></tr>
<tr><td>MiddleName</td>
<td><INPUT type=”text” name=customer_middlename value=”” size="24"></td></tr>
<tr><td>UserName</td>
<td><INPUT type=”text” name=username value=”” size=”24"></td>
</tr>
<tr><td>Password</td>
<td><INPUT type=”password” name=password value=”” size="24"></td></tr>

<tr><td>Address</td>
<td><INPUT type=”text” name=customer_address value=”” size=”24"></td>
</tr>
<tr><td>Phone No</td>
<td><INPUT type=”text” name=customer_phno value=”” size=”24"></td>
</tr>
<tr><td>Email Id</td>
<td><INPUT type=”email” name=email value=”” size=”24"></td>
</tr>
<tr><td></td><TD> <BUTTON type=button value=save name=cmdsave onclick=”save()” >Add</BUTTON>
<BUTTON type=”button” value=”Cancel” name=”cmdCancel”>Cancel</BUTTON>
</TD>
</tr>
</table>
</form>
</body>