package matyk.anidata.repo;

import matyk.anidata.pojos.Tag;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TagsRepository {
    @Select("SELECT * FROM tags WHERE show_id = #{id} ORDER BY amount DESC")
    List<Tag> findByShowId(long id);
}
