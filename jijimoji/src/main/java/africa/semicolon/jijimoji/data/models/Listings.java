package africa.semicolon.jijimoji.data.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document ("Listings")
public class Listings {
    @Id
    private String id;
    private String name;
    private String shortDescription;
    private String longDescription;
    private LocalDateTime dateTime;
    private Condition condition;
    private Type type;

    //todo LISTING IS RELATED TO LISTER AND NOT THE OTHER WAY ROUND
    @DBRef
    private Lister lister;
}
