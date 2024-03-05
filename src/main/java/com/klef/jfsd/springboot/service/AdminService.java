package com.klef.jfsd.springboot.service;

import java.util.List;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Mentor;
import com.klef.jfsd.springboot.model.Student;

public interface AdminService
{
	public Admin checkadminlogin(String suname,String spwd);
	public Mentor checkmentorlogin(String muname,String mpwd);
	public List<Student> viewallstudents();
	public void deletestudent(int id);
	public Student viewstudentbyid(int id);
}
