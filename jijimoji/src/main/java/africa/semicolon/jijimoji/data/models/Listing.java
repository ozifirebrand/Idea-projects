package africa.semicolon.jijimoji.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
@Document ("Listing")

@Data
public class Listing {
    @Id
    private String id;
    private String name;
    private String shortDescription;
    private String longDescription;
    private LocalDateTime dateTime;
    private Condition condition;
    private String type;
    private int numberOfViews;

    //todo LISTING IS RELATED TO LISTER AND NOT THE OTHER WAY ROUND
    @DBRef
    private Lister lister;
}
