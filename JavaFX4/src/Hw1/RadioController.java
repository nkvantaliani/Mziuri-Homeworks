package Hw1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class RadioController {
    @FXML
    private Label result;
    @FXML
    private RadioButton cat, dog, bunny, bird;
    @FXML
    private TextField name;

    public void choose(){
        if(cat.isSelected()){
            result.setText("You choose cat, and name is " + name.getText());
        } else if(dog.isSelected()){
            result.setText("You choose dog, and name is " + name.getText());
        } else if(bunny.isSelected()){
            result.setText("You choose bunny, and name is " + name.getText());
        } else if(bird.isSelected()){
            result.setText("You choose bird, and name is " + name.getText());
        }
    }
}
