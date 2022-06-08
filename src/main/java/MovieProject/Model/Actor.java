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
public class Actor {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int actor_ID;
    @Column
    private String name;
    @ManyToMany
            @JoinTable(name="performance")
    @JsonIgnoreProperties(value = {"actor"})
    List<Movie> movies;
}
