package Lab6_1;

public class Validator extends AbstractAgent {

	@Override
	public void handleRequest(CallRecord callRecord) {

		// Check if the the record is valid
		if (checkIfValid(callRecord)) {
			callRecord.setValid(true);
			this.nextAgent.handleRequest(callRecord);
		}
	}

	private boolean checkIfValid(CallRecord callRecord) {
		return (callRecord.getCustomer().getAddress() != null && callRecord.getCustomer().getEmail() != null);
	}
}