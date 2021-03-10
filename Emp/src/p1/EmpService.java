package p1;

public class EmpService {
Employee emp;

public EmpService(Employee emp) {
	super();
	this.emp = emp;
}
public boolean EmpCheck(int exp1 ,int sal1)throws WrongSalaryException
{

	boolean status = false;
	
	if((exp1<3 && sal1>10000)||sal1>50000)
	{
		status = false;
		throw new WrongSalaryException(exp1,sal1);
	}
	else
	{
		status = true;
		System.out.println("No exceptions..");
	}
	
	return status;
	
	
}


}
