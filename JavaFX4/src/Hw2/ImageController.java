package Hw2;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageController {

    @FXML
    private ImageView imageView;

    private Image[] images = {
            new Image(getClass().getResourceAsStream("images/1.png")),
            new Image(getClass().getResourceAsStream("images/2.png")),
            new Image(getClass().getResourceAsStream("images/3.png")),
            new Image(getClass().getResourceAsStream("images/4.png")),
            new Image(getClass().getResourceAsStream("images/5.png")),
            new Image(getClass().getResourceAsStream("images/6.png")),
            new Image(getClass().getResourceAsStream("images/7.png")),
            new Image(getClass().getResourceAsStream("images/8.png")),
            new Image(getClass().getResourceAsStream("images/9.png")),
            new Image(getClass().getResourceAsStream("images/10.png"))
    };
    private int now = 0;

    @FXML
    public void first() {
        imageView.setImage(images[0]);
    }

    public void next() {
        if (now < 9) {
            now++;
            imageView.setImage(images[now]);
        }
    }
    public void previous() {
        if (now > 0) {
            now--;
            imageView.setImage(images[now]);
        }
    }
}