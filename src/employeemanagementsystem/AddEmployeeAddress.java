package employeemanagementsystem;

import java.util.Scanner;

public class AddEmployeeAddress {

String empAdr;
	
	public String addEmployeeAddress(Scanner cin) {
		String s1 = "House No.";
		String empHouseNumber;
		String empStreet;
		String empVillageOrTown;
		String empCity;
		String empState;
		String empCountry;
		String empPinCode;
		
		System.out.print("Please Enter the Employee House Number: ");
		empHouseNumber = cin.next();
		System.out.print("Please Enter the Employee Street: ");
		empStreet = cin.next();
		System.out.print("Please Enter the Employee Village or Town: ");
		empVillageOrTown = cin.next();
		System.out.print("Please Enter the Employee City: ");
		empCity = cin.next();
		System.out.print("Please Enter the Employee State: ");
		empState= cin.next();
		System.out.print("Please Enter the Employee Country: ");
		empCountry= cin.next();
		System.out.print("Please Enter the Employee PinCode: ");
		empPinCode= cin.next();
		
		//cin.close();
		
		empAdr = s1.concat(empHouseNumber).concat(", Street "+empStreet).concat(", "+empVillageOrTown).concat(", "+empCity).concat(", "+empState).concat(", "+empCountry).concat("-"+empPinCode);
		return empAdr;
		//data.setEmpName(empName);
		
	}
}
