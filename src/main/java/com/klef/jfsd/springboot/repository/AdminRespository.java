package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Mentor;

@Repository
public interface AdminRespository extends CrudRepository<Admin, String>
{
@Query("select a from Admin a where username=?1 and password=?2")
public Admin checkadminlogin(String uname,String pwd);

@Query("select m from Mentor m where username=?1 and password=?2")
public Mentor checkmentorlogin(String uname,String pwd);

}
