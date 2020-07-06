package Lab9_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		List<Integer> arrayList = new ArrayList<>();

		// Generate 3,000,000 integers
		for (int i = 0; i < 3000000; i++) {
			arrayList.add(random.nextInt(3000000));
		}

		arrayList = new ArrayListProfiler<>(arrayList);
		arrayList.add(2000);
		arrayList.remove((Object) 2000);
		arrayList.contains(33100);
		arrayList.size();

		List<Integer> linkedList = new LinkedList<>();

		// Generate 10,000,000 integers
		for (int i = 0; i < 10000000; i++) {
			linkedList.add(random.nextInt(10000000));
		}

		linkedList = new LinkedListProfiler<>(linkedList);
		linkedList.add(15000);
		linkedList.remove((Object) 15000);
		linkedList.contains(21100);
		linkedList.size();
	}

}
