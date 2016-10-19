
package employeemanagementsystem;

import java.util.Scanner;

public class AddEmployeeData  {
	int empId, flag=0;
	String empName; // Name of the Employee
	String empDept; // Department of the Employee
	String empAdr; // Address of the Employee
	String empPN; // Phone Number of the Employee
	String empDoB; // Date of birth of the Employee
	String empSex; // Sex of the Employee
	String empMS; // Marriage Status of the Employee
	String empJT; // Job Title of the Employee
	String empDsgn; // Designation of the EMployee
	
	Scanner cin = new Scanner(System.in);
	AddEmployeeName name = new AddEmployeeName();
	AddEmployeeAddress adr = new AddEmployeeAddress();
	AddEmployeeDateOfBirth dob = new AddEmployeeDateOfBirth();
	public void addEmpData(){
	EmployeeData data = new EmployeeData();
	
	System.out.print("\nPlease Enter the Employee ID: ");
	empId = cin.nextInt();
	aa:
		for (EmployeeData data1 : ListEmployeeData.employData) {
		if(data1.getEmpId()==empId){
			System.out.print("ID already Exist: ID cannot be Added.\n");
			flag=1;
			break aa;
		}
		}
		if(flag==0){
	data.setEmpId(empId);

	
	empName = name.addEmployeeName(cin);
	data.setEmpName(empName);
	// System.out.print(empName); // for testing purpose
	
	System.out.print("Please Enter the Employee Department: ");
	empDept = cin.next();
	data.setEmpDept(empDept);
	
	//System.out.print("Please Enter the Employee Address: ");
	
	empAdr = adr.addEmployeeAddress(cin);
	data.setEmpAdr(empAdr);
	
	System.out.print("Please Enter the Employee Phone No.: ");
	empPN = cin.next();
	data.setEmpPN(empPN);

	
	empDoB = dob.addEmployeeDoB(cin);
	data.setEmpDoB(empDoB);
	
	System.out.print("Please Enter the Employee Sex: ");
	empSex = cin.next();
	data.setEmpSex(empSex);
	
	System.out.print("Please Enter the Employee Marital Status: ");
	empMS = cin.next();
	data.setEmpMS(empMS);
	
	System.out.print("Please Enter the Employee Job Title: ");
	empJT = cin.next();
	data.setEmpJT(empJT);
	
	System.out.print("Please Enter the Employee Designation: ");
	empDsgn = cin.next();
	data.setEmpDsgn(empDsgn);

	ListEmployeeData.employData.add(data);

		}
	}
}
