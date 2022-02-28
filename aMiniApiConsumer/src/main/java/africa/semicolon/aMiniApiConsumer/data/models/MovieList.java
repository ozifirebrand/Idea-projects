package africa.semicolon.aMiniApiConsumer.data.models;

import africa.semicolon.aMiniApiConsumer.data.dtos.Movie;
import lombok.Data;

import java.util.List;

@Data
public class MovieList {
    private int page;
    private List<Movie> results;
    private int totalPages;
    private int totalResults;

}
