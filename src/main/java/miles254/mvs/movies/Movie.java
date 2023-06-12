package miles254.mvs.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")

//sets get method for all; only available for the lombo package
@Data

//a constructor that takes all the privates as arguments
@AllArgsConstructor

//a constructor that takes no parameters
@NoArgsConstructor

public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    //an embeded relationship
    @DocumentReference
    //the above "@" ensures only the ids are stored and reviews stored in separate collection
    private List<Review> reviewIds;
}
