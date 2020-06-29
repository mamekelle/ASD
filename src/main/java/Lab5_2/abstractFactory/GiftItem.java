
package Lab5_2.abstractFactory;

import Lab5_2.abstractFactory.giftPack.PackType;
import Lab5_2.abstractFactory.giftPack.PackagingType;

public class GiftItem {
	private String giftId;
	private String giftName;
	private String description;
	private PackType packType;
	private PackagingType packagingType;

	public GiftItem(String giftId, String giftName, String description, PackType packagingType, PackagingType packaging) {
		super();
		this.giftId = giftId;
		this.giftName = giftName;
		this.description = description;
		this.packType = packagingType;
		this.packagingType = packaging;
	}

	public String getGiftId() {
		return giftId;
	}

	public String getGiftName() {
		return giftName;
	}

	public String getDescription() {
		return description;
	}

	public PackType getPackType() {
		return packType;
	}

	public PackagingType getPackagingType() {
		return packagingType;
	}

	@Override
	public String toString() {
		return "GiftItem [giftId=" + giftId + ", giftName=" + giftName + ", description=" + description
				+ ", packagingType=" + packType + ", packaging=" + packagingType + "]";
	}

}
