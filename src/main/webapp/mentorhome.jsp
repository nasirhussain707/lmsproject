<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html>
<html>
<head>
<style>
body {
  font-family: Garamond, serif;
}
ul 
{
  list-style-type: none;
  margin: 0;
  padding: 0px;
  overflow: hidden;
  background-color: light blue;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: black;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: black;
color: white;
}
li a:hover {
  background-color: red;
  color: white;
}
</style>
</head>
<body>

<h1 align=center><I>Student Application Management System</I></h1>

<br>

<ul>
  <li><a class="active" href="mentorhome">Home</a></li>
  <li><a href="viewallstudents">View All Faculty</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br>

<h3 align=right>Welcome Mentor&nbsp;<c:out value="${auname}"></c:out></h3>

</body>
</html>

 
