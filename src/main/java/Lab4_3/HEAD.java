package Lab4_3;

public class HEAD extends HTML {

	public HEAD(String title) {
		super(title);
	}

	@Override
	public void print() {
		System.out.println("Composite name=" + title);
		for (Component item : list) {
			item.print();
		}
	}

}
