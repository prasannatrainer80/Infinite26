package com.infinite.junit;

public class SwitchCaseEx2 {

	public void show(String name) {
		switch(name) {
		case "Rajitha" :
			System.out.println("Hi I am Rajitha...");
			break;
		case "Uday" :
			System.out.println("Hi I am Uday...");
			break;
		case "Ammar" :
			System.out.println("Hi I am Ammar...");
			break;
		case "Padma" :
			System.out.println("HI I am Padma...");
			break;
		case "Teja" :
			System.out.println("HI I am Teja...");
			break;
		default : {
			System.out.println("Invalid Choice...");
		}
		}
	}
	public static void main(String[] args) {
		String name="Rajitha";
		SwitchCaseEx2 obj = new SwitchCaseEx2();
		obj.show(name);
	}
}
