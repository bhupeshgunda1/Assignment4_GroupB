package com.va.week8.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.va.week8.beans.Doctor;

public class DoctorDao {
	
	
	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int save(Doctor d){  
	//    String sql="insert into Emp99(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";  
	 //   return template.update(sql); 
		
		String sql= "insert into Doctor(doctor_Id,doctor_name) values('"+d.getDoctor_id()+"',"+d.getDoctor_name()+"')";
		return template.update(sql);
	}  
	/*
	public int update(Emp p){  
	    String sql="update Emp99 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";  
	    return template.update(sql);  
	}  
	public int delete(int id){  
	    String sql="delete from Emp99 where id="+id+"";  
	    return template.update(sql);  
	}  
	public Emp getEmpById(int id){  
	    String sql="select * from Emp99 where id=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));  
	}  
	public List<Emp> getEmployees(){  
	    return template.query("select * from Emp99",new RowMapper<Emp>(){  
	        public Emp mapRow(ResultSet rs, int row) throws SQLException {  
	            Emp e=new Emp();  
	            e.setId(rs.getInt(1));  
	            e.setName(rs.getString(2));  
	            e.setSalary(rs.getFloat(3));  
	            e.setDesignation(rs.getString(4));  
	            return e;  
	        }  
	    });  
	}  
*/
}
