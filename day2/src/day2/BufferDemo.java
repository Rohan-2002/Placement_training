package day2;
import java.io.*;
public class BufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int salary;
		
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
		
		
		 System.out.print("Enter name : ");
		 
		 name = br.readLine();
		 
		 System.out.print("Enter Salary : ");
		 
		 salary = Integer.parseInt(br.readLine());
		 
		 System.out.println("Name : " + name + " salary : " + salary); 
		}
		catch(Exception e) {}
		
	}
	

}
