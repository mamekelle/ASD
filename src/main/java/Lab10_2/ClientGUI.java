package Lab10_2;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClientGUI extends Application implements Initializable {
	private Stage primaryStage;
	private BorderPane mainLayout;

	@Override
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Observer Pattern");
		showMainView();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private void showMainView() throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(ClientGUI.class.getResource("MainView.fxml"));
		mainLayout = loader.load();
		Scene scene = new Scene(mainLayout);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	@FXML
	private ListView lstViewPeople;

	@FXML
	private TextField txtFirstName;

	@FXML
	private TextField txtLastName;

	@FXML
	private TextField txtAge;

	@FXML
	private Label lblErrorMessage;

	@FXML
	private Button btnRemovePerson;

	// Concrete Subject
	People people = new People();

	ObservableList<Person> peopleOnToBeDisplayed;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		new GUI_People(people);
	}

	// Add a person to the list and display to the list view
	public void btnAddPerson() {
		System.out.println();
		System.out.println("-- People's Information in the Array List --");
		System.out.println();

		int age = 0;
		try {
			age = Integer.parseInt(txtAge.getText().trim());
		} catch (NumberFormatException e) {
			lblErrorMessage.setText("Please fill correctly!");
			System.out.println("Invalid input in age");
			return;
		}

		if (txtFirstName.getText().trim().isEmpty() || txtLastName.getText().trim().isEmpty()) {
			lblErrorMessage.setText("Please fill correctly!");
			return;
		} else {
			lblErrorMessage.setText("");
			people.addPerson(new Person(txtFirstName.getText().trim(), txtLastName.getText().trim(), age));

			// Add the list to the grid
			peopleOnToBeDisplayed = FXCollections.observableArrayList(people.getPeople());
			lstViewPeople.setItems(peopleOnToBeDisplayed);
			clear();
		}

	}

	// Remove a person from the list
	public void btnRemovePerson() {

		int selectedIndex = lstViewPeople.getSelectionModel().getSelectedIndex();

		if (selectedIndex != -1) {
			people.removePerson((Person) lstViewPeople.getSelectionModel().getSelectedItem());
			peopleOnToBeDisplayed = FXCollections.observableArrayList(people.getPeople());
			lstViewPeople.setItems(peopleOnToBeDisplayed);

			// Disable Remove Person Button
			btnRemovePerson.setDisable(true);
		}
	}

	// Clear text fields
	public void clear() {
		txtFirstName.setText("");
		txtLastName.setText("");
		txtAge.setText("");
	}

	// Enable RemovePerson button
	public void listViewSelection() {
		btnRemovePerson.setDisable(false);
	}

	// Deselect listView
	public void textFieldsOnFocus() {
		lstViewPeople.getSelectionModel().clearSelection();
		btnRemovePerson.setDisable(true);
	}
}
