package matyk.anidata.rest;

import matyk.anidata.pojos.Tag;
import matyk.anidata.service.TagsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path="/api/private/tags")
public class TagsController {

	@Autowired
	private TagsService tagsService;

	@GetMapping("/{id}")
	public List<Tag> tagsByShowId(@PathVariable int id) {
		return tagsService.getTagByShowId(id);
	}
}
