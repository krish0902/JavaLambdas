package com.java.lambdas;

import java.util.Arrays;
import java.util.List;

import com.java.Person;

public class CollectionIteration {

	public static void main(String[] args) {
		
		List<Person> people =Arrays.asList(
				new Person("Charles","ABc", 90),
				new Person("asd","Ac", 30),
				new Person("Ch","Bc", 20),
				new Person("Chles","c", 10),
				new Person("les","ABcd", 50)
				);
		
		
		// External Iterators are sequential
		System.out.println("Using for loop");
		for(int i=0;i<people.size();i++)
		{
			System.out.println(people.get(i));
		}
		
		System.out.println("Using for in loop");
		for(Person p : people)
		{
			System.out.println(p);
		}
		
		// Internal Iterators can run on multiple threads by runtime
		System.out.println("Using lambda for each loop");
		people.forEach(p -> System.out.println(p));
		
		// using method reference
		people.forEach(System.out::println);
		
		
		
		
		
		
	}

}
