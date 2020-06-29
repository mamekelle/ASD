
package Lab5_2.abstractFactory.giftPack;

import Lab5_2.abstractFactory.packaging.EveryDayValueWrap;
import Lab5_2.abstractFactory.packaging.PlainPaperBox;
import Lab5_2.abstractFactory.packaging.ReusableShopperBag;

public class AdultGiftPack extends GiftPack {
	@Override
	public Packaging packageGift(PackagingType packagingType) {
		switch (packagingType) {
		case BOX:
			return new PlainPaperBox(0.25);
		case BAG:
			return new ReusableShopperBag(0.00);
		case WRAP:
			return new EveryDayValueWrap(0.00);
		default:
			throw new IllegalArgumentException("Unexpected value: " + packagingType);
		}
	}

}
