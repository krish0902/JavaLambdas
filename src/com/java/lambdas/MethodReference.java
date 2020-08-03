package com.java.lambdas;

public class MethodReference {

	public static void main(String[] args) {
		
		//Thread t = new Thread(() -> printMessage());
		
		Thread t =new Thread(MethodReference::printMessage);  // MethodReference::printMessage is same as () -> printMessage()  
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}

}
