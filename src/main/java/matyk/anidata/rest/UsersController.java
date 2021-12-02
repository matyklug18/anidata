package matyk.anidata.rest;

import matyk.anidata.pojos.User;
import matyk.anidata.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/api/private/users")
public class UsersController {

    @Autowired
    private UsersService usersService;

    @GetMapping("")
    public List<User> users() {
        return usersService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User userById(@PathVariable int id) {
        return usersService.getUserById(id);
    }
}
