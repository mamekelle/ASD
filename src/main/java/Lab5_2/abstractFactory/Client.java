package Lab5_2.abstractFactory;

import java.util.ArrayList;
import java.util.List;

import Lab5_2.abstractFactory.giftPack.AdultGiftPack;
import Lab5_2.abstractFactory.giftPack.GiftPack;
import Lab5_2.abstractFactory.giftPack.KidGiftPack;
import Lab5_2.abstractFactory.giftPack.PackType;
import Lab5_2.abstractFactory.giftPack.PackagingType;

public class Client {

	public static void main(String[] args) {
		GiftPack giftPackKid = new KidGiftPack();
		List<GiftItem> kidGiftItemList = new ArrayList<GiftItem>();
		GiftItem giftItem1 = new GiftItem("1", "Watch", "Luxery", PackType.KIDS, PackagingType.BOX);
		GiftItem giftItem2 = new GiftItem("2", "Shoe", "Running Shoe", PackType.KIDS, PackagingType.BOX);
		GiftItem giftItem3 = new GiftItem("3", "T-Shirt", "Running T-Shirt", PackType.KIDS, PackagingType.WRAP);
		
		GiftPack adultGiftPack = new AdultGiftPack();
		List<GiftItem> adultGiftItemList = new ArrayList<GiftItem>();

		GiftItem giftItem11 = new GiftItem("11", "Watch", "Luxery", PackType.ADULTS, PackagingType.BOX);
		GiftItem giftItem22 = new GiftItem("22", "Shoe", "Running Shoe", PackType.ADULTS, PackagingType.BAG);
		GiftItem giftItem33 = new GiftItem("33", "T-Shirt", "Running T-Shirt", PackType.ADULTS, PackagingType.WRAP);

		kidGiftItemList.add(giftItem1);
		kidGiftItemList.add(giftItem2);
		kidGiftItemList.add(giftItem3);
		
		adultGiftItemList.add(giftItem11);
		adultGiftItemList.add(giftItem22);
		adultGiftItemList.add(giftItem33);

		giftPackKid.setGiftItems(kidGiftItemList);
		adultGiftPack.setGiftItems(adultGiftItemList);

		List<GiftPack> kidGiftPacks = new ArrayList<>();
		kidGiftPacks.add(giftPackKid);
		
		List<GiftPack> adultGiftPacks = new ArrayList<>();
		adultGiftPacks.add(adultGiftPack);

		double sumBox = 0D;
		double sumBag = 0D;
		double sumWrapper = 0D;

		for (GiftPack giftPack : kidGiftPacks) {
			for (GiftItem giftItem : kidGiftItemList) {
				System.out.println("Kid gift Description: " + giftItem.getDescription());
				switch (giftItem.getPackagingType()) {
				case BOX: {
					sumBox += giftPack.packageGift(PackagingType.BOX).getCost();
					break;
				}
				case BAG: {
					sumBag += giftPack.packageGift(PackagingType.BAG).getCost();
					break;
				}
				case WRAP: {
					sumWrapper += giftPack.packageGift(PackagingType.WRAP).getCost();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + giftItem.getPackagingType());
				}

			}

			System.out.println("Sum of Box packaging equals:" + sumBox);
			System.out.println("Sum of Bag packaging equals:" + sumBag);
			System.out.println("Sum of Wrapper packaging equals:" + sumWrapper);

		}
			sumBox = 0D;
		 sumBag = 0D;
		 sumWrapper = 0D;
		for (GiftPack giftPack : adultGiftPacks) {
			for (GiftItem giftItem : adultGiftItemList) {
				System.out.println("Adult gift Description: " + giftItem.getDescription());
				switch (giftItem.getPackagingType()) {
				case BOX: {
					sumBox += giftPack.packageGift(PackagingType.BOX).getCost();
					break;
				}
				case BAG: {
					sumBag += giftPack.packageGift(PackagingType.BAG).getCost();
					break;
				}
				case WRAP: {
					sumWrapper += giftPack.packageGift(PackagingType.WRAP).getCost();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + giftItem.getPackagingType());
				}

			}

			System.out.println("Sum of Box packaging equals:" + sumBox);
			System.out.println("Sum of Bag packaging equals:" + sumBag);
			System.out.println("Sum of Wrapper packaging equals:" + sumWrapper);

		}
		

	}

}
