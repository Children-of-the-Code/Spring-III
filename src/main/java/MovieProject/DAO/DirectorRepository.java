package MovieProject.DAO;

import MovieProject.Model.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DirectorRepository extends JpaRepository<Director, Integer> {
//    java persistence query language
    @Query("FROM Director where director_ID = :director_ID")
    Director findDirectorByID(@Param("director_ID") int id);
}
