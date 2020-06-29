package Lab5_1;

public class Main {

	public static void main(String[] args) {
		TraceFactory factory = SimpleTraceFactory.getFactory();
		System.out.println("Tracer: (trace.console)");
		Trace consoleTrace = factory.createTracer("trace.console");
		consoleTrace.setDebug(true);
		consoleTrace.debug("debug my code");
		consoleTrace.error("check for errors");
		System.out.println(consoleTrace);

		System.out.println("\nAnother tracer: (trace.file)");
		Trace fileTrace = factory.createTracer("trace.file");
		fileTrace.setDebug(false);
		fileTrace.debug("debug my code");
		fileTrace.error("check for errors");
		System.out.println(fileTrace);

	}

}
