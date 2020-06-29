package Lab5_1;

public class FileTrace implements Trace {

	boolean debug;
	String debugMessage;
	String errorMessage;

	@Override
	public void setDebug(boolean debug) {
		this.debug = debug;
		System.out.println("Inside FileTrace setDebug() method");
	}

	@Override
	public void debug(String debugMessage) {
		this.debugMessage = debugMessage;
		System.out.println("Inside FileTrace debug() method");
	}

	@Override
	public void error(String errorMessage) {
		this.errorMessage = errorMessage;
		System.out.println("Inside FileTrace error() method");
	}

	@Override
	public String toString() {
		return "FileTrace [debug=" + debug + ", debugMessage=" + debugMessage + ", errorMessage=" + errorMessage + "]";
	}

}
