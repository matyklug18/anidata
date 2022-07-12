package matyk.anidata.service;

import matyk.anidata.repo.TagsRepository;
import matyk.anidata.pojos.Tag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagsService {

    @Autowired
    private TagsRepository tagsRepo;

    public List<Tag> getTagByShowId(long id) {
        return tagsRepo.findByShowId(id);
    }
}
