package africa.semicolon.jijimoji.data.repositories;

import africa.semicolon.jijimoji.data.models.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepository extends MongoRepository<Listing, String> {
}
