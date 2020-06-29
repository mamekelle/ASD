package Lab6_1;

public class ChainBuilder {

	private AbstractAgent handler;
	// other necessary code here

	public void buildChain() {
		AbstractAgent validator = new Validator();
		AbstractAgent dataWasher = new DataWasher();
		AbstractAgent reporter = new Reporter();

		validator.nextAgent = dataWasher;
		dataWasher.nextAgent = reporter;

		handler = validator;
	}

	public AbstractAgent getHandler() {
		return handler;
	}
}
