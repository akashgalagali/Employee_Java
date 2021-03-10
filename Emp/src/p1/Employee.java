package p1;

public class Employee {
private String name;
private int salary;
private int exp;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee(String name, int salary, int exp) {
	super();
	this.name = name;
	this.salary = salary;
	this.exp = exp;
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public int getExp() {
	return exp;
}
public void setExp(int exp) {
	this.exp = exp;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", salary=" + salary + ", exp=" + exp + "]";
}
public void EditEmp(String name,int salary,int exp) {
		if(this.name.equals(name))
		{
			this.setSalary(salary);
			this.setExp(exp);
			
		}	
	
}
public void DisplaybasedOnsal(int sal) {
	if(this.getSalary()==sal)
		System.out.println("Employee with Salary "+sal+name);
}

public void Displayrangesal(int sal1,int sal2) {
	if(this.getSalary()>=sal1 && this.getSalary()<=sal2)
		System.out.println("Employee with Salary "+getSalary()+name);
}
public void Displayrangeexp(int exp1,int exp2) {
	if(this.getExp()>=exp1 && this.getExp()<=exp2)
		System.out.println("Employee with Salary "+getExp()+name);
}
public void DisplaybasedOnexp(int exp) {
	if(this.getExp()==exp)
		System.out.println("Employee with Exp "+exp+" "+name);
}
public void Display() {
	System.out.println("Name:"+name);
	System.out.println("Salary:"+salary);
	System.out.println("Exp:"+exp);
}
public void AddEmp(String name,int salary,int exp) {
	this.setName(name);
	this.setSalary(salary);
	this.setExp(exp);
}

}
