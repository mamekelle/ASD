package Lab11_1;

public class Root extends Composite {
	private String name;

	public Root(String name) {
		super();
		this.name = name;
		side = Side.NONE;
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);

	}

	@Override
	public Side getSide() {
		return side;
	}

	@Override
	public String getName() {
		return name;
	}
}
