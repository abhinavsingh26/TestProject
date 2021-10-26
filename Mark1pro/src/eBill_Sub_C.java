import java.util.Scanner;

public class eBill_Sub_C 
{
	String cus_num;
	String cus_name;
	float unit_consumption;
	double totalBill = 0 ;
		
	public void readdata()
	{
			Scanner read = new Scanner(System.in);
			System.out.print("Employee Phone Number = ");
			cus_num = read.nextLine();
			System.out.println("Employee Name = ");
			cus_name = read.nextLine();
			System.out.println("Employee Unit Consumed = ");
			unit_consumption = read.nextFloat();
			read.close();
	}
	
	double computeBill()
	{
	
		if(unit_consumption <= 100)
		{
			totalBill = (unit_consumption * 1.20);
		}
		else if(unit_consumption > 100 && unit_consumption <= 200 )
		{
			totalBill = (100 * 1.20) + ((unit_consumption - 100) * 2.00);
		}
		else if(unit_consumption > 200 && unit_consumption <= 300)
		{
			totalBill =(100 * 1.20) + (100 * 2.00) +((unit_consumption - 200) * 3.00);
		}
		else if(unit_consumption > 300)
		{
			totalBill =(100 * 1.20) + (100 * 2.00) + (100 * 3.00) +((unit_consumption - 300) * 5.00);
		}
		return totalBill;
	}
	void displayBill()
	{
		
		System.out.println(cus_name+ " Mobile No is : "+ cus_num + " ." );
		System.out.println( "Bill of :"+ cus_name + "'s unit consumption (" + "unit_consumption" +") is "+ totalBill );
		
	}
	
}
