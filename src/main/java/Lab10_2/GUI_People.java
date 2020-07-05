package Lab10_2;

import java.util.List;

public class GUI_People implements Observer {

	public GUI_People() {

	}

	public GUI_People(People people) {
		people.attach(this);
	}

	@Override
	public void update(List<Person> people) {

		StringBuilder str = new StringBuilder();
		for (Person person : people) {
			str.append(person + "\n");
		}

		System.out.println(str);
	}

}
