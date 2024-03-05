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
  background-color: black;
}

li 
{
  float: left;
    border-right: 1px solid blue;
}

li a 
{
  display: block;
  color: white;
 font-size:20px;
  text-align: center;
  padding: 10px 20px;
  text-decoration: none;
}
.active
{
background-color: red;
color: white;
}
li a:hover {
  background-color: blue;
  color: white;
}
</style>
</head>
<body>

<h1 align=center><I>Student Application Management System</I></h1>

<br>


<ul>
  <li><a class="active" href="studenthome">Home</a></li>
  <li><a href="viewstu">View Profile</a></li>
  <li><a href="studentquiz">Take Quiz</a></li>
  <li><a href="stuchangepwd">Change Password</a></li>
  <li><a href="studentlogin">Logout</a></li>
</ul>

<br>

<h3 align=center>Welcome&nbsp;<c:out value="${suname}"></c:out></h3>
<img src = "https://revenuesandprofits.com/wp-content/uploads/2022/10/Students.jpg"  align= "center" width ="1300" height = "650"alt = "Test Image" />

</body>
</html>

 
