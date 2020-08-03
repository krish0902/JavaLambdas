package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		
		List<Person> people =Arrays.asList(
				new Person("Charles","ABc", 90),
				new Person("asd","Ac", 30),
				new Person("Ch","Bc", 20),
				new Person("Chles","c", 10),
				new Person("les","ABcd", 50)
				);
		
		// Step 1 : Sort List by last name
		
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//Step 2 : Create a method that prints all elements in the list
		
		printAll(people);
		
		
		//Step 3 : Create a method that prints all people that have last name beginning with A
		
		printLastNameWithA(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastName().startsWith("c");
			}
			
		});
		
	}
	
	private static void printLastNameWithA(List<Person> people, Condition condition)
	{
		for(Person p: people)
		{
			if(condition.test(p))
			{
				System.out.println(p);
			}
			
		}
	}
	
	private static void printAll(List<Person> people)
	{
		for(Person p: people)
		{
			System.out.println(p);
		}
	}
	
	interface Condition {
		boolean test(Person p);
	}

}
