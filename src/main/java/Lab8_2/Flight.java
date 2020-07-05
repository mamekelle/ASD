package Lab8_2;

public class Flight {

	private int numberOfPassengers;
	private String flightNumber;
	private String destination;
	private String departure;

	public Flight(int numberOfPassengers, String flightNumber, String destination, String departure) {
		this.numberOfPassengers = numberOfPassengers;
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.departure = departure;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	@Override
	public String toString() {
		return flightNumber + " " + numberOfPassengers + " " + departure + " to " + destination;
	}

}
