package matyk.anidata.pojos;

import lombok.Data;

import java.io.Serializable;

//https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt

@Data
public class JWTResponse implements Serializable {

    private static final long serialVersionUID = -8091879091924046844L;
    private final String jwttoken;
}