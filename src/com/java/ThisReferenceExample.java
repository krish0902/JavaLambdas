package com.java;

public class ThisReferenceExample {

	
	public void doProcess(int i, Process p)
	{
		p.process(i);
	}
	
	public void execute()
	{
		doProcess(10, i -> {
			System.out.println("Value of i is "+i);
			System.out.println(this);
		});
	}
	
	public static void main(String[] args)
	{
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
	
// // The static method cannot contain this reference 
// // The anonymous inner class overrides the this reference while the lambdas does not override the this reference

// // lambdas implementation
		
//		thisReferenceExample.doProcess(10, i -> {
//			System.out.println("Value of i is "+i);
//			System.out.println(this);
//		});
		
		thisReferenceExample.execute();
		
//		// anonymous inner class implementation
//		thisReferenceExample.doProcess(10, new Process() {
//
//			@Override
//			public void process(int i) {
//				System.out.println("Value of i is "+i);
//				System.out.println(this);
//			}
////			public String toString()
////			{
////				return "This is the anonymous inner class";
////			}
//			
//		});
		
		
	}
	
}
