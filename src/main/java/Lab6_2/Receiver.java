package Lab6_2;

// Receiver class
public class Receiver {

	private Square square;

	// Create Square
	public void create(int side) {
		// first create the square and draw it to the console
		this.square = new Square(side);
		System.out.println("\nCreating a new square of " + side + " * " + side);
		drawSquare(side, this.square.getOrigin());
	}

	// Undo for create
	public void undoCreate() {
		System.out.println("\nSuccessfully created UNDONE");
		this.square = null;
	}

	// Scale Square
	public void scale(int scale) {
		// first create the square and draw it to the console
		this.square = new Square(this.getSquare().getSide() * scale);
		System.out.println("\nSquare successfully scaled");
		drawSquare(this.getSquare().getSide(), this.square.getOrigin());
	}

	// Undo for Scale
	public void scaleUndo(int scale) {
		this.square = new Square(this.getSquare().getSide() / scale);
		System.out.println("\nSquare successfully descaled");
		drawSquare(this.getSquare().getSide(), this.square.getOrigin());
	}

	// Move a Square
	public void move(int distance) {
		this.square.setOrigin(this.square.getOrigin() + distance);
		System.out.println("\nSquare successfully moved");
		drawSquare(this.getSquare().getSide(), this.square.getOrigin());

	}

	// UNDO a moved Square object
	public void moveUndo(int distance) {
		this.square.setOrigin(this.square.getOrigin() - distance);
		System.out.println("\nSquare successfully unmoved");
		drawSquare(this.getSquare().getSide(), this.square.getOrigin());
	}

	private void drawSquare(int side, int origin) {
		drawHorizontalLine(side, origin);
		System.out.println();

		for (int i = 0; i < side - 2; i++) {
			drawSideLines(side, origin);
			System.out.println();
		}

		drawHorizontalLine(side, origin);
	}

	// A horizontal line drawer (for the upper and lower part of the square)
	private void drawHorizontalLine(int side, int origin) {
		for (int j = 0; j < origin; j++) {
			System.out.print(" ");
		}

		for (int i = 0; i < side; i++) {
			System.out.print("* ");
		}
	}

	// A drawer for the vertical lines
	private void drawSideLines(int side, int origin) {
		for (int i = 0; i < side; i++) {
			if (i == 0) {
				for (int j = 0; j < origin; j++) {
					System.out.print(" ");
				}
			}
			if ((i == 0) || (i == side - 1)) {
				System.out.print("* ");
			} else
				System.out.print("  ");
		}

	}

	// Getter and setters for Square object
	public Square getSquare() {
		return square;
	}

	public void setSquare(Square square) {
		this.square = square;
	}

}
