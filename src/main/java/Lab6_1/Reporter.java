package Lab6_1;

public class Reporter extends AbstractAgent {

	@Override
	public void handleRequest(CallRecord callRecord) {
		System.out.println(callRecord);
	}

}
