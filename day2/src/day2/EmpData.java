package day2;
import java.util.Scanner;

public class EmpData {

	String empName, empAddress;
	int empContact;
	
	public EmpData() {
		this.empName = "ABC";
		this.empAddress = "XYZ";
		this.empContact = 0000;
	}
	
	public EmpData(String name, String Address,int contact) {
		empName = name;
		empAddress = Address;
		empContact = contact;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpContact() {
		return empContact;
	}

	public void setEmpContact(int empContact) {
		this.empContact = empContact;
	}
	
	

	
	@Override
	public String toString() {
		return "EmpData [empName=" + empName + ", empAddress=" + empAddress + ", empContact=" + empContact + "]";
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			EmpData ed = new EmpData();
			System.out.print("Default values : ");
			System.out.println(ed);
			EmpData ed2 = new EmpData("Mayur","Bhuj",901109);
			System.out.print("Parameterized constructor invoked : ");
			System.out.println(ed2);
			System.out.print("Enter your name : ");
			String name = sc.next();
			System.out.print("Enter your address : ");
			String address = sc.next();
			System.out.print("Enter your contact : ");
			int contact = sc.nextInt();

			ed.setEmpName(name);
			ed.setEmpAddress(address);
			ed.setEmpContact(contact);
			
			System.out.println(ed);
		}

	}

}
