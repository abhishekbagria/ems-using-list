package employeemanagementsystem;

import java.util.Scanner;


public class AddEmployeeDateOfBirth {
	String empDoB;
	public String addEmployeeDoB(Scanner cin){
		String s1 = "";
		String empDate;
		String empMonth;
		String empYear;
		System.out.println("Employee Date Of Birth Details");
		System.out.print("Please Enter the Date: ");
		empDate = cin.next();
		System.out.print("Please Enter the Month: ");
		empMonth = cin.next();
		System.out.print("Please Enter the Year: ");
		empYear = cin.next();
			
		empDoB = s1.concat(empDate).concat("/"+empMonth).concat("/"+empYear);
		
		
		return empDoB;
		
	}

}
