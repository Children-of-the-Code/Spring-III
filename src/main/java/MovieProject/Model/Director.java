package MovieProject.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

//first 4 annotations come from the lombok dependency
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Entity
public class Director {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int director_ID;
    @Column
    private String name;
//    the join column represents the column in our sql table that contains the foreign key which determines
//    our relationship
    @OneToMany(mappedBy = "director")
        @JsonIgnoreProperties(value = {"director"})
    List<Movie> movies;
}
