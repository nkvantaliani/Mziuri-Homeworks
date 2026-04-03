import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {

//
//        Parent root = FXMLLoader.load(getClass().getResource("Alert/alert.fxml"));
//        stage.setScene(new Scene(root));
//        stage.setOnCloseRequest(event -> {;
//            event.consume();
//        });
//        stage.show();

        Parent root = FXMLLoader.load(getClass().getResource("Scene/scene.fxml"));

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}