
package Lab5_2.abstractFactory.giftPack;

import Lab5_2.abstractFactory.packaging.CartoonBox;
import Lab5_2.abstractFactory.packaging.HappyKidGiftWrap;
import Lab5_2.abstractFactory.packaging.MickyGiftBag;

public class KidGiftPack extends GiftPack{
	
	@Override
	public Packaging packageGift(PackagingType packagingType) {
		switch (packagingType) {
		case BOX:
			return new CartoonBox(0.50);
		case BAG:
			return new MickyGiftBag(0.25);
		case WRAP:
			return new HappyKidGiftWrap(0.10);
		default:
			throw new IllegalArgumentException("Unexpected value: " + packagingType);
		}
	}



}
