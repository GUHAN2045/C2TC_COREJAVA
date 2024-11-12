package com.tns.ifet.dayseven.overriding;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBI rbi;

//		Dynamic binding assigning child class object to parent class reference variable.
		rbi = new SBI();
		System.out.println(rbi.getRateOfInterest());

		rbi = new ICIC();
		System.out.println(rbi.getRateOfInterest());

		rbi = new HDFC();
		System.out.println(rbi.getRateOfInterest());

	}

	}


