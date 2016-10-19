package employeemanagementsystem;

import java.util.Scanner;

public class AddEmployeeName{

	
	String empName;
	
	public String addEmployeeName(Scanner cin) {
		
		String empFirstName;
		//String empMiddleName;
		String empLastName;
		
		System.out.print("Please Enter the Employee First Name: ");
		empFirstName = cin.next();
		//System.out.print("Please Enter the Employee Middle Name: ");
		//empMiddleName = cin.next();
		System.out.print("Please Enter the Employee Last Name: ");
		empLastName = cin.next();
	
		empName = empFirstName.concat(" "+empLastName);
		return empName;
		//data.setEmpName(empName);
		
	}

}
