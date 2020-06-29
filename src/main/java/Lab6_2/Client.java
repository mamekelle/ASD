package Lab6_2;

public class Client {

	public static void main(String[] args) {

		Invoker invoker = new Invoker();

		// Create square(4*4)
		invoker.createSquare(4);

		// Create second square(2*2)
		invoker.createSquare(2);

		invoker.undo();

		invoker.scaleSquare(2);

		invoker.undo();

		invoker.moveSquare(6);

		invoker.undo();

		invoker.undo();

	}

}
