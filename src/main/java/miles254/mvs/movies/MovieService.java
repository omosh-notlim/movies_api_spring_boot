package miles254.mvs.movies;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class MovieService {
    @Autowired
    //to instanciate the class
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    //use optional to let java know that it can return a null
    public Optional<Movie> singleMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
