package Lab11_1;

public interface Component {
	public void accept(NodeVisitor visitor);

	public Side getSide();
}
