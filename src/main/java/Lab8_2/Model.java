package Lab8_2;

import java.util.List;

public interface Model {

	final double BASETICKETPRICE = 300;
	final double FIXEDCOSTFORPLANE = 50000;

	public long getRevenue(List<Flight> flights);

	public default double getBASETICKETPRICE() {
		return BASETICKETPRICE;
	}

	public default double getFIXEDCOSTFORPLANE() {
		return FIXEDCOSTFORPLANE;
	}
}
