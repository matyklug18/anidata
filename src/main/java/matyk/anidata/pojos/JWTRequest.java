package matyk.anidata.pojos;

import lombok.Data;

import java.io.Serializable;

//https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt

@Data
public class JWTRequest implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String username;
    private String password;
}