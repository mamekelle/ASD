package Lab4_3;

public class H2 extends Component{

	public H2(String title) {
		super(title);
	}

	@Override
	public void print() {
		System.out.println("Composite name=" + title);
	}
	
	public void addItem(Component item) {
		try {
			throw new UnsupportedOperationException();
		} catch(UnsupportedOperationException e) {
			System.out.println(title + " CAN'T ADD COMPONENT UNDER IT");
		}
	}
	
}
