package MovieProject.DAO;

import MovieProject.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    @Query("FROM Movie where movie_ID = :movie_ID")
    public Movie findMovieById(@Param("movie_ID") int id);
}
