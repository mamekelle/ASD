package Lab8_1;

public class GravelCondition implements RoadCondition {

	@Override
	public String toString() {
		return "Gravel";
	}

	@Override
	public int getLeftLevel() {

		return 3;
	}

	@Override
	public int getAccelLevel() {

		return 7;
	}

	@Override
	public int getRightLevel() {

		return 3;
	}

	@Override
	public int getBrakeLevel() {

		return 6;
	}
}
