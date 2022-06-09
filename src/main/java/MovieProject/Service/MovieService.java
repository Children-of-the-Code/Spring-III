package MovieProject.Service;

import MovieProject.DAO.MovieRepository;
import MovieProject.Model.Director;
import MovieProject.Model.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MovieService {
    MovieRepository movieRepository;
    DirectorService directorService;
    @Autowired
    public MovieService(MovieRepository movieRepository, DirectorService directorService){
        this.movieRepository = movieRepository;
        this.directorService = directorService;
    }
    public void saveMovie(Movie m, int id){
        Director d = directorService.getDirectorById(id);
        m.setDirector(d);
        movieRepository.save(m);
    }
    public Director getDirectorByMovieId(int id){
        Movie m = getMovieById(id);
        return m.getDirector();
    }
    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }
    public Movie getMovieById(int id){
        return movieRepository.findMovieById(id);
    }
}
