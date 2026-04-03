package com.infinite.junit;

public class SwitchCaseEx3 {

	public void show(char ch) {
		switch(ch) {
			case 'a' :
			case '1' :
			case 'A' :
			case 'I' :
			case 'i' :
				System.out.println("Grade 1...");
				break;
			case 'b' :
			case '2' :
			case 'B' :
				System.out.println("Grade 2...");
				break;
			case 'c' :
			case 'C' :
			case '3' :
				System.out.println("Grade 3...");
				break;
			default :
				System.out.println("Invalid Choice...");
				break;
		}
	}
	public static void main(String[] args) {
		char choice='I';
		SwitchCaseEx3 obj = new SwitchCaseEx3();
		obj.show(choice);
	}
}
