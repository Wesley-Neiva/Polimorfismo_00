package application;

import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		
		OutsourcedEmployee employee = new OutsourcedEmployee("João", 5, 100.0, 0.0);
		
		employee.additional(200);
		System.out.println(employee.getAdditionalCharge());

	}

}
