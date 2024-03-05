<!DOCTYPE html>
<html>
<head>
<style>

body{
  color:white;
  background-color :lightblue;
  font-family: Garamond, serif;
  text-align:center;
  font-size:18px;
  outline:0;
  border:2px solid;
  padding:25px;
 background-size:300px 100px;
   };

* {
   box-sizing: border-box;
}

.imageColumn {
   float: left;
   width: 25%;
   padding: 10px;
}

.center {
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
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
  <li><a class="active" href="/">Home</a><li>
  <li><a href="adminlogin">Faculty Login</a></li>
  <li><a href="studentlogin">Student Login</a></li>
  <li><a href="mentorlogin">Mentor Login</a></li>
</ul>

<br><br><br>
<img src = "https://cdn.vanderbilt.edu/wp-content/uploads/sites/59/20200323102524/computer-test.jpg"  align= "center" width ="1300" height = "650"alt = "Test Image" />

 

</body>
</html>

 
