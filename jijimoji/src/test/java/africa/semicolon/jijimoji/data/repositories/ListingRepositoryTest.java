package africa.semicolon.jijimoji.data.repositories;

import africa.semicolon.jijimoji.data.models.Condition;
import africa.semicolon.jijimoji.data.models.Listing;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class ListingRepositoryTest {

    @Autowired
    private ListingRepository listingRepository;

    @Test
    public void saveListing(){
        Listing listing = new Listing();
        listing.setCondition(Condition.USED);
        listing.setName("Phone");
        listing.setShortDescription("A good phone");
        listing.setLongDescription("It makes sense for all your phone needs");
        Listing savedListing = listingRepository.save(listing);
        assertEquals("It makes sense for all your phone needs", savedListing.getLongDescription());
    }
}