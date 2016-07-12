package com.kainos.discoverydiary;

import com.google.common.collect.Lists;
import com.kainos.discoverydiary.models.Person;

import java.util.List;

public class DataStore {

	private static List<Person> people = Lists.newArrayList();

	public List<Person> getPeople() {
		return people;
	}

	public void registerPerson(String name, Integer age) {
		Person newPerson = new Person();
		newPerson.setName(name);
		newPerson.setAge(age);
		people.add(newPerson);
	}
}
