package Lab8_2;

import java.util.List;

public class MultiClass implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		final double BASETICKETPRICE = getBASETICKETPRICE();
		final double FIXEDCOSTFORPLANE = getFIXEDCOSTFORPLANE();
		double total = 0;

		for (Flight flight : flights) {

			int numberOfPassengers = flight.getNumberOfPassengers();
			double firstClass = (numberOfPassengers * 0.1) * (BASETICKETPRICE * 4);
			double forBusiness = (numberOfPassengers * 0.2) * (BASETICKETPRICE * 1.5);
			double forCoach = (numberOfPassengers * 0.7) * (BASETICKETPRICE * 0.75);

			total += (firstClass + forBusiness + forCoach) - (FIXEDCOSTFORPLANE * 1.2);
		}

		return (long) total;
	}

}
