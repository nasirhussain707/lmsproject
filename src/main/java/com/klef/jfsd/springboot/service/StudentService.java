package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Student;

public interface StudentService 
{
	public Student addstudent(Student student);
	public Student checkstulogin(String suname,String spwd);
	public Student viewstudent(String suname);
	public int changestudentpassword(String soldpwd,String snewpwd,String suname);
}
