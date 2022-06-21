package MovieProject.Controller;

import MovieProject.Model.Director;
import MovieProject.Service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("director")
public class DirectorController {
    DirectorService directorService;
    @Autowired
    public DirectorController(DirectorService directorService){
        this.directorService = directorService;
    }
    @PostMapping
    public void saveDirector(@RequestBody Director d){
        directorService.saveDirector(d);
    }
    @GetMapping
    public List<Director> getAllDirectors(){
        return directorService.getAllDirectors();
    }
    @GetMapping("{id}")
    public Director getDirectorById(@PathVariable int id){
        return directorService.getDirectorById(id);
    }

}
