
package Lab5_2.abstractFactory.giftPack;

import Lab5_2.abstractFactory.packaging.HardPlasticBox;
import Lab5_2.abstractFactory.packaging.HolidaySurpriseWrap;
import Lab5_2.abstractFactory.packaging.MerchantCollectionBag;

public class BusinessGiftPack extends GiftPack {

	@Override
	public Packaging packageGift(PackagingType packagingType) {
		switch (packagingType) {
		case BOX:
			return new HardPlasticBox(1.00);
		case BAG:
			return new MerchantCollectionBag(0.50);
		case WRAP:
			return new HolidaySurpriseWrap(0.25);
		default:
			throw new IllegalArgumentException("Unexpected value: " + packagingType);
		}
	}

}
