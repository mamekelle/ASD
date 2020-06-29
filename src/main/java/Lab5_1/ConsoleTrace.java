package Lab5_1;

public class ConsoleTrace implements Trace {

	boolean debug;
	String debugMessage;
	String errorMessage;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
		System.out.println("Inside ConsoleTrace setDebug() method");
	}

	@Override
	public void debug(String debugMessage) {
		this.debugMessage = debugMessage;
		System.out.println("Inside ConsoleTrace debug() method");

	}

	@Override
	public void error(String errorMessage) {
		this.errorMessage = errorMessage;
		System.out.println("Inside ConsoleTrace error() method");
	}

	@Override
	public String toString() {
		return "ConsoleTrace [debug=" + debug + ", debugMessage=" + debugMessage + ", errorMessage=" + errorMessage
				+ "]";
	}

}
