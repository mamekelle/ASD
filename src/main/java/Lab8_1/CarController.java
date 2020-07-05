package Lab8_1;

public class CarController {
	private RoadCondition currentCondition;

	public CarController(RoadCondition currentCondition) {
		this.currentCondition = currentCondition;
	}

	public void setCurrentCondition(RoadCondition currentCondition) {
		this.currentCondition = currentCondition;
	}

	public int getLeftLevel() {
		return currentCondition.getLeftLevel();
	}

	public int getAccelLevel() {
		return currentCondition.getAccelLevel();
	}

	public int getRightLevel() {
		return currentCondition.getRightLevel();
	}

	public int getBrakeLevel() {
		return currentCondition.getBrakeLevel();
	}
}
