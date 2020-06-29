package Lab5_1;

public class SimpleTraceFactory implements TraceFactory {

	// Create a singleton SimpleTraceFactory (static and constructor is private)
	private static TraceFactory factory = new SimpleTraceFactory();

	// private constructor to be only accessed from within
	private SimpleTraceFactory() {
	}

	public static TraceFactory getFactory() {

		return factory;
	}

	@Override
	public Trace createTracer(String traceType) {
		Trace trace = null;

		if (traceType.equals("trace.console")) {
			trace = new ConsoleTrace();
		} else if (traceType.equals("trace.file")) {
			trace = new FileTrace();
		}

		return trace;
	}

}
