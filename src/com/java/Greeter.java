package com.java;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args)
	{
		Greeter greeter = new Greeter();
		
		Greeting helloWorldGreeting = new HelloWorldGreeting(); // Creating an class instance to implement the method in the interface
		
		Greeting myLambdaFunction =() -> System.out.println("Hi SAI KRISHNA"); // Writing an action to implement an interface instead of a class 
		
		Greeting innerClassGreeting = new Greeting() {
			public void perform() {
				System.out.println("Hello world");
			}
		};
		
		
		greeter.greet(helloWorldGreeting);
		greeter.greet(myLambdaFunction);
		greeter.greet(innerClassGreeting);
		
		
		
		
		
		MyAdd addFunction = (int a,int b) -> a+b;
		
		
		
//		doubleNumberFunction =(int a) -> a*2;
//		

//		
//		safeDivideFunction = (int a ,int b) -> {
//			
//			if(b==0) return 0;
//			return a/b;
//		};
//		
//		stringLengthCountFunction = (String s) ->s.length();
//		
		
		
	}
	
}


interface MyAdd{
	int add(int x,int y);
	
}
