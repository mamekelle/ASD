package Lab8_2;

import java.util.List;

public class SinglePrice implements Model {

	@Override
	public long getRevenue(List<Flight> flights) {

		final double BASETICKETPRICE = getBASETICKETPRICE();
		final double FIXEDCOSTFORPLANE = getFIXEDCOSTFORPLANE();
		double total = 0;

		for (Flight flight : flights) {
			total += (flight.getNumberOfPassengers() * BASETICKETPRICE) - FIXEDCOSTFORPLANE;
		}

		return (long) total;
	}

}
