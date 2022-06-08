package MovieProject.Service;

import MovieProject.DAO.DirectorRepository;
import MovieProject.Model.Director;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DirectorService {
    DirectorRepository directorRepository;
    @Autowired
    public DirectorService(DirectorRepository directorRepository){
        this.directorRepository = directorRepository;
    }
    public void saveDirector(Director d){
        directorRepository.save(d);
    }
    public Director getDirectorById(int id){
        return directorRepository.findDirectorByID(id);
    }
    public List<Director> getAllDirectors(){
        return directorRepository.findAll();
    }

}
