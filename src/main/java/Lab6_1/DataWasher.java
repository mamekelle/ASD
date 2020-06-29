package Lab6_1;

public class DataWasher extends AbstractAgent {

	@Override
	public void handleRequest(CallRecord callRecord) {

		// Setting isASalesLead to 'true' and calling the Reporter handler class
		// for printing
		callRecord.setASalesLead(true);
		this.nextAgent.handleRequest(callRecord);
	}

}
