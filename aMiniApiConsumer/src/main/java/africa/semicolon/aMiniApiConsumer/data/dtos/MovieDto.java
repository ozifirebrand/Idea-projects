package africa.semicolon.aMiniApiConsumer.data.dtos;

import java.time.LocalDateTime;
import java.util.List;

public class MovieDto {
    private String originalLanguage;
    private String originalTitle;
    private String posterPath;
    private double voteAverage;
    private String title;
    private String overview;
    private LocalDateTime releaseDate;
    private Boolean adult;
    private String backdropPath;
    private List<Long> genreIds;
    private int voteCount;
    private double popularity;
    private String mediaType;
}