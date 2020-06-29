
package Lab5_2.abstractFactory.packaging;

import Lab5_2.abstractFactory.giftPack.Packaging;

public class HardPlasticBox implements Packaging {
	private double cost = 0D;

	public HardPlasticBox(double cost) {
		this.cost = cost;
	}

	@Override
	public double getCost() {

		return cost;
	}

}
