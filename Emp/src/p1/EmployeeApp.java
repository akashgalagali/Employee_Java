package p1;
import java.util.*;
public class EmployeeApp {

	public static void main(String[] args) {
		int j=0;
		Employee emp[]=new Employee[50];
		emp[0]=new Employee("Ram",7000,5);
		emp[1]=new Employee("Ramesh",17000,10);
		emp[2]=new Employee("Krishna",45000,10);
		System.out.println("Enter the Details of Employee:");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		int salary=sc.nextInt();
		int exp=sc.nextInt();
	
		EmpService empser=new EmpService(emp[3]);
		boolean sta=false;
		try {
			sta=empser.EmpCheck( exp,salary);	
	} catch (Exception e) {
		System.out.println(e);
	}
		if(sta) {
			emp[3]=new Employee(name,salary,exp);
			System.out.println("Employee added ");
		}
		else {
			
			System.out.println("exception");
		}
	try {
		for (int i = 0; i <emp.length; i++) {
			System.out.println("==============");
			emp[i].Display();
			j=i;
		}
	}
	catch(Exception e) {
		System.out.println("We have only "+(j+1)+"Employees");
	}
		for (int i = 0; i < 3; i++) {
			emp[i].DisplaybasedOnsal(7000);
		}
		for (int i = 0; i < 3; i++) {
			emp[i].DisplaybasedOnexp(5);
		}
		int sal1=5000,sal2=20000;
		for (int i = 0; i < 3; i++) {
			emp[i].Displayrangesal(sal1,sal2);
		}
		System.out.println("Enter the new salary and new exp:");
		int newsal=sc.nextInt();
		int newexp=sc.nextInt();

		EmpService newempser=new EmpService(emp[1]);
		boolean s=false;
		try {
			s=newempser.EmpCheck( newexp,newsal);	
	} catch (Exception e) {
		System.out.println(e);
	}
		if(s) {
			emp[1].EditEmp("Ramesh", salary, exp);
			System.out.println("Employee edited  ");
			emp[1].Display();
		}
		else {
			
			System.out.println("Exception");
		}
		
	}
}
