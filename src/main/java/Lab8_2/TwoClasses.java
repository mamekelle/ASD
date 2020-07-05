package Lab8_2;

import java.util.List;

public class TwoClasses implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {
		final double BASETICKETPRICE = getBASETICKETPRICE();
		final double FIXEDCOSTFORPLANE = getFIXEDCOSTFORPLANE();
		double total = 0;

		for (Flight flight : flights) {
			int numberOfPassengers = flight.getNumberOfPassengers();
			double forBusiness = (numberOfPassengers * 0.333) * (BASETICKETPRICE * 1.5);
			double forCoach = (numberOfPassengers * 0.666) * (BASETICKETPRICE * 0.75);

			total += (forBusiness + forCoach) - (FIXEDCOSTFORPLANE * 1.1);
		}

		return (long) total;
	}

}
