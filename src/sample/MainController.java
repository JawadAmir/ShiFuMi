package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    @FXML
    private Button playButton;

    @FXML
    void playButtonClicked(ActionEvent event) throws IOException {
        Parent LoginParent= FXMLLoader.load(getClass().getResource("ViewGame.fxml"));
        Scene LoginScene = new Scene(LoginParent);
        Stage LoginWindow = (Stage)((Node) event.getSource()).getScene().getWindow();
        LoginWindow.setScene(LoginScene);
        LoginWindow.show();
    }

}
