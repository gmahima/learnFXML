
package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller {
    public Button button;
    public Label l;

    public void handleButtonClick() {
        System.out.println(l.getText() + " too!!!!");
        button.setText("got it");
    }
}

