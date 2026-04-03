package Alert;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class AlertController {
    int count = 0;

    public void exit(ActionEvent actionEvent) {
       count++;
        if(count == 5) {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("exit");
            alert.setHeaderText("are you sure you want to exit?");
            alert.showAndWait();
            if (alert.getResult() == ButtonType.OK) {
                System.exit(0);

            }
            count=0;
        }

    }
}
