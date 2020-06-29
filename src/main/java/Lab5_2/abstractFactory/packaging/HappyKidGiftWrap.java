
package Lab5_2.abstractFactory.packaging;

import Lab5_2.abstractFactory.giftPack.Packaging;

public class HappyKidGiftWrap implements Packaging {
	private double cost = 0D;

	public HappyKidGiftWrap(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
