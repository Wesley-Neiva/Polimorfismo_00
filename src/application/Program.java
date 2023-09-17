package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee emp = new Employee();
		OutsourcedEmployee outsourced = new OutsourcedEmployee();
		
				
		System.out.println("Enter the number of employees:");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i + " data:");
			sc.nextLine();
			System.out.print("Outsourced (y/n)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			if(ch == 'n') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();
				emp = new Employee(name, hours, valuePerHour);
				emp.payment();
				
				
					
				
			} if(ch != 'n') {
				System.out.print("Name: ");
				String name = sc.nextLine();
				System.out.print("Hours: ");
				int hours = sc.nextInt();
				System.out.print("Value per hour: ");
				double valuePerHour = sc.nextDouble();	
				System.out.print("Addition charge: ");
				double additional = sc.nextDouble();
				outsourced = new OutsourcedEmployee(name, hours, valuePerHour, additional);
				outsourced.additional(additional);
				
				
			}
						
		}
		
		sc.close();
		System.out.println(emp.toString());
		System.out.println(outsourced.toString());
	}
}
		
	
		
		
	
			
	