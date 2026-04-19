import java.util.List;

public class Login {
    private List<User> users;

    public Login(List<User> users) {
        this.users = users;
    }

    public boolean loginMethod(String username, String password) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.check(username, password)) {
                return true;
            }
        }
        return false;
    }
}