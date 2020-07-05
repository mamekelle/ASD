package Lab8_2;

import java.util.List;

public class FlightContext {
	Model model;

	public void setModel(Model model) {
		this.model = model;
	}

	public long generateRevenue(List<Flight> flights) {
		return model.getRevenue(flights);
	}
}
