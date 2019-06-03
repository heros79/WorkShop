package am.work.shop.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 8107990792530283109L;

    public enum Role {
        ROLE_ADMIN, ROLE_USER
    }

    private Integer id;
    private String login;
    private String password;
    private String confirmPassword;
    private Role role;
}