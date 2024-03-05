package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService 
{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addstudent(Student student) 
	{
		
		return studentRepository.save(student);
	}

	@Override
	public Student checkstulogin(String suname, String spwd) 
	{
		
		return studentRepository.checkstulogin(suname, spwd);
	}

	@Override
	public Student viewstudent(String suname)
	{
		return studentRepository.viewStudent(suname);
	}

	@Override
	public int changestudentpassword(String soldpwd, String snewpwd, String suname)
	{
		return studentRepository.updatestupassword(snewpwd, soldpwd,suname);
		
	}

}
