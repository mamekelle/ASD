
package Lab5_2.abstractFactory.giftPack;

import java.util.List;

import Lab5_2.abstractFactory.Address;
import Lab5_2.abstractFactory.GiftItem;

public abstract class GiftPack {
	private List<GiftItem> giftItems;
	private Address shippingAddress;

	public abstract Packaging packageGift(PackagingType packagingType);

	public List<GiftItem> getGiftItems() {
		return giftItems;
	}

	public void setGiftItems(List<GiftItem> giftItems) {
		this.giftItems = giftItems;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	@Override
	public String toString() {
		return "GiftPack [giftItems=" + giftItems + ", shippingAddress=" + shippingAddress + "]";
	}
}
