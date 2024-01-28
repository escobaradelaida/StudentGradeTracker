package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainController {
	
	@FXML
	private Button loginCancel;
	
	public void loginCancelOnAction(ActionEvent e) {
		Stage stage = (Stage) loginCancel.getScene().getWindow();
		stage.close();
	}
	
	
}
