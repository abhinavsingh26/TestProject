import java.util.Scanner;

public class emp 
{
	int empno;
	String empname;
	String designation;
	String dept;
	long salary;
	
	void readempdata()
	{
		Scanner read = new Scanner(System.in);
		
		System.out.print("Employee Number = "); 
		empno = read.nextInt();
		
		System.out.println("Employee Name = ");
		empname = read.next();
		
		System.out.println("Employee designation = ");
		designation = read.next();
		
		System.out.println("Employee department = ");
		dept = read.next();
		
		System.out.println("Employee Salary = ");
		salary = read.nextLong();
		
		
		
	}
	
	void displayempdata()
	{
		System.out.println(empno);
		System.out.println(empname);
		System.out.println(designation);
		System.out.println(dept);
		System.out.println(salary);
	}
}
