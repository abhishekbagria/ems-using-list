package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeeData {
//	int counter=0;
	
	public static List<EmployeeData> employData = new ArrayList<EmployeeData>();
	
	public void listEmpData(){
		if(ListEmployeeData.employData.isEmpty()){
			System.out.print("There is nothing to Show.\n");
		}
		else{
		
		System.out.println("ID\tName\t\tDepartment\tAddress\t\t\t\t\t\t\t\t\tPhone No.\tDate of Birth"
				+ "\tSex\tMarital Status\tJob Title\tDesignation");
		
		for (EmployeeData data : employData) {
			
			System.out.print(data.getEmpId()+"\t");
			System.out.print(data.getEmpName()+"\t");
			System.out.print(data.getEmpDept()+"\t\t");
			System.out.print(data.getEmpAdr()+"\t");
			System.out.print(data.getEmpPN()+"\t");
			System.out.print(data.getEmpDoB()+"\t");
			System.out.print(data.getEmpSex()+"\t");
			System.out.print(data.getEmpMS()+"\t");
			System.out.print(data.getEmpJT()+"\t");
			System.out.println(data.getEmpDsgn());
		}
		
		System.out.println(employData.size());
	}
}
}