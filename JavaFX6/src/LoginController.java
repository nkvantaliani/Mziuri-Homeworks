import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class LoginController {
    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    private Label message;

    private Login login;

    public LoginController(){
        List<User> users = new ArrayList<>();
        users.add(new User("user", "user123"));
        login = new Login(users);

    }

    @FXML
    private void onLogin() {
        String username = this.username.getText();
        String password = this.password.getText();

        if (username.isEmpty()) {
            message.setText("enter username");
            return;
        } else if (password.isEmpty()) {
            message.setText("enter password");
            return;
            
        }

        if (login.loginMethod(username, password)) {
            message.setText("login successful");
        } else {
            message.setText("user is not registered");
        }
    }


}
