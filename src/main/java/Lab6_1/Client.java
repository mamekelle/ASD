package Lab6_1;

public class Client {

	static ChainBuilder chain = new ChainBuilder();

	public Client(ChainBuilder chain) {
		Client.chain = chain;
	}

	public void sendRequest(CallRecord callRecord) {
		chain.getHandler().handleRequest(callRecord);
	}

	public static void main(String[] args) {
		chain.buildChain();

		Client client = new Client(chain);

		// Data for Agent (For now only one Agent)
		Address agentsAddress = new Address("777 N court", "Fairfield", "IO", "77777");
		Agent agent1 = new Agent("1", agentsAddress);

		// Info for one call record
		Address address1 = new Address("555 west", "San Francisco", "CA", "55555");

		Customer customer1 = new Customer("Mike", "K", address1, "7777777777", "mike@gmail.com");

		CallRecord callRecord1 = new CallRecord(customer1, agent1, "About sales", false, false);

		// Info for one call record
		Address address2 = new Address("1000 maharishi", "Fairfield", "IO", "55555");

		Customer customer2 = new Customer("Thieory", "Henry", address2, "1414141414", null);

		CallRecord callRecord2 = new CallRecord(customer2, agent1, "info needed about sales", false, false);

		// Info for one call record
		Address address3 = new Address("1010 verill", "Fairfield", "IO", "33333");

		Customer customer3 = new Customer("Patrick", "Viera", address3, "4444444444", "viera@gmail.com");

		CallRecord callRecord3 = new CallRecord(customer3, agent1, "info needed about sales", false, false);

		System.out.println("Report of customer records");
		System.out.println();

		client.sendRequest(callRecord1);
		client.sendRequest(callRecord2); // Will not be printed because 'email'
											// is null
		client.sendRequest(callRecord3);
	}

}
