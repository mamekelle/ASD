package Lab6_2;

public class ScaleCommand implements Command {

	// Create instance of Receiver class
	private Receiver receiver;
	private int scale;

	public ScaleCommand(Receiver receiver, int scale) {
		this.receiver = receiver;
		this.scale = scale;
	}

	@Override
	public void execute() {
		receiver.scale(scale);
	}

	@Override
	public void undo() {
		receiver.scaleUndo(scale);
	}

	public int getScale() {
		return scale;
	}

	public void setScale(int scale) {
		this.scale = scale;
	}

	public Receiver getReceiver() {
		return receiver;
	}

	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
}
