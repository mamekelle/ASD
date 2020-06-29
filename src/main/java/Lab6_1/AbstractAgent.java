package Lab6_1;

public abstract class AbstractAgent {

	protected AbstractAgent nextAgent;

	abstract public void handleRequest(CallRecord callRecord);

}
