package Lab8_1;

public class RegularCondition implements RoadCondition {

	@Override
	public String toString() {
		return "Regular";
	}

	@Override
	public int getLeftLevel() {

		return 5;
	}

	@Override
	public int getAccelLevel() {

		return 9;
	}

	@Override
	public int getRightLevel() {

		return 5;
	}

	@Override
	public int getBrakeLevel() {

		return 8;
	}
}
