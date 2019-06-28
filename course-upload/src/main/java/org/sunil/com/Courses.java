package org.sunil.com;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.poiji.annotation.ExcelCellName;


@Entity
@Table(name = "COURSES")
public class Courses {


	@Id
	@GeneratedValue
	@Column(name="ID")
	private int id;

	@ExcelCellName("COURSE_TYPE")
	@Column(name= "COURSE_TYPE")
	private String courseType;

	@ExcelCellName("MODUL")
	@Column(name= "MODUL")
	private String modul;

	@ExcelCellName("SUB_MODULE")
	@Column(name= "SUB_MODULE")
	private String subModule;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public String getModul() {
		return modul;
	}

	public void setModul(String modul) {
		this.modul = modul;
	}

	public String getSubModule() {
		return subModule;
	}

	public void setSubModule(String subModule) {
		this.subModule = subModule;
	}
	
	

}
