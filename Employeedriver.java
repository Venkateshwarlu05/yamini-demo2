package Collage.cse.Employee;


import java.util.Date;


public class Employee {
	private int empnumber;
	private String empname;
	private Date joiningdate;
	private double Salary;
	
	public Employee(int empNumber, String empName, Date joiningDate, double salary) {
		
		this.empnumber = empNumber;
		this.empname = empName;
		this.joiningdate = joiningDate;
		this.Salary = salary;
	}
	
	
 
 public int getEmpnumber() {
	return empnumber;
	
}
 public void setEmpnumber(int empnumber) {
	this.empnumber = empnumber;
}
 public String getEmpname() {
	return empname;
}
 public void setEmpname(String empname) {
	this.empname = empname;
}
 public Date getJoiningdate() {
	return joiningdate;
}
 public void setJoiningdate(Date joiningdate) {
	this.joiningdate = joiningdate;
 }
	
 public double getSalary() {
	return Salary;
}
 public void setSalary(double salary) {
	Salary = salary;
}
public String empdetails(){
	
	return "Employee Number: "+ empnumber+"\nEmployee Name: "+ empname+"\nJoining Date: "+ joiningdate+"\nSalary:"+Salary;
	
}
}

package Collage.dep.EmployeeDriver;



import Collage.cse.Employee.Employee;

public class Employeedriver {
	

public static void main (String[] args) {
	Employee Shashi = new Employee(1,"Shashi",null,60000);
	System.out.println(Shashi.empdetails());
	
	Employee Ketan = new Employee(2,"Ketan",null, 50000);
	System.out.println("\n"+Ketan.empdetails());
	
	Employee Tarun = new Employee(3,"Bharath",null,45000);
	System.out.println("\n"+Tarun.empdetails());
}
} 