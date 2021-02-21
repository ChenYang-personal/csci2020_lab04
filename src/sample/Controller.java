package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.w3c.dom.Text;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField title1;
    @FXML
    private TextField title2;
    @FXML
    private TextField title3;
    @FXML
    private TextField title4;

    public void handleSubmitButtonAction(ActionEvent actionEvent) {
        System.out.println(title1.getText());
        System.out.println(title2.getText());
        System.out.println(title3.getText());
        System.out.println(title4.getText());

    }
}
