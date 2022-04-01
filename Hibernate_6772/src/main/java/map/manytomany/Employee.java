package map.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee 
{
	@Id
	private int empid;
	
	@Column
	private String empName;
	
	@ManyToMany(mappedBy = "employee" , cascade= CascadeType.ALL)
	List<Project> project;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", project=" + project + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empid, String empName, List<Project> project) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.project = project;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}
	
	
}
