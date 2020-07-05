package Lab8_1;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.KeyEvent;

public class MainController implements Initializable {
	private CarController carController;
	private RoadCondition currentCondition;

	@FXML
	private ComboBox<RoadCondition> cmbCondition;

	@FXML
	private Button btnLeft;

	@FXML
	private Button btnAccel;

	@FXML
	private Button btnRight;

	@FXML
	private Button btnBrake;

	@FXML
	private TextField txtFeedback;

	@Override
	public void initialize(URL location, ResourceBundle resources) {

		// Init ComboBox
		ArrayList<RoadCondition> items = new ArrayList<>();
		RoadCondition regular = new RegularCondition();
		RoadCondition gravel = new GravelCondition();
		RoadCondition wet = new WetCondition();
		RoadCondition ice = new IceCondition();
		items.add(regular);
		items.add(gravel);
		items.add(wet);
		items.add(ice);
		cmbCondition.setItems(FXCollections.observableArrayList(items));
		cmbCondition.setValue(regular);

		currentCondition = regular;
		carController = new CarController(currentCondition);

		cmbCondition.valueProperty().addListener(new ChangeListener<RoadCondition>() {

			@Override
			public void changed(ObservableValue<? extends RoadCondition> observable, RoadCondition oldValue,
					RoadCondition newValue) {

				currentCondition = newValue;
				carController.setCurrentCondition(currentCondition);
				;
			}
		});

	}

	@FXML
	void onLeftClick(ActionEvent event) throws Exception {
		int level = carController.getLeftLevel();
		txtFeedback.setText("Level: " + level);
	}

	@FXML
	void onAccelClick(ActionEvent event) throws Exception {
		int level = carController.getAccelLevel();
		txtFeedback.setText("Level: " + level);
	}

	@FXML
	void onRightClick(ActionEvent event) throws Exception {
		int level = carController.getRightLevel();
		txtFeedback.setText("Level: " + level);
	}

	@FXML
	void onBrakeClick(ActionEvent event) throws Exception {
		int level = carController.getBrakeLevel();
		txtFeedback.setText("Level: " + level);
	}

}
