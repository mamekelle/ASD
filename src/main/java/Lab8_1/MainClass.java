package Lab8_1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainClass extends Application {

	public static void main(String[] args) {
		Application.launch(MainClass.class, (String[]) null);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		try {
			AnchorPane page = (AnchorPane) FXMLLoader.load(MainClass.class.getResource("Main.fxml"));
			Scene scene = new Scene(page);
			primaryStage.setScene(scene);
			primaryStage.setTitle("FXML is Simple");
			primaryStage.show();
		} catch (Exception ex) {
			Logger.getLogger(MainClass.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

}
