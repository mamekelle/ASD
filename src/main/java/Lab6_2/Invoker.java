package Lab6_2;

import java.util.Stack;

//Invoker

public class Invoker {

	private Command command;

	private Stack<Command> executedCommands = new Stack<Command>();

	public void createSquare(int side) {
		command = new CreateCommand(side);
		executedCommands.push(command);
		command.execute();
	}

	// Scale
	public void scaleSquare(int scale) {
		if (!checkIfStackIsEmpty()) {

			Command topCommandInStack = executedCommands.peek();
			if (topCommandInStack instanceof CreateCommand) {
				command = new ScaleCommand(((CreateCommand) topCommandInStack).getReceiver(), scale);
			} else if (topCommandInStack instanceof ScaleCommand) {
				command = new ScaleCommand(((ScaleCommand) topCommandInStack).getReceiver(), scale);
			} else if (topCommandInStack instanceof MoveCommand) {
				command = new ScaleCommand(((MoveCommand) topCommandInStack).getReceiver(), scale);
			}

			executedCommands.push(command);
			command.execute();
		} else {
			System.out.println("Nothing to scale at this moment");
		}
	}

	// Move
	public void moveSquare(int distance) {
		if (!checkIfStackIsEmpty()) {

			Command topCommandInStack = executedCommands.peek();

			if (topCommandInStack instanceof CreateCommand) {
				command = new MoveCommand(((CreateCommand) topCommandInStack).getReceiver(), distance);
			} else if (topCommandInStack instanceof ScaleCommand) {
				command = new MoveCommand(((ScaleCommand) topCommandInStack).getReceiver(), distance);
			} else if (topCommandInStack instanceof MoveCommand) {
				command = new MoveCommand(((MoveCommand) topCommandInStack).getReceiver(), distance);
			}
			executedCommands.push(command);
			command.execute();
		} else {
			System.out.println("Nothing to move at this moment");
		}
	}

	// Undo method - invokes the correct undo method
	public void undo() {

		if (!checkIfStackIsEmpty()) {

			//Since we are doing the undo on the top of the Stack
			Command topCommandInStack = executedCommands.pop();
			topCommandInStack.undo();			
		} else {
			System.out.println("Nothing to UNDO at this moment");
		}

	}

	// Check if the stack of executed commands is empty or not
	public boolean checkIfStackIsEmpty() {
		return executedCommands.isEmpty();
	}

}
