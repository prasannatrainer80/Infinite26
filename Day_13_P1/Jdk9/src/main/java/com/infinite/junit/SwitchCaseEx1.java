package com.infinite.junit;

public class SwitchCaseEx1 {

	public void show(int choice) {
		switch(choice) {
		case 1 :
			System.out.println("Hi I am Uday Kumar...");
			break;
		case 2 :
			System.out.println("Hi I am Srinivas...");
			break;
		case 3 :
			System.out.println("Hi I am Bhaveen...");
			break;
		case 4 :
			System.out.println("Hi I am Surya...");
			break;
		case 5 :
			System.out.println("Hi I am Ammar...");
			break;
		}
	}
	public static void main(String[] args) {
		int choice = 4;
		SwitchCaseEx1 obj = new SwitchCaseEx1();
		obj.show(choice);
	}
}
