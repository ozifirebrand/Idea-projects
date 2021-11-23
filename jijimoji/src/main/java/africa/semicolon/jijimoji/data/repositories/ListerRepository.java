package africa.semicolon.jijimoji.data.repositories;

import africa.semicolon.jijimoji.data.models.Lister;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListerRepository extends MongoRepository<Lister, String> {
}
