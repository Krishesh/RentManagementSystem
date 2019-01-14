<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>

<h1><center>User Register</center></h1>
<form name="Register" action="register" method="POST">
First Name:
<input type="text" name="fullname" id="first" onblur="validatefirst()"/><br/><br/>
UserName:
<input type="text" name="username" id="first" onblur="validatefirst()"/>

<br/><br/>
E-mail:
<input type="e-mail" name="email" id="email" onblur="validateemail()"/>
<br/>
<br/>
Password:
<input type="password" name="password" id="password" onblur="validatepassword()"/>
<br/>
<br/>
Re-Password:
<input type="password" name="repassword" id="repassword" onblur="validaterepassword()"/>
<br/>
<br/>

Phone:
<input type="text" name="phone" id="phone" onblur="validatephone()"/>
<br/>
<br/>
Gender:<br/>
<input type="radio" name="radio" id="radio1"/>Male
<input type="radio" name="radio" id="radio2"/>Female
<br/>
<br/>
<input type="submit" name="submit" id="submit" value="submit" onclick="notempty()"/>
<input type="reset" name="reset" id="reset" value="reset"/>
</form>


</body>
</html>