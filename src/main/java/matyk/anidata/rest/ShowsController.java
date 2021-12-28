package matyk.anidata.rest;

import matyk.anidata.pojos.Show;
import matyk.anidata.pojos.User;
import matyk.anidata.service.ShowsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/api/private/shows")
public class ShowsController {

    @Autowired
    private ShowsService showsService;

    @GetMapping("")
    public List<Show> shows() {
        return showsService.getAllShows();
    }

    @GetMapping("/{id}")
    public Show showById(@PathVariable int id) {
        return showsService.getShowById(id);
    }
}
