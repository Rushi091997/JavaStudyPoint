package com.practice.abstractclasses;

abstract class MainManufactorerClass {				//Non-Pure abstract class
	//One of the methods is declared as well as defined.
	private String name;
	private String address;
	
	public abstract void rawMatarialPurchasing();  // only declaration (only method signature is written)
	public abstract void manufacture();    			// only declaration (only method signature is written)
	public void selling() {      					 // Declared & defined (has the method body)
		System.out.println("Selling");
	};
	
}


abstract class MainProducerClass { 				//Pure abstract class
	//All the methods are only declared
	private String name;
	private String address;
	
	public abstract void rawMatarialPurchasing(); // only declaration (only method signature is written)
	public abstract void manufacture();			  // only declaration (only method signature is written)
	
}



//We cannot achieve multiple inheritance with abstract classes . This can be achieved using interface
class SampleClass extends MainManufactorerClass  {

	@Override
	public void rawMatarialPurchasing() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		
	}
 
	
}








/*

class Carmanufactoror extends MainManufactorerClass {
	
	private String brand;
	

	@Override
	public void rawMatarialPurchasing() {
		System.out.println("rawMatarialPurchasing inside Carmanufactoror class");
	}

	@Override
	public void manufacture() {
		System.out.println("manufacture inside Carmanufactoror class");
		
	}
	
	protected void marketing(){
		System.out.println("marketing inside Carmanufactoror class");
	}
	
}



class Laptopmanufactoror extends MainManufactorerClass {
	
	private String brand;
	

	@Override
	public void rawMatarialPurchasing() {
		System.out.println("rawMatarialPurchasing inside Laptopmanufactoror class");
	}

	@Override
	public void manufacture() {
		System.out.println("manufacture inside Laptopmanufactoror class");
		
	}
	
}

 
 
*/