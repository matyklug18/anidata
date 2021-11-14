package matyk.anidata.service;

import matyk.anidata.repo.UsersRepository;
import matyk.anidata.pojos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepo;

    public List<User> getAllUsers() {
        return usersRepo.findAll();
    }

    public User getUserById(long id) {
        return usersRepo.findById(id);
    }
}
