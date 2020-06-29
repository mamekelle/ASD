
package Lab5_2.abstractFactory.packaging;

import Lab5_2.abstractFactory.giftPack.Packaging;

public class EveryDayValueWrap implements Packaging {
	private double cost = 0D;

	public EveryDayValueWrap(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
