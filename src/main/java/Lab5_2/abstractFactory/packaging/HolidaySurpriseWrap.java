
package Lab5_2.abstractFactory.packaging;

import Lab5_2.abstractFactory.giftPack.Packaging;

public class HolidaySurpriseWrap implements Packaging {
	private double cost = 0D;

	public HolidaySurpriseWrap(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
