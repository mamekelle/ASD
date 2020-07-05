package Lab8_1;

public class WetCondition implements RoadCondition {

	@Override
	public String toString() {
		return "Wet";
	}

	@Override
	public int getLeftLevel() {

		return 4;
	}

	@Override
	public int getAccelLevel() {

		return 9;
	}

	@Override
	public int getRightLevel() {

		return 4;
	}

	@Override
	public int getBrakeLevel() {

		return 7;
	}
}
