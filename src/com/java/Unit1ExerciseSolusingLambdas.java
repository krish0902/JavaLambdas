package com.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Unit1ExerciseSolusingLambdas {

public static void main(String[] args) {
		
		
		List<Person> people =Arrays.asList(
				new Person("Charles","ABc", 90),
				new Person("asd","Ac", 30),
				new Person("Ch","Bc", 20),
				new Person("Chles","c", 10),
				new Person("les","ABcd", 50)
				);
		
		// Step 1 : Sort List by last name
		
		Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()) );
		
		//Step 2 : Create a method that prints all elements in the list
		
		performConditionally(people, p->true, p ->System.out.println(p));
		
		
		//Step 3 : Create a method that prints all people that have last name beginning with A
		
		performConditionally(people, p -> p.getLastName().startsWith("A"), p ->System.out.println(p));
		
	}
	
	private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer )
	{
		for(Person p: people)
		{
			if(predicate.test(p))
			{
				consumer.accept(p);
			}
			
		}
	}
	

}
