package com.practice.javaprograms.a;

class PracticeJava {

	private static String b = null;
	static {
		System.out.println("Clas is loaded");
		b = "New Value2";
	}
	
	static {
		System.out.println("Clas is loaded");
		b = "New Value1";
	}
	
	public final String a = "A";
	
	public final String c = "C";
	
	
	
	public static void main(String[] args) {
		System.out.println(b);
		System.out.println("Inside main");
	}
	 
	
	 
}

//Static variables are class level variables and not Object level vars
//Static variables are loaded at the time of class loading
//Static variables are created with single copy throughout the project
//non static variables are not accessible from static methods.
//Static block - Block that executes at the time of class loading. Executes sequentially after variable declaration.


 
class MainClass {
	
	public static void main(String[] args) {
		System.out.println("");
		PracticeJava p = new PracticeJava()
	
		 
	} 	
}

