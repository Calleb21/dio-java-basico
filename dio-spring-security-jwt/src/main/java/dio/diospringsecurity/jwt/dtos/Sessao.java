package dio.diospringsecurity.jwt.dtos;

/**
 * Description of Sessao
 * Created by calle on 17/10/2023.
 */
public class Sessao {

    private String login;
    private String token;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
