package matyk.anidata.repo;

import matyk.anidata.pojos.Show;
import matyk.anidata.pojos.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShowsRepository {
    @Select("SELECT * FROM shows")
    List<Show> findAll();

    @Select("SELECT * FROM shows WHERE id = #{id}")
    Show findById(long id);

    @Select("SELECT * FROM shows WHERE title = #{title}")
    Show findByTitle(String title);
}