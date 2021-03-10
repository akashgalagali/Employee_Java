package p1;

public class WrongSalaryException extends Exception{
int exp1;
int sal;

public WrongSalaryException(int exp1,int sal) {
	
	this.exp1 = exp1;
	this.sal=sal;
}
public String toString() {
	return "WrongSalaryException :-"+"experience"+exp1+"salary"+sal;
}

}
