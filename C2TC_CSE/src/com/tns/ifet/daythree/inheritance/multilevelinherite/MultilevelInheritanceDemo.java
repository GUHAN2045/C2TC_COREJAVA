package com.tns.ifet.daythree.inheritance.multilevelinherite;
import java.util.Date;
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Surya", 7878767676l, new Date(2002, 12, 2));
		System.out.println(p1);
		p1 = new Employee("deva", 8080807070l, new Date(2004, 05, 07), "Sales", 45000);
		System.out.println(p1);
		p1 = new LevelOneEmployee("Guhan", 9880807227l, new Date(2003, 15, 02), 
		"Account", 85000, 200,
		"Signing Authority");
		System.out.println(p1);
	}

}