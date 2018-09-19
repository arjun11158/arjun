package com.nucleus.pojo;

public class Employee extends User1{
	
	
	public String designation;
	public int Salary;
	public int deptId;
	public String deptName;
	public String joiningDate;
	private static int count;
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public Employee()
	{
		count++;
		
	}

	@Override
	public String toString() {
		return "Employee [Uname=" + Uname + ", UserId=" + UserId +" designation=" + designation + ", Salary=" + Salary + ", deptId=" + deptId + ", deptName="
				+ deptName + ", joiningDate=" + joiningDate; 
	}
	


}
