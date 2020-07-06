package Lab10_2;

import java.util.ArrayList;
import java.util.List;

public class People implements Subject {

	private List<Person> people;
	private List<Observer> observers;
	private final Object MUTEX = new Object();

	public People() {
		observers = new ArrayList<Observer>();
		people = new ArrayList<Person>();
	}

	@Override
	public void attach(Observer observer) {
		synchronized (MUTEX) {
			if (!observers.contains(observer))
				observers.add(observer);
		}
	}

	@Override
	public void detach(Observer observer) {
		synchronized (MUTEX) {
			int i = observers.indexOf(observer);
			if (i >= 0)
				observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		synchronized (MUTEX) {
			for (int i = 0; i < observers.size(); i++) {
				Observer observer = (Observer) observers.get(i);
				observer.update(people);
			}
		}
	}

	// Adding people to List<Person> people
	public void addPerson(Person person) {
		people.add(person);
		notifyObservers();
	}

	// Removing people from List<Person> people
	public void removePerson(Person person) {

		// check first if on the list
		int i = people.indexOf(person);

		if (i >= 0)
			people.remove(i);
		else
			System.out.println(person + ": NOT ON THE LIST");

		notifyObservers();
	}

	public List<Person> getPeople() {
		return people;
	}
}
