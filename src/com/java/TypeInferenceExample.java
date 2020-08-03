package com.java;

public class TypeInferenceExample {

	public static void main(String[] args)
	{
		printLambda(s ->s.length()); //no need for type String as it will infer from interface and no need for () because only one input argument
		
	}
	
	public static void printLambda(StringLengthLambda l)
	{
		System.out.println(l.getLength("Sai"));
		
	}
	
	interface StringLengthLambda{
		int getLength(String s);
	}
	
	
}
