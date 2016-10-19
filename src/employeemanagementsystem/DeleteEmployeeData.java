package employeemanagementsystem;

import java.util.ListIterator;
import java.util.Scanner;

public class DeleteEmployeeData extends ListEmployeeData {
	Scanner cin = new Scanner(System.in);
	public void deleteEmpData(){
		if(ListEmployeeData.employData.isEmpty()){
			System.out.print("There is nothing to Delete");
		}
		
	else{
		int empId, counter=0, flag=0;
		System.out.print("Please Enter the Employee ID whose data You want to delete :");
		empId = cin.nextInt();

		aa:
		for (EmployeeData data : ListEmployeeData.employData) {
			
			if(data.getEmpId()==empId){
				System.out.print("Employee ID Found");
				flag=1;
				break aa;}
			counter++;												//To get the Object Number
		}
		ListIterator<EmployeeData> itr = employData.listIterator();
		if(flag==1){
		for(int i = 0;i<=counter;i++){
			itr.next();												//To reach the Object Number
		}
		System.out.print("Deleting...");
		itr.remove();
		System.out.print("Deleted");
		}
		else
			System.out.print("Employee ID Not Found");
	}
	}
}