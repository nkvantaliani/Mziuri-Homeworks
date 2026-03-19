import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;

import java.awt.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group group = new Group();
        Scene scene = new Scene(group, Color.MEDIUMPURPLE);
        stage.setScene(scene);
        stage.setTitle("Homework");
        Image image = new Image("file:src/icon.png");
        stage.getIcons().add(image);

        stage.setHeight(800);
        stage.setWidth(800);
        stage.setResizable(false);

        Text text = new Text();
        text.setText("გამარჯობა ეს არის აპლიკაცია.");
        group.getChildren().add(text);
        text.setX(300);
        text.setY(400);

        Rectangle square = new Rectangle();
        square.setX(100);
        square.setY(100);
        square.setHeight(100);
        square.setWidth(100);
        square.setFill(Color.GREEN);
        square.setStroke(Color.BLACK);
        group.getChildren().add(square);

        Line diagonal = new Line();
        diagonal.setStartX(100);
        diagonal.setStartY(100);
        diagonal.setEndX(200);
        diagonal.setEndY(200);
        group.getChildren().add(diagonal);

        Line diagonal2 = new Line();
        diagonal2.setStartX(200);
        diagonal2.setStartY(100);
        diagonal2.setEndX(100);
        diagonal2.setEndY(200);
        group.getChildren().add(diagonal2);


        Rectangle rectangle = new Rectangle();
        rectangle.setX(300);
        rectangle.setY(10);
        rectangle.setWidth(200);
        rectangle.setHeight(300);
        rectangle.setFill(Color.DEEPPINK);
        rectangle.setStroke(Color.YELLOW);
        group.getChildren().add(rectangle);

        Line recDiagonal = new Line();
        recDiagonal.setStartX(300);
        recDiagonal.setStartY(10);
        recDiagonal.setEndX(500);
        recDiagonal.setEndY(310);
        group.getChildren().add(recDiagonal);

        Line recDiagonal2 = new Line();
        recDiagonal2.setStartX(500);
        recDiagonal2.setStartY(10);
        recDiagonal2.setEndX(300);
        recDiagonal2.setEndY(310);
        group.getChildren().add(recDiagonal2);

        Circle bigCircle = new Circle();
        bigCircle.setCenterX(400);
        bigCircle.setCenterY(600);
        bigCircle.setRadius(100);
        bigCircle.setFill(Color.YELLOW);
        group.getChildren().add(bigCircle);

        Circle eye1 = new Circle();
        eye1.setCenterX(360);
        eye1.setCenterY(570);
        eye1.setRadius(13);
        group.getChildren().add(eye1);

        Circle eye2 = new Circle();
        eye2.setCenterX(440);
        eye2.setCenterY(570);
        eye2.setRadius(13);
        group.getChildren().add(eye2);

        Line mouth = new Line();
        mouth.setStartX(370);
        mouth.setStartY(640);
        mouth.setEndX(430);
        mouth.setEndY(640);
        mouth.setStrokeWidth(10);
        group.getChildren().add(mouth);

        Circle cheek1 = new Circle();
        cheek1.setCenterX(330);
        cheek1.setCenterY(610);
        cheek1.setRadius(17);
        cheek1.setFill(Color.LIGHTPINK);
        group.getChildren().add(cheek1);

        Circle cheek2 = new Circle();
        cheek2.setCenterX(470);
        cheek2.setCenterY(610);
        cheek2.setRadius(17);
        cheek2.setFill(Color.LIGHTPINK);
        group.getChildren().add(cheek2);



        stage.show();


    }
}