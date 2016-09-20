package prob5;

public class Depart extends Employee {
	String department;
	
	Depart(String name, int salary, String department)
	{
		this.name=name;
		this.salary=salary;
		this.department=department;
	}
	public void getInformation()
	{
		System.out.println("이름: "+ name +" 연봉: "+salary+" 부서: "+department);
	}
}
