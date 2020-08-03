package com.java;

public class ClousersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =10;
		int b=20;
		doProcess(a, i ->System.out.println(i+b));
	}
	
	public static void doProcess(int i ,Process p)
	{
		p.process(i);
	}

}

interface Process{
	void process(int i);
}
