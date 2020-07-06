package Lab11_2;

public class NumberExpression extends Expression {
	private int number;

	public NumberExpression(int number) {
		this.number = number;
	}

	@Override
	public int interpret() {
		return number;
	}

	@Override
	public String toString() {
		return number + "";
	}
}
