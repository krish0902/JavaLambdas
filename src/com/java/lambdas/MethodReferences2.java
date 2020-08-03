package com.java.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.Person;

public class MethodReferences2 {

	public static void main(String[] args) {
		
		
		List<Person> people =Arrays.asList(
				new Person("Charles","ABc", 90),
				new Person("asd","Ac", 30),
				new Person("Ch","Bc", 20),
				new Person("Chles","c", 10),
				new Person("les","ABcd", 50)
				);
		
		// Print all persons
		
		performConditionally(people, p->true, System.out::println); // p -> method(p)
	
		
		
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
