package Lab10_1;

public class Main {public static void main(String[] args) {
	IMediator mediator = new Mediator();
	Player whitePlayer = new WhitePlayer(mediator);
	Player blackPlayer = new BlackPlayer(mediator);
	printBoard(mediator.getBoard());
	Cell result;
	result = blackPlayer.move(3, 2);
	printBoard(mediator.getBoard());
	result = blackPlayer.move(4, 2);
	printBoard(mediator.getBoard());
	result = whitePlayer.move(3, 2);
	printBoard(mediator.getBoard());
	result = blackPlayer.move(3, 5); // Invalid move
	printBoard(mediator.getBoard());
	result = whitePlayer.move(5, 2); // Invalid move
	printBoard(mediator.getBoard());
	result = blackPlayer.move(2, 4);
	printBoard(mediator.getBoard());
	result = whitePlayer.move(5, 4);
	printBoard(mediator.getBoard());
}

public static void printBoard(Board board) {
	System.out.println("--------------------------PRINT BOARD-----------------------");
	for (int i = 0; i < board.row; i++) {
		for (int j = 0; j < board.column; j++) {
			System.out.print(board.getCell(i, j).toString() + "    ");
		}
		System.out.println();
	}
}
}
