package com.tns.ifet.daytwo;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x='d';
		switch (x) 
		{
			case 'l'->System.out.println(x+" is a Letter");
			case 'd'->System.out.println(x+" is a Digit");
			case 'w'->System.out.println(x+" is White Space");
			case 's'->System.out.println(x+" is Special Symbol");
			default->System.out.println(x+" is other than letter, digit, space or special symbol ");
		}
	}

}
