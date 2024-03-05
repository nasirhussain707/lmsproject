package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Mentor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.AdminRespository;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	private AdminRespository adminRespository;
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Admin checkadminlogin(String uname, String pwd)
	{
		return adminRespository.checkadminlogin(uname, pwd);
		 
	}
	@Override
	public Mentor checkmentorlogin(String uname, String pwd)
	{
		return adminRespository.checkmentorlogin(uname, pwd);
		 
	}
	@Override
	public List<Student> viewallstudents()
	{
		
		return (List<Student>) studentRepository.findAll();
	}
	@Override
	public void deletestudent(int id)
	{
		
	 studentRepository.deleteById(id);
		
	}
	@Override
	public Student viewstudentbyid(int id) 
	{
		
		return studentRepository.findById(id).get();
	}

}
