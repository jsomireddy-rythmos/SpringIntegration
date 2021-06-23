package com.example.demo.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.data.annotation.Id;

//import java.io.Serializable;
@XmlRootElement
public class Student  {

	//private static final long serialVersionUID = -7408851479146003262L;
    @Id
	private int id;
	private String name;
	private String school;
	public Student()
	{
		
	}
	
	public Student(int id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
	}  
     

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", school=" + school + "]";
	}

	public void setStudentId(String string) {
	
		
	}
}