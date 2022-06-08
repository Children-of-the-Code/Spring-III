package MovieProject.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Movie {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_ID;
    @Column
    private String title;
    @ManyToOne
    @JoinColumn(name = "director_ID")
    @JsonIgnoreProperties(value = {"movie"})
    public Director director;
    @ManyToMany
    @JsonIgnoreProperties(value = {"movies"})
    public List<Actor> cast;
}
