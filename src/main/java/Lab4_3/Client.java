package Lab4_3;

public class Client {

	public static void main(String[] args) {
		Component html = new HTML("HTML");
		Component head = new HEAD("HEAD");
		Component title = new TITLE("TITLE");
		Component body = new BODY("BODY");
		Component center = new CENTER("CENTER");
		Component img = new IMG("IMG");
		Component a = new A("A");
		Component h1 = new H1("H1");
		Component h2 = new H2("H2");
		Component b1 = new B("B");
		Component b2 = new B("B");
		Component i = new I("I");

		head.addItem(title);

		center.addItem(img);
		b2.addItem(i);

		body.addItem(center);
		body.addItem(a);
		body.addItem(h1);
		body.addItem(h2);
		body.addItem(b1);
		body.addItem(b2);

		html.addItem(head);
		html.addItem(body);

		System.out.println("******* printing tags under HTML *******");
		html.print();

		System.out.println("\n******* printing tags under HEAD *******");
		head.print();

		System.out.println("\n******* printing tags under TITLE *******");
		title.print();

		System.out.println("\n******* printing tags under BODY *******");
		body.print();

		System.out.println("\n******* printing tags under CENTER *******");
		center.print();

		System.out.println("\n******* printing tags under IMG *******");
		img.print();

		System.out.println("\n******* printing tags under A *******");
		a.print();

		System.out.println("\n******* printing tags under H1 *******");
		h1.print();

		System.out.println("\n******* printing tags under H2 *******");
		h2.print();

		System.out.println("\n******* printing tags under B1 *******");
		b1.print();

		System.out.println("\n******* printing tags under B2 *******");
		b2.print();

		System.out.println("\n******* printing tags under I *******");
		i.print();

		a.addItem(h1);

	}

}
