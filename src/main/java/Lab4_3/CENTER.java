package Lab4_3;

public class CENTER extends Component {

	public CENTER(String title) {
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
