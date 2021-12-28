package matyk.anidata.service;

import matyk.anidata.pojos.Show;
import matyk.anidata.pojos.User;
import matyk.anidata.repo.ShowsRepository;
import matyk.anidata.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShowsService {

    @Autowired
    private ShowsRepository showsRepo;

    public List<Show> getAllShows() {
        return showsRepo.findAll();
    }

    public Show getShowById(long id) {
        return showsRepo.findById(id);
    }
}
