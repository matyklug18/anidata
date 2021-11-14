package matyk.anidata.repo;

import matyk.anidata.pojos.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UsersRepository {
    @Select("SELECT * FROM users")
    List<User> findAll();

    @Select("SELECT * FROM users WHERE id = #{id}")
    User findById(long id);

    @Select("SELECT * FROM users WHERE username = #{username}")
    User findByUsername(String username);
}