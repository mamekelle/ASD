package Lab6_2;

public class CreateCommand implements Command {

	// Create instance of Receiver class
	private Receiver receiver = new Receiver();

	private int side;

	public CreateCommand(int side) {
		this.side = side;
	}

	@Override
	public void execute() {
		receiver.create(side);
	}

	@Override
	public void undo() {
		receiver.undoCreate();
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

}