package Lab6_2;

public class MoveCommand implements Command {

	// Create instance of Receiver class
	private Receiver receiver;
	private int distance;

	public MoveCommand(Receiver receiver, int distance) {
		this.receiver = receiver;
		this.distance = distance;
	}

	@Override
	public void execute() {
		receiver.move(distance);
	}

	@Override
	public void undo() {
		receiver.moveUndo(distance);
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
}
