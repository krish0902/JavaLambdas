package com.java.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.java.Person;

public class Streams {

	public static void main(String[] args) {
		
		List<Person> people =Arrays.asList(
				new Person("Charles","ABc", 90),
				new Person("asd","Ac", 30),
				new Person("Ch","Bc", 20),
				new Person("Chles","c", 10),
				new Person("les","ABcd", 50)
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("c"))
		.forEach(p -> System.out.println(p.getFirstName()));
		
		long count =people.stream()
		.filter(p -> p.getLastName().startsWith("A"))
		.count();
		
		System.out.println(count);
		
		
	}

}
