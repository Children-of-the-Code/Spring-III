package MovieProject.Controller;

import MovieProject.Model.Movie;
import MovieProject.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("movie")
public class MovieController {
    MovieService movieService;
    @Autowired
    public MovieController(MovieService movieService){
        this.movieService = movieService;
    }
    @PostMapping("{id}")
    public void saveMovie(@RequestBody Movie m, @PathVariable int id){
        movieService.saveMovie(m, id);
    }
    @GetMapping
    public List<Movie> getAllMovie(){
        return movieService.getAllMovies();
    }
    @GetMapping("{id}")
    public Movie getMovieById(@PathVariable int id){
        return movieService.getMovieById(id);
    }
}
