package matyk.anidata.service;


import matyk.anidata.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//https://www.techgeeknext.com/spring/spring-boot-security-token-authentication-jwt

@Service
public class JWTUserService implements UserDetailsService {

    @Autowired
    private UsersRepository users;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.findByUsername(username);
    }
}