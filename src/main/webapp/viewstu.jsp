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
  <li><a href="studenthome">Home</a></li>
  <li><a class="active" href="viewstu">View Profile</a></li>
  <li><a href="schangepwd">Change Password</a></li>
   <li><a href="studentlogin">Logout</a></li>
</ul>

<img src = "https://thumbs.dreamstime.com/b/graduate-student-team-icon-male-female-symbols-cap-head-flat-style-vector-eps-graduate-student-team-icon-male-225089258.jpg"  align= "center" width ="100" height = "100"alt = "Test Image" />

<table align=center>

<tr><th>ID:</th>&nbsp;<td>${stu.id}</td></tr>
<tr><th>Name:</th>&nbsp;<td>${stu.name}</td></tr>
<tr><th>Gender:</th>&nbsp;<td>${stu.gender}</td></tr>
<tr><th>Date of Birth:</th>&nbsp;<td>${stu.dateofbirth}</td></tr>
<tr><th>Department:</th>&nbsp;<td>${stu.department}</td></tr>
<tr><th>Designation:</th>&nbsp;<td>${stu.designation}</td></tr>
<tr><th>Salary:</th>&nbsp;<td>${stu.cgpa}</td></tr>
<tr><th>Location:</th>&nbsp;<td>${stu.location}</td></tr>
<tr><th>Email ID:</th>&nbsp;<td>${stu.emailid}</td></tr>
<tr><th>Contact No:</th>&nbsp;<td>${stu.contactno}</td></tr>



</table>



</body>
</html>

 
