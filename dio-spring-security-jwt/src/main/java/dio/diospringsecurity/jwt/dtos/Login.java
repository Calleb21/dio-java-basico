package dio.diospringsecurity.jwt.dtos;

/**
 * Description of Login
 * Created by calle on 17/10/2023.
 */
public class Login {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
