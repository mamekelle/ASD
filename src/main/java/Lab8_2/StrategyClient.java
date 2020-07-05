package Lab8_2;

import java.util.ArrayList;
import java.util.List;

public class StrategyClient {

	public static void main(String[] args) {

		Flight flight1 = new Flight(175, "United333", "San Francisco", "Fairfield");
		Flight flight2 = new Flight(200, "Delta777", "Verginia", "Cedar Rapids");
		Flight flight3 = new Flight(235, "American555", "Boston", "Des Moines");
		Flight flight4 = new Flight(180, "Sprit888", "Charlot", "Otumwa");
		Flight flight5 = new Flight(320, "United999", "Texas", "Des Moines");

		List<Flight> flights = new ArrayList<Flight>();
		flights.add(flight1);
		flights.add(flight2);
		flights.add(flight3);
		flights.add(flight4);
		flights.add(flight5);

		// Instance of the Context
		FlightContext flightContext = new FlightContext();

		// Printing information of the flights
		for (Flight flight : flights) {
			System.out.println(flight);
		}

		System.out.println();

		// Get revenue using SinglePrice Strategy
		Model singlePrice = new SinglePrice();
		flightContext.setModel(singlePrice);

		System.out.println("Generating revenue using SinglePrice strategy");
		System.out.println("Total revenue: " + flightContext.generateRevenue(flights));

		// Get revenue using Two classes Strategy
		Model twoClasses = new TwoClasses();
		flightContext.setModel(twoClasses);

		System.out.println("\nGenerating revenue using TwoClasses strategy");
		System.out.println("Total revenue: " + flightContext.generateRevenue(flights));

		// Get revenue using Multi classes Strategy
		Model multiClass = new MultiClass();
		flightContext.setModel(multiClass);

		System.out.println("\nGenerating revenue using MultiClasses strategy");
		System.out.println("Total revenue: " + flightContext.generateRevenue(flights));
	}

}
