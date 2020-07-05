package Lab8_1;

public class IceCondition implements RoadCondition {

	@Override
	public String toString() {
		return "Ice";
	}

	@Override
	public int getLeftLevel() {

		return 1;
	}

	@Override
	public int getAccelLevel() {

		return 3;
	}

	@Override
	public int getRightLevel() {

		return 1;
	}

	@Override
	public int getBrakeLevel() {

		return 2;
	}
}
