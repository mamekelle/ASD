package Lab8_3;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Client extends Application {

	private Stage primaryStage;
	private BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Memento Pattern");
		showMainView();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Client.class.getResource("ClientGUI.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	Originator originator = new Originator();
	CareTaker caretaker = new CareTaker();

	@FXML
	private TextArea txtEditingArea;

	@FXML
	private Button btnLoad;

	@FXML
	private Button btnUndo;

	@FXML
	private Button btnSave;

	// When the load button is clicked, this method gets executed
	public void btnLoad() {
		String fromFile = originator.loadFromAFile();
		txtEditingArea.setText(fromFile);
		System.out.println(fromFile);
	}

	// When the Undo button is clicked, this method gets executed
	public void btnUndo() {
		System.out.println("Undo button clicked");
		// txtEditingArea.setText(caretaker.undo());
		originator.getStateFromMomento(caretaker.undo());
		txtEditingArea.setText(originator.getString().toString());
	}

	// When Save Button is clicked, this method gets executed
	public void btnSave() {
		originator.saveToFile();
	}

	// When a space is detected while on key press
	// should be saved to the stack of Memontos in the care taker
	public void txtAreaEditor() {
		System.out.println("Inside TextArea");
		btnUndo.setDisable(false);
		btnSave.setDisable(false);
		originator.write(txtEditingArea.getText());
		caretaker.saveToStack(originator.createMemento());
	}

}
