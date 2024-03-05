<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

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
  <li><a href="adminhome">Home</a></li>
  <li><a class="active"  href="viewallstu">View All Students</a></li>
  <li><a href="adminlogin">Logout</a></li>
</ul>

<br><br>

<h3 align=center>View All Students</h3>

<table align=center border=2>

<tr>

<th>ID</th>
<th>Name</th>
<th>Gender</th>
<th>Date of Birth</th>
<th>Department</th>
<th>Designation</th>
<th>Cgpa</th>
<th>Location</th>
<th>Email ID</th>
<th>Username</th>
<th>Contact No</th>
<th>Action</th>

</tr>

<c:forEach items="${emplist}" var="emp">

<tr>

<td> <c:out value="${stu.id}"></c:out>   </td>
<td> <c:out value="${stu.name}"></c:out>   </td>
<td> <c:out value="${stu.gender}"></c:out>   </td>
<td> <c:out value="${stu.dateofbirth}"></c:out>   </td>
<td> <c:out value="${stu.department}"></c:out>   </td>
<td> <c:out value="${stu.designation}"></c:out>   </td>
<td> <c:out value="${stu.cgpa}"></c:out>   </td>
<td> <c:out value="${stu.location}"></c:out>   </td>
<td> <c:out value="${stu.emailid}"></c:out>   </td>
<td> <c:out value="${stu.username}"></c:out>   </td>
<td> <c:out value="${stu.contactno}"></c:out>   </td>
<td> 

<a href='<c:url value='deleteemp?id=${stu.id}'></c:url>'>Delete</a>&nbsp;&nbsp;
<a href='<c:url value='viewempbyid?id=${stu.id}'></c:url>'>View</a>&nbsp;&nbsp;

</td>


</tr>

</c:forEach>

</table>

</body>
</html>

 
