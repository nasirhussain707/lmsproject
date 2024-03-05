package com.klef.jfsd.springboot.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Mentor;
import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.StudentService;

@Controller
public class ClientController
{
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private StudentService StudentService;
	
	@GetMapping("/")
	public String mainhomedemo()
	{
		return "index";
	}
	@GetMapping("/mentorlogin")
	public ModelAndView mentorlogindemo()
	{
		ModelAndView mv = new ModelAndView("mentorlogin");
		return mv;
	}
	@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
	 	ModelAndView mv = new ModelAndView("adminlogin");
		return mv;
	}
	@GetMapping("/studentlogin")
	public ModelAndView studentlogindemo()
	{
		ModelAndView mv = new ModelAndView("studentlogin");
		return mv;
	}
	@GetMapping("/studentreg")
	public ModelAndView studentregdemo()
	{
			 ModelAndView mv = new ModelAndView("studentregistration","stu",new Student());
			 return mv;
	}
	@GetMapping("/mentorhome")
	public ModelAndView mentorhomedemo()
	{
		ModelAndView mv = new ModelAndView("mentorhome");
		return mv;
	}
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv = new ModelAndView("adminhome");
		return mv;
	}
	@GetMapping("/studenthome")
	public ModelAndView studenthomedemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView("studenthome");
		HttpSession session = request.getSession();
		String suname = (String) session.getAttribute("suname");
		mv.addObject("suname", suname);
		return mv;
	}
	@GetMapping("/viewallstudents")
	public ModelAndView viewallstudemo()
	{
		ModelAndView mv = new ModelAndView("viewallstudents");
		List<Student> stulist=adminService.viewallstudents();
		mv.addObject("stulist",stulist);
		return mv;
	}
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String auname=request.getParameter("auname");
		String apwd=request.getParameter("apwd");
		
		Admin admin = adminService.checkadminlogin(auname, apwd);
		
		if(admin!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("auname", auname);
			mv.setViewName("adminhome");
		}
		else
		{
			mv.setViewName("adminhome");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@PostMapping("/checkmentorlogin")
	public ModelAndView checkmentorlogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String muname=request.getParameter("muname");
		String mpwd=request.getParameter("mpwd");
		
		Mentor mentor = adminService.checkmentorlogin(muname, mpwd);
		
		if(mentor!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("muname", muname);
			mv.setViewName("mentorhome");
		}
		else
		{
			mv.setViewName("mentorhome");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@PostMapping("/checkstulogin")
	public ModelAndView checkstulogindemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		
		String suname=request.getParameter("suname");
		String spwd=request.getParameter("spwd");
		
		Student stu = StudentService.checkstulogin(suname, spwd);
		
		if(stu!=null)
		{
			HttpSession session = request.getSession();
			session.setAttribute("suname", suname);
			mv.setViewName("studenthome");
		}
		else
		{
			mv.setViewName("studentlogin");
			mv.addObject("msg","Login Failed");
		}
		return mv;
	}
	@PostMapping("/addstudent")
	public String addstudentdemo(@ModelAttribute("stu") Student student)
	{
		StudentService.addstudent(student); 
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("studentregistration");
//		mv.addObject("msg", "student Registration Successfully");
		return "redirect:studentlogin";
	}
	
	@GetMapping("/deletestu")
	public String deletestudemo(@RequestParam("id") int sid)
	{
		adminService.deletestudent(sid);
		return "redirect:viewallstudents";
	}
	@GetMapping("/viewstu")
	public ModelAndView viewstudentdemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String suname = (String) session.getAttribute("suname");
		
		Student stu =  StudentService.viewstudent(suname);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewstu");
		mv.addObject("stu", stu);
		return mv;
	}
	@GetMapping("/schangepwd")
	public ModelAndView schangepwddemo(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		String suname = (String) session.getAttribute("suname");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("stuchangepwd");
		mv.addObject("suname", suname);
		return mv;
	}
	
	@PostMapping("/updatestupassword")
	public ModelAndView updatestupwddemo(HttpServletRequest request)
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("stuchangepwd");
		HttpSession session = request.getSession();
		String suname = (String) session.getAttribute("suname");
		String soldpwd = request.getParameter("soldpwd");
		String snewpwd = request.getParameter("snewpwd");
		System.out.println(suname+","+soldpwd+","+snewpwd);
		
		int n  = StudentService.changestudentpassword(soldpwd, snewpwd, suname);
		if(n>0)
		{
			
			mv.addObject("msg","Password updated successfully");
		}
		else
		{
			
			mv.addObject("msg","Old Password is Incorrect");
		}
		return mv;
	}
	
	@GetMapping("/viewstubyid")
	public ModelAndView viewstubyiddemo(@RequestParam("id") int sid)
	{
		Student stu = adminService.viewstudentbyid(sid);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("viewstubyid");
		mv.addObject("stu",stu);
		return mv;
	}
	
	
	}
