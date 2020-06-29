
package Lab5_2.abstractFactory.packaging;

import Lab5_2.abstractFactory.giftPack.Packaging;

public class CartoonBox implements Packaging {

	private double cost = 0;

	public CartoonBox(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}
}
