package Lab8_3;

import java.util.Stack;

public class CareTaker {

	private Stack<Memento> mementos = new Stack<Memento>();

	public void saveToStack(Memento memento) {
		mementos.push(memento);
		System.out.println(mementos.peek());

	}

	public Memento undo() {
		Memento remainingStringAfterUndo = null;

		if (!mementos.isEmpty()) {
			mementos.pop();
		} else {

			System.out.println("Nothing to undo!!!");

		}

		// Print out what is remained in the stack
		if (!mementos.isEmpty()) {
			System.out.println("Popping out");
			System.out.println(mementos.peek());
			remainingStringAfterUndo = mementos.peek();
		} else {
			System.out.println("Stack is empty now");
			System.out.println(new Memento(new StringBuilder()));
		}

		return remainingStringAfterUndo;
	}
}
