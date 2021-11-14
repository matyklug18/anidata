package matyk.anidata.rest;

import matyk.anidata.pojos.JWTRequest;
import matyk.anidata.pojos.JWTResponse;
import matyk.anidata.pojos.User;
import matyk.anidata.service.UsersService;
import matyk.anidata.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@CrossOrigin
@RestController
@RequestMapping(path="/api")
public class MainController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public List<User> users() {
        return usersService.getAllUsers();
    }

    @GetMapping("/user/{id}")
    public User userById(@PathVariable int id) {
        return usersService.getUserById(id);
    }

    //https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt

    @Autowired
    private AuthenticationManager auth;

    @Autowired
    private JWTUtil jwt;

    @Autowired
    private UserDetailsService userService;

    @PostMapping(value = "/auth")
    public ResponseEntity<?> authReq(@RequestBody JWTRequest req) throws Exception {
        //FIXME plaintext password in memory and over the network
        performAuth(req.getUsername(), req.getPassword());

        final UserDetails userDetails = userService.loadUserByUsername(req.getUsername());

        final String token = jwt.generateToken(userDetails);

        return ResponseEntity.ok(new JWTResponse(token));
    }

    private void performAuth(String username, String password) throws Exception {
        Objects.requireNonNull(username);
        Objects.requireNonNull(password);
        try {
            auth.authenticate(new UsernamePasswordAuthenticationToken(username, password));
        } catch (DisabledException e) {
            throw new Exception("USER_DISABLED", e);
        } catch (BadCredentialsException e) {
            throw new Exception("INVALID_CREDENTIALS", e);
        }
    }
}
